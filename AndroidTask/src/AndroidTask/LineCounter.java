package AndroidTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter extends Counter {

    @Override
    public int count(String fileForRead) {
        // TODO Auto-generated method stub
        Scanner file = null;
        int counter = 0;
        try {
            file = new Scanner(new File(fileForRead), "UTF-8");

            while (file.hasNextLine()) {
                counter++;
                file.nextLine();
            }
        } catch (FileNotFoundException e) {

            System.out.println("File not found");

        } finally {
            if (file != null) {
                file.close();
            }
        }

        return counter;
    }

}
