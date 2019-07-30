/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import static DataStructure.Bplustree.MaxnodeReffsize;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CHAMATH
 */
public class leafnode extends Suppernode {

    int keyMax;
    int keyMin;
    int sec;
    public keynode kn;
    public ArrayList<Integer> arr;
    public boolean firstkey = false;

    public leafnode(int k) {
        arr = new ArrayList<Integer>();
        this.insertvalues(k);
    }

    public leafnode(int one, int two) {

        arr = new ArrayList<Integer>();
        arr.add(0, one);
        arr.add(1, two);
        keyMin = one;
    }

    @Override
    public void checkanddivide() {
        if (MaxnodeReffsize < arr.size()) {
            if (!firstkey) {

                keyMax = arr.get(MaxnodeReffsize / 2);
                sec = arr.get((MaxnodeReffsize / 2) + 1);

                kn = new keynode(this);                                                 //create a new key node
                firstkey = true;

                arr.remove(MaxnodeReffsize / 2);
                arr.remove((MaxnodeReffsize / 2) + 1);

                leafnode nln = new leafnode(keyMax, sec);                           //create and devide leafe node when one leaf node is full
                
                
                kn.insertvalues(nln);
                
                
                
                
                System.err.println(arr);
                System.err.println(nln.arr);

            } else {

                keyMax = arr.get(MaxnodeReffsize / 2);
                sec = arr.get((MaxnodeReffsize / 2) + 1);
                arr.remove(MaxnodeReffsize / 2);
                arr.remove((MaxnodeReffsize / 2) + 1);

                leafnode nln = new leafnode(keyMax, sec);                                 //create and devide leafe node when one leaf node is full

                
                
                kn.insertvalues(nln);
                
                
               

                
                
                System.err.println(arr);
                System.err.println(nln.arr);

            }
        } else {
            System.err.println("");
        }
    }

   
    public void insertvalues(int a) {
        leafnode scr = this.Searchkey();
        if (scr == null) {
            arr.add(a);
            Collections.sort(arr);
            this.checkanddivide();
        } else {

        }
    }

    public leafnode Searchkey() {

        if (firstkey) {
           leafnode pln = kn.paternfind();
        }
        return null;

    }

    public void insertkey() {

    }

}
