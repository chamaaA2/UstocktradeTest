/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.effect.BlendMode;

/**
 *
 * @author CHAMATH
 */
public class leafnode1 extends supprnode implements Comparable<leafnode1> {

    public static int MaxnodeReffsize = 3;
    int sec;
    public ArrayList<Integer> arr;

    public leafnode1() {
        arr = new ArrayList<Integer>();

    }

    public leafnode1(int one, int two) {

        arr = new ArrayList<Integer>();
        arr.add(0, one);
        arr.add(1, two);

    }

    public supprnode checkanddivide(keynode1 keya) {

        if (MaxnodeReffsize < this.arr.size()) {

            key = arr.get(2);
            sec = arr.get(3);

            arr.remove(2);
            arr.remove(2);

            leafnode1 nln = new leafnode1(key, sec);

            keya.arra.add(nln);
            return keya;

        }
        return keya;
    }

    @Override
    public supprnode insertvalues(int a, keynode1 keya) {

        this.arr.add(a);
        Collections.sort(this.arr);
        supprnode sp = this.checkanddivide(keya);

        if (keya.arra.size() == 1) {
            return this;
        }

        System.err.println("key" + this.key);
        Collections.sort(keya.arra);
        keya.al.clear();
        keya.insertlistkeys();
        return sp;
    }

    @Override
    public int compareTo(leafnode1 o) {
        if (arr.get(0) == o.arr.get(0)) {
            return 0;
        } else if (arr.get(0) > o.arr.get(0)) {
            return 1;
        } else {
            return -1;
        }
    }

}
