package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BufferReadSimpleProgramme {

    public static void main(String[] args) {

        // find runtime
        long startTime = System.nanoTime();

        //find memory
        Runtime rn = Runtime.getRuntime();

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\CHAMATH\\Desktop\\test.txt"));

            String currentLine = reader.readLine();
            while (currentLine != null) {

                String[] wordsbunch = currentLine.toLowerCase().trim().split(" ");
                for (String word : wordsbunch) {

                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }

                currentLine = reader.readLine();
            }

            Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();

            for (Entry<String, Integer> entry : entrySet) {
                System.out.print(entry.getKey() + ": ");
                System.out.println(entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(rn.totalMemory());
        System.out.println(rn.freeMemory());

        System.out.println(rn.totalMemory() - rn.freeMemory());

        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println(totalTime);
    }
}
