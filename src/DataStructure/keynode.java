/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author CHAMATH
 */
public class keynode extends Suppernode {

    leafnode leaf4;
    leafnode leaf5;
    public static int Maxkeysize = 4;
    public keynode rootkeynode;
    public boolean isrootkey = true;

    public ArrayList<leafnode> keyarr;
    public ArrayList<keynode> keyforoot;

    public keynode(leafnode first, leafnode second) {
        keyarr = new ArrayList<>();
        this.insertvalues(0, first);
        this.insertvalues(1, second);
        key = second.key;

    }

    public keynode(int n) {

    }

    keynode() {
        System.err.println("");
    }

    @Override
    public void checkanddivide() {
        if (Maxkeysize < this.keyarr.size()) {
            leaf4 = keyarr.get(3);
            leaf5 = keyarr.get(4);
          
            keyarr.remove(3);
            keyarr.remove(3);

            keynode newkey = new keynode(leaf4, leaf5);
            newkey.key = leaf4.key;

        }

    }

    public void insertvalues(int n, leafnode nln) {

        keyarr.add(nln);
        Collections.sort(keyarr);
        this.checkanddivide();
    }

    public void findactuvalnode(int a, leafnode ln) {

    }

    public leafnode paternfind(int a) {
        leafnode retob = null;
        for (leafnode obj : this.keyarr) {
            if (obj.key >= a) {
                retob = obj;
                break;
            } else {
                retob = obj;
                break;
            }
        }
        return retob;
    }

    private void sortleaf() {

    }

    public void printq() {
     
        for (leafnode obj : this.keyarr) {
            System.err.println(obj.arr);
        }
    }

}
