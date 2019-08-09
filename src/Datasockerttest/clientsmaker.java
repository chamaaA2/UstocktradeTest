/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datasockerttest;

import java.io.IOException;

/**
 *
 * @author CHAMATH
 */
public class clientsmaker {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 4; i++) {
            new clientsocket(i);
        }
        
    }
}
