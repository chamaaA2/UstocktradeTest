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

public class OnlineResourceAdapter {

    HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
    public final Runnable typeA;
    public final Runnable typeB;
    Runtime rn = Runtime.getRuntime();
    static long startTime;
    static OnlineResourceAdapter x = new OnlineResourceAdapter();

    public OnlineResourceAdapter() {
        typeA = new Runnable() {
            public void run() {
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

                        // get information of type A
                        // return the data or directly store in OnlineResourceAdapter.
                    }
                    
                    new Thread(x.typeB).start();
                } catch (IOException e) {
                } finally {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        typeB = new Runnable() {
            public void run() {
                
                Set<Map.Entry<String, Integer>> entrySet = wordCountMap.entrySet();

                for (Map.Entry<String, Integer> entry : entrySet) {
                    System.out.print(entry.getKey() + ": ");
                    System.out.println(entry.getValue());
                }
            }
        };
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("///////////////////////////////////////");
        System.out.println(totalTime);}

    public static void main(String args[]) {
        startTime = System.nanoTime();
        new Thread(x.typeA).start(); // start A
        // start B

        
// <1>can be accessed here.
    }

}
