/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

import DataStructure.leafnode;

/**
 *
 * @author CHAMATH
 * one NODE can insert 3 values
 */
public class Bplustree1 {

    public static supprnode rootnode;

    public static boolean firstleafroot = true;
    keynode1 key = new keynode1();

    public static void main(String[] args) throws InterruptedException {
        Bplustree1 bt = new Bplustree1();

        bt.insertvaluetree(5);
        bt.insertvaluetree(7);
        bt.insertvaluetree(4);

        bt.findvaluetree(5);            // find values in tree

        bt.insertvaluetree(8);

        bt.findvaluetree(8);            // find values in tree

        bt.insertvaluetree(6);
        bt.insertvaluetree(5);
        bt.insertvaluetree(11);

        bt.findvaluetree(6);            // find values in tree
        bt.findvaluetree(12);            // find values in tree

        bt.insertvaluetree(13);
        bt.insertvaluetree(12);

        bt.findvaluetree(5);            // find values in tree

        bt.insertvaluetree(19);
        bt.insertvaluetree(20);
        bt.insertvaluetree(25);

        bt.insertvaluetree(9);
        bt.findvaluetree(100);            // find values in tree
        
        
        
        Thread.sleep(10);
        bt.printall();

        System.err.println("");
    }

    public void insertvaluetree(int a) {

        if (firstleafroot) {
            rootnode = new leafnode1();
            firstleafroot = false;
            key.arra.add((leafnode1) rootnode);
            rootnode = rootnode.insertvalues(a, key);
        } else {
            rootnode = rootnode.insertvalues(a, key);
        }

    }

    public void deletevaluetree(int a) {

    }

    public void findvaluetree(int a) {
        rootnode.findvalues(a, key);
    }

    private void printall() {

        System.err.println(key.al);
        for (leafnode1 obj : key.arra) {
            System.err.print(obj.arr);
        }

    }

}
