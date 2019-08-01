/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

/**
 *
 * @author CHAMATH
 */
public abstract class supprnode {
    int key;

    abstract supprnode insertvalues(int a,keynode1 keyroot) ;

    abstract boolean findvalues(int a,keynode1 keyroot);

    abstract supprnode deletevalue(int a, keynode1 keyroot);
    
}
