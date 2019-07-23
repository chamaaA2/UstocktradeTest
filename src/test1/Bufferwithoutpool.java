/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author CHAMATH
 */
public class Bufferwithoutpool extends Thread {

    //find memory
    Runtime rn = Runtime.getRuntime();

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Bufferwithoutpool bwp = new Bufferwithoutpool();
        new Thread(bwp).run();
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("total time MS  :"+totalTime);
    }

    @Override
    public void run() {

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

            Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.print(entry.getKey() + ": ");
                System.out.println(entry.getValue());
            }
        } catch (IOException e) {
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
        System.out.println("get momory total    " + rn.totalMemory());
        System.out.println("g after    " + rn.freeMemory());
        System.out.print("used kkkknnnnnn       ");
        System.out.println(rn.totalMemory() - rn.freeMemory());
        System.out.println("");

    }
}
