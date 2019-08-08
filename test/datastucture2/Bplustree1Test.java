/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastucture2;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CHAMATH
 */
public class Bplustree1Test {

    Bplustree1 instance = new Bplustree1();

    public Bplustree1Test() {
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
     * Test of insertvaluetree method, of class Bplustree1.
     */
    @Test
    public void testInsertvaluetree() {
        System.out.println("insertvaluetree");
        ArrayList<Integer>[] myist = new ArrayList[1];
        myist[0] = new ArrayList<>();
        myist[0].add(0, 5);
        assertArrayEquals(myist, instance.insertvaluetree(5));
        myist[0].add(1, 6);
        assertArrayEquals(myist, instance.insertvaluetree(6));
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletevaluetree method, of class Bplustree1.
     */
    @Test

    public void testDeletevaluetree() {
        System.out.println("deletevaluetree");
        ArrayList<Integer>[] myist = new ArrayList[0];
        assertArrayEquals(myist, instance.deletevaluetree(7));

        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of findvaluetree method, of class Bplustree1.
     */
    @Test
    @Ignore
    public void testFindvaluetree() {
        
        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
