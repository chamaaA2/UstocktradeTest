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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class clientsocket {

    String path;

    public clientsocket(int str) throws IOException {
        path = "C:\\Users\\CHAMATH\\Desktop\\write"+str+".txt";
        System.err.println(path);
        File file = new File(path);
        file.createNewFile();
        this.parseclient();
    }

    public void parseclient() throws IOException {
        Socket sock = new Socket("localhost", 5701);
        byte[] mybytearray = new byte[1024 * 32];
        InputStream is = sock.getInputStream();
        FileOutputStream fos = new FileOutputStream(path);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int bytesRead = is.read(mybytearray);
        bos.write(mybytearray, 0, bytesRead);
        bos.close();
        sock.close();
    }
}
