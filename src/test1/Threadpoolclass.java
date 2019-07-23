/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

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

        System.out.println("gchamath     " + rn.totalMemory());
        System.out.println("get memory  after    " + rn.freeMemory());
        System.out.println("madn athan");
        System.out.println(rn.totalMemory() - rn.freeMemory());
        System.out.println("");

        long endTime = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println(totalTime);

    }

}
