/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author CHAMATH
 */
public class keynode1 extends supprnode {

    public ArrayList<leafnode1> arra;
    public List al = new ArrayList();

    keynode1(leafnode1 aThis, leafnode1 nln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    keynode1() {
        arra = new ArrayList<leafnode1>();
    }

    void insertvalues(int key, leafnode1 nln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    leafnode1 paternfind(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void printq() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    supprnode insertvalues(int a, keynode1 keya) {
        int p = Collections.binarySearch(al, a);
        leafnode1 ptnln;
        if (p >= 0) {
            ptnln = keya.arra.get(p);

        } else {
            ptnln = keya.arra.get((p + 1) * -1);

        }
        
        return ptnln.insertvalues(a, keya);

    }

    void insertlistkeys() {
        for (leafnode1 obj : this.arra) {
            al.add(obj.arr.get(0));
        }
        al.remove(0);

    }
}
