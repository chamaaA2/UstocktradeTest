/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bufferreadtest;

import java.io.*;
import java.util.HashMap;

class pipeReaderClass {

    static long startTime;
    static long endTime;
    //find memory
    Runtime rn = Runtime.getRuntime();
    HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
    
    
    
    
    
    public static void main(String args[]) throws Exception {
        final PipedOutputStream pout = new PipedOutputStream();
        final PipedInputStream pin = new PipedInputStream();

        pin.connect(pout);//connecting the streams  
        
//creating one thread t1 which writes the data  
        Thread t1 = new Thread() {
            public void run() {
                
                
                
                
                
                
                
                
                for (int i = 65; i <= 90; i++) {
                    try {
                        pout.write(i);
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                
                
                
                
                
                
                
            }
            
        };
//creating another thread t2 which reads the data  
        Thread t2 = new Thread() {
            public void run() {
                
                
                
                
                
                
                
                
                
                try {
                    for (int i = 65; i <= 90; i++) {
                        System.out.println(pin.read());
                    }
                } catch (Exception e) {
                }
                
                
                
                
                
                
                
            }
        };
//starting both threads  
        t1.start();
        t2.start();
    }
}
