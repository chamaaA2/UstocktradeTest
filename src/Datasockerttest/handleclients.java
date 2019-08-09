/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datasockerttest;

/**
 *
 * @author CHAMATH
 */
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class handleclients implements Runnable {

    private BufferedInputStream bis;
    private byte[] bar;
    private Socket skt;
    private int length;
    public handleclients(Socket skt, BufferedInputStream bis, int length) {
        this.skt = skt;
        this.bis = bis;
        this.length=length;
        
    }

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName());
      bar  = new byte[length];
        try {
            bis.read(bar);
            OutputStream os = skt.getOutputStream();
            os.write(bar);
            os.flush();
            os.close();

        } catch (IOException ex) {
            ex.printStackTrace();
            try {
                skt.close();
                bis.close();
            } catch (IOException ex1) {
                Logger.getLogger(handleclients.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        try {
            skt.close();
            bis.close();
        } catch (IOException ex1) {
            Logger.getLogger(handleclients.class.getName()).log(Level.SEVERE, null, ex1);
        }

    }

}
