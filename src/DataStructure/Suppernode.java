/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.ArrayList;

/**
 *
 * @author CHAMATH
 */
public  abstract class Suppernode {

    public Suppernode root;
    public String nodelevel;
    public ArrayList<String> ars;
    abstract public void autodivide();

    abstract public void insertvalues(int a);

}
