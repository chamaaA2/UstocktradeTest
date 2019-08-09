package Bufferreadtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BufferReaderpool extends Thread{
    
    

    @Override
    public void run() {

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\CHAMATH\\Desktop\\test.txt"),16384);
            
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
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
