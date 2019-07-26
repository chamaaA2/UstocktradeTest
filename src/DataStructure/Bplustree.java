/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author CHAMATH
 *
 *
 * one contains NODE 3 KEYS & 4 REFERENCE
 *
 */
public class Bplustree {

    
    public static boolean isroot = false;

    public static void main(String[] args) {
        Bplustree bt = new Bplustree();
        bt.insertvalue(5);
        

    }

    public void insertvalue(int a) {
        if (isroot) {
            leafnode ln = new leafnode();
            ln.insertvalues(a);
            isroot=true;
        }

    }

}
