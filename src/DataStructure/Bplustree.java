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

    public static int MaxnodeReffsize = 4;
    public leafnode ln;
    public keynode kn;
    public static boolean isroot = true;

    public static void main(String[] args) {
        Bplustree bt = new Bplustree();
        bt.insertvaluetree(5);
        bt.insertvaluetree(6);
        bt.insertvaluetree(7);

    }

    public void insertvaluetree(int a) {
        int key = this.findekey(a);
        if (key == 0) {
            ln = new leafnode(a);
        } else {
        }

    }

    public int findekey(int a) {
        if (isroot) {
            isroot = false;
            return 0;
        } else if (ln.keyMin == 0) {
            return 0;
        }
        return 5;
    }

}
