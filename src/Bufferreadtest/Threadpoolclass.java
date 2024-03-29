/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bufferreadtest;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author CHAMATH
 */
public class Threadpoolclass {

 

    public static void main(String[] args) {

        // find runtime
        long startTime = System.nanoTime();

        //find memory
        Runtime rn = Runtime.getRuntime();

        ExecutorService executor = Executors.newFixedThreadPool(3);//creating a pool of 5 threads  

        Runnable buff = new BufferReaderpool();
  
        executor.execute(buff);
   
        executor.shutdown();
        while (!executor.isTerminated()) {
        }


        System.out.println("get memory before     " + rn.totalMemory());
        System.out.println("get memory  after    " + rn.freeMemory());
        System.out.println(rn.totalMemory() - rn.freeMemory());
        System.out.println("");
        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.print("runtime    MS:");
        System.out.println(totalTime);

    }

}
