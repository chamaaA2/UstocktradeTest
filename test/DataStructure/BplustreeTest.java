/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CHAMATH
 */
public class BplustreeTest {

    public BplustreeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insertvaluetree method, of class Bplustree.
     */
    @Test
    public void testInsertvaluetree() {
        System.out.println("insertvaluetree");
        int a = 0;
        Bplustree instance = new Bplustree();
        int expResult = 4;
        int result = instance.insertvaluetree(a);
        assertEquals(expResult, result);
        System.err.println("sssssssss");
        assertEquals(4, result);
        System.err.println(".sdada");

    }

}
