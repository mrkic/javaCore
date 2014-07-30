package ASCII;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class ASCII {
    private BufferedImage image;
    private final static int columns = 140;
    private int scale;
    
    public ASCII(File file) throws IOException {
        image = ImageIO.read(file);
        if (image.getWidth() > columns) {
            scale = image.getWidth() / columns + 1;
        } else {
            scale = 1;
        }
    }

    private int BlockIntensity(int x, int y) {
        int averageIntensity = 0;
        for (int i = x; i < scale + x; i++) {
            for (int j = y; j < scale + y; j++) {
                averageIntensity += Intensity(i, j);
            }
        }
        return averageIntensity / (scale * scale);
    }

    private int Intensity(int x, int y) {
        Color color = new Color(this.image.getRGB(x, y), false);
        int intensity = (color.getBlue() + color.getRed() + color.getGreen()) / 3;
        return intensity;
    }

    private String pixelsToChar(int intensity){
        if (intensity >= 240) {
            return ".";
        } else if (intensity >= 200 && intensity < 240) {
            return " ";
        } else if (intensity >= 160 && intensity < 200) {
            return "*";
        } else if (intensity >= 120 && intensity < 160) {
            return "#";
        } else if (intensity >= 80 && intensity < 120) {
            return "_";
        } else if (intensity >= 40 && intensity < 80) {
            return "+";
        }
        return "$";
    }

    public String toString() {
        String output = "";
        for (int y = 0; y < this.image.getHeight() - scale; y += scale) {
            for (int x = 0; x < this.image.getWidth() - scale; x += scale) {
                output += pixelsToChar(BlockIntensity(x, y));
            }
            output += "\n";
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Enter path file(example:C:/Users/....smth.jpg):");   // C:/Users/IVAN/Desktop/proba1.jpg 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ASCII viewer = new ASCII(new File(reader.readLine()));
        System.out.println(viewer.toString());
    }
}