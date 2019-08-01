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
 */
public class Bplustree1 {

    public static supprnode rootnode;

    public static boolean firstleafroot = true;
    keynode1 key = new keynode1();

    public static void main(String[] args) {
        Bplustree1 bt = new Bplustree1();

        bt.insertvaluetree(5);
        bt.insertvaluetree(7);
        bt.insertvaluetree(4);

        bt.insertvaluetree(8);

        bt.insertvaluetree(6);
        bt.insertvaluetree(5);
        bt.insertvaluetree(11);
        bt.insertvaluetree(13);
        bt.insertvaluetree(12);

        bt.insertvaluetree(19);

        bt.insertvaluetree(20);
        bt.insertvaluetree(25);
        bt.insertvaluetree(9);

        bt.printall();

        System.err.println("");
    }

    public void insertvaluetree(int a) {

        if (firstleafroot) {
            rootnode = new leafnode1();
            firstleafroot = false;
            rootnode.key = a;
            key.arra.add((leafnode1) rootnode);
            rootnode = rootnode.insertvalues(a, key);
        } else {
            rootnode = rootnode.insertvalues(a, key);
        }

    }

    private void printall() {

        System.err.println(key.al);
        for (leafnode1 obj : key.arra) {
            System.err.print(obj.arr);
        }

    }

}
