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

public class Bufferoneobject {

    HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
    public final Runnable typeA;
    public final Runnable typeB;
    Runtime rn = Runtime.getRuntime();
    static long startTime;
    static long endTime;
    static Bufferoneobject x = new Bufferoneobject();

    public Bufferoneobject() {
        typeA = new Runnable() {
            public void run() {
                BufferedReader reader = null;
                try {

                    reader = new BufferedReader(new FileReader("C:\\Users\\CHAMATH\\Desktop\\test.txt"), 16384);

                    StringBuilder sw = new StringBuilder();
                    char[] buffer = new char[1024 * 32];
                    int n = 0;
                    while ((n = reader.read(buffer)) != -1) {

                        String[] re = sw.append(buffer, 0, n).toString().toLowerCase().trim().split(" ", 0);

                        for (String word : re) {

                            if (wordCountMap.containsKey(word)) {
                                wordCountMap.put(word, wordCountMap.get(word) + 1);
                            } else {
                                wordCountMap.put(word, 1);
                            }
                        }

                        sw.setLength(0);
                        reader.read(buffer);

                    }

                    x.typeB.run();
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
                endTime = System.nanoTime();
                long totalTime = (endTime - startTime) / 1000000;
                System.out.println("Runtime    MS:");
                System.out.println(totalTime);

            }
        };

    }

    public static void main(String args[]) {
        startTime = System.nanoTime();
        x.typeA.run();// start A
        // start B

// <1>can be accessed here.
    }

}
