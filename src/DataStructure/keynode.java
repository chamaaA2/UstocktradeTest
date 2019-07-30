/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author CHAMATH
 */
public class keynode extends Suppernode {
    
   public boolean isrootkey = true;

   public ArrayList<leafnode> keyarr;

    public keynode(leafnode ln) {
        this.insertvalues(ln);
        
        
    }

    keynode() {
        System.err.println("");
    }

    @Override
    public void checkanddivide() {
        nodelevel = "s";

    }


    public void insertvalues(leafnode ln) {
        keyarr=new ArrayList<leafnode>();
        keyarr.add(ln);

    }

    public void findactuvalnode(int a,leafnode ln) {
 
    }

    public leafnode paternfind(){
        
    
    return null;
    }           


}
