package AndroidTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter extends Counter {

    @Override
    public int count(String fileForRead) {
        // TODO Auto-generated method stub
        Scanner file = null;
        int counter = 0;
        try {
            file = new Scanner(new File(fileForRead));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                counter += line.length();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!" + e.getStackTrace());

        } finally {
            if (file != null) {
                file.close();
            }
        }
        return counter;
    }

}
