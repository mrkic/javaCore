package AndroidTask;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        HashMap<String, Counter> objectMap = new HashMap<>();
        Counter lineCounter = new LineCounter();
        objectMap.put("-l", lineCounter);
        Counter wordCounter = new WordCounter();
        objectMap.put("-w", wordCounter);
        Counter characterCounter = new CharacterCounter();
        objectMap.put("-c", characterCounter);

        try {
            if (args.length == 1) {
                StringBuilder result = new StringBuilder();
                for (Map.Entry<String, Counter> counter : objectMap.entrySet()) {
                    result.append(counter.getValue().count(args[0]) + " ");

                }
                System.out.println(result);
            } else {
                System.out.println(objectMap.get(args[1]).count(args[0]));
            }
        } catch (IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e.getStackTrace());
        }
    }
}
