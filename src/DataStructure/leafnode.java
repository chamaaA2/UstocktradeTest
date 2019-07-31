/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.effect.BlendMode;

/**
 *
 * @author CHAMATH
 */
public class leafnode extends Suppernode implements Comparable<leafnode> {

    public static int MaxnodeReffsize = 3;

    int sec;
    public keynode rootkeynode;
    public keynode kn;
    public ArrayList<Integer> arr;
    public boolean firstkey = false;
    public boolean firstkeyroot;

    public leafnode(int k) {
        arr = new ArrayList<Integer>();
        this.insertvalues(k);
    }

    public leafnode(int one, int two) {

        arr = new ArrayList<Integer>();
        arr.add(0, one);
        arr.add(1, two);

    }

    @Override
    public void checkanddivide() {
        if (MaxnodeReffsize < arr.size()) {
            if (!firstkey) {

                key = arr.get(2);
                sec = arr.get(3);

                arr.remove(2);
                arr.remove(2);

                leafnode nln = new leafnode(key, sec);                           //create and devide leafe node when one leaf node is full

                kn = new keynode(this, nln);                                         //create a new key node
                rootkeynode = kn;
                firstkey = true;
                firstkeyroot = true;

//                System.err.println(arr);
//                System.err.println(nln.arr);
            } else {
                firstkey = true;
                firstkeyroot = true;
                key = arr.get(2);
                sec = arr.get(3);
                arr.remove(2);
                arr.remove(2);

                leafnode nln = new leafnode(key, sec);                                //create and devide leafe node when one leaf node is full

                kn.insertvalues(key, nln);

//                System.err.println(arr);
//                System.err.println(nln.arr);
            }
        }
    }

    public void insertvalues(int a) {
        leafnode scr = this.Searchkey(a);
        if (scr == null) {
            arr.add(a);
            Collections.sort(arr);
            this.checkanddivide();
        } else {

            scr.arr.add(a);
            Collections.sort(scr.arr);
            scr.checkanddivide();

            scr.keyupdate(a);
            System.err.println("key" + scr.key);
        }
    }

    public leafnode Searchkey(int a) {

        if (firstkeyroot) {
            return rootkeynode.paternfind(a);
        }
        return null;

    }

    public void insertkey() {

    }

    @Override
    public int compareTo(leafnode o) {
        if (key == o.key) {
            return 0;
        } else if (key > o.key) {
            return 1;
        } else {
            return -1;
        }
    }

    void printq() {
        if (!firstkey) {
            System.err.println(this.arr);
        } else {
            rootkeynode.printq();
        }
    }

    private void keyupdate(int a) {
        if (key < a) {
            key = a;

        }
    }
}
