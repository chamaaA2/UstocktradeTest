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
 * one contains one NODE 3 KEYS & 4 REFERENCE
 *
 */
public class Bplustree {

    public static leafnode ln;
    public static keynode keyroot;
    public boolean keyroottrue = true;
    public static boolean firstroot = true;
    public int p;

    public static void main(String[] args) {
        Bplustree bt = new Bplustree();

        bt.insertvaluetree(7);
        bt.insertvaluetree(4);

        bt.insertvaluetree(8);
        bt.insertvaluetree(5);
        bt.insertvaluetree(6);

       bt.insertvaluetree(5);
       
      // bt.insertvaluetree(5);
//        bt.insertvaluetree(2);
        ln.printq();

    }

    public void insertvaluetree(int a) {

        if (firstroot) {
            ln = new leafnode(a);
            firstroot = false;
        } else {
            ln.insertvalues(a);
        }

    }

}
