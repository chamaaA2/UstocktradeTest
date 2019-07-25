/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author CHAMATH
 */


public class Looper implements Runnable {
    

    private int start;
    private int end;

    public Looper(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i=start; i<end; i++){
            System.out.println("thread id : " + Thread.currentThread().getId() + "; index : " + i) ;
        }
        //if(Thread.currentThread().isAlive()){System.out.println("kdddddddddddddddddddddddddddddd");}
       
    }
    public static void main(String[] args){
        Thread looper1 = new Thread(new Looper(1,1000));
        Thread looper2 = new Thread (new Looper(1001,2000));
        looper1.start();
        looper2.start();
        
   }
}









//public class Looper implements Runnable {
//
//    private int start;
//    private int end;
//
//    public Looper(int start, int end){
//        this.start = start;
//        this.end = end;
//    }
//
//    @Override
//    public void run() {
//        for(int i=start; i<end; i++){
//            System.out.println("thread id : " + Thread.currentThread().getId() + "; index : " + i) ;
//        }
//        if(Thread.currentThread().isAlive()){System.out.println("k");}
//       
//    }
//}
//
//class Testutill {
//
//    public static void main(String[] args){
//        Thread looper1 = new Thread(new Looper(1,1000));
//        Thread looper2 = new Thread (new Looper(1001,2000));
//        looper1.start();
//        looper2.start();
//        
//   }
//}

