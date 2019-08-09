/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datasockerttest;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class serversocket {

    public static void main(String[] args) throws IOException {
        ServerSocket servsock = new ServerSocket(5701);
        File myFile = new File("C:\\Users\\CHAMATH\\Desktop\\read.txt");
        ExecutorService pool = Executors.newFixedThreadPool(2);
        while (true) {
            Socket sock = servsock.accept();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));

            Runnable trd = new handleclients(sock, bis, (int) myFile.length());
            pool.execute(trd);

        }
    }
}
