/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

import DataStructure.leafnode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHAMATH one NODE can insert 3 values
 */
public class Bplustree1 {

    public static supprnode rootnode;

    public static boolean firstleafroot = true;
    keynode1 key = new keynode1();

    public static void main(String[] args) throws InterruptedException {
        Bplustree1 bt = new Bplustree1();

        bt.deletevaluetree(7);          //delete value in tree - delete from tree

        bt.insertvaluetree(5);
        bt.insertvaluetree(7);
        bt.insertvaluetree(4);

        bt.deletevaluetree(6);          //delete value in tree - delete from tree
        bt.deletevaluetree(5);          //delete value in tree - delete from tree
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

    public ArrayList<Integer>[] insertvaluetree(int a) {

        if (firstleafroot) {
            rootnode = new leafnode1();
            firstleafroot = false;
            key.arra.add((leafnode1) rootnode);
            rootnode = rootnode.insertvalues(a, key);
        } else {
            rootnode = rootnode.insertvalues(a, key);
        }
        /*       this belaow code for test case
       for Bplustree1 test class
         */

        int p = 0;
        ArrayList<Integer>[] myist = new ArrayList[key.arra.size()];
        for (leafnode1 obj : key.arra) {
            myist[p++] = obj.arr;
        }
        return myist;
    }

    public List<Integer>[] deletevaluetree(int a) {

        if (firstleafroot) {
            System.err.println("The Tree is Empty now.");
        } else {
            rootnode = rootnode.deletevalue(a, key);
        }

        /*       this belaow code for test case
       for Bplustree1 test class
         */
        int p = 0;
        ArrayList<Integer>[] myist = new ArrayList[key.arra.size()];
        for (leafnode1 obj : key.arra) {
            myist[p++] = obj.arr;
        }
        return myist;

    }

    public boolean findvaluetree(int a) {
        boolean isnuoftree = rootnode.findvalues(a, key);
        return isnuoftree;
    }

    private void printall() {

        System.err.println(key.al);
        for (leafnode1 obj : key.arra) {
            System.err.print(obj.arr);
        }
    }

}
