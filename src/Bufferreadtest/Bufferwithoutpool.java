/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bufferreadtest;

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
public class Bufferwithoutpool implements Runnable {

    static long startTime;
    static long endTime;
    //find memory
    Runtime rn = Runtime.getRuntime();

    public static void main(String[] args) {
        startTime = System.nanoTime();
        Bufferwithoutpool bwp = new Bufferwithoutpool();
        bwp.run();
        endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("total time MS  :" + totalTime);
    }

    @Override
    public void run() {

        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\CHAMATH\\Desktop\\test.txt"), 16384); //16 KB Buffersize changed

            StringBuilder sw = new StringBuilder();
            char[] buffer = new char[1024];
            int n = 0;
            while ((n = reader.read(buffer)) != -1) {

                String[] re = sw.append(buffer, 0, n).toString().toLowerCase().trim().split("\\s+", 0);

                for (String word : re) {

                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }

                sw.setLength(0);
               
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
        System.out.println("get memory before     " + rn.totalMemory());
        System.out.println("get memory  after    " + rn.freeMemory());
        System.out.println(rn.totalMemory() - rn.freeMemory());
        System.out.println("");
    }
}
