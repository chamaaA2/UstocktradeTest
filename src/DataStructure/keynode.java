/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author CHAMATH
 */
public class keynode extends Suppernode {
    @Override
    public void autodivide() {
        nodelevel = "s";
    }

    @Override
    public void insertvalues(int a) {
        arr = new ArrayList<Integer>();
        arr.add(a);
        Collections.sort(arr);
       
    }

}
