package AndroidTask;

import java.io.File;
import java.util.Scanner;

public class WordCounter extends Counter {

    @Override
    public int count(String fileForRead) {
        // TODO Auto-generated method stub
        Scanner file = null;
        int counter = 0;
        try {
            file = new Scanner(new File(fileForRead));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] wordsInLine = line.split(" ");
                for (int i = 0; i < wordsInLine.length; i++) {
                    if (!"".equals(wordsInLine[i]) && !" ".equals(wordsInLine[i])) {
                        
                        counter++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File not found");
        } finally {
            if (file != null) {
                file.close();
            }
        }
        return counter;
    }

}
