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
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serversocket {

    public static void main(String[] args) throws IOException {
        ServerSocket servsock = new ServerSocket(5701);
        File myFile = new File("C:\\Users\\CHAMATH\\Desktop\\read.txt");
        while (true) {
            Socket sock = servsock.accept();
            byte[] mybytearray = new byte[(int) myFile.length()];
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(myFile));
            Thread trd = new handleclients(sock,bis,mybytearray);
            trd.start();

        }
    }
}
