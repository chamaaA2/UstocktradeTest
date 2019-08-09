/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bufferreadtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author CHAMATH
 */
public class fileDecriptorClass implements Runnable {

    static long startTime;
    static long endTime;
    //find memory
    Runtime rn = Runtime.getRuntime();

    public static void main(String[] args) {
        startTime = System.nanoTime();
        fileDecriptorClass bwp = new fileDecriptorClass();
        bwp.run();
        endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("total time MS  :" + totalTime);
    }

    @Override
    public void run() {
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        FileInputStream reader = null;
        try {
            reader = new FileInputStream(new File("C:\\Users\\CHAMATH\\Desktop\\test.txt")); //16 KB Buffersize changed
            reader.getFD().sync();
            StringBuilder sw = new StringBuilder();
            int m = 0;
            String str = null;
            while ((m = reader.read()) != -1) {
                if ((m != 13) && (m != 10)) {
                    if (m != 32) {
                        char p = (char) m;
                        sw.append(p);
                    } else {
                        str = sw.toString();
                        if (wordCountMap.containsKey(str)) {
                            wordCountMap.put(str, wordCountMap.get(str) + 1);
                            sw.setLength(0);
                        } else {
                            wordCountMap.put(str, 1);
                            sw.setLength(0);
                        }
                    }

                }
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
