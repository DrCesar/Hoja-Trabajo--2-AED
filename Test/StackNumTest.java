/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wadeowen
 */
public class StackNumTest {
    
    public StackNumTest() {
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
     * Test of push method, of class StackNum.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int c = 0;
        StackNum instance = new StackNum();
        instance.push(c);
        if(instance.pop() != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackNum.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackNum instance = new StackNum();
        int c = 0;
        instance.push(c);
        int expResult = 0;
        int result = instance.pop();
        assertEquals(expResult, result);
        if(result != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class StackNum.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        StackNum instance = new StackNum();
        int c = 0;
        instance.push(c);
        int expResult = 0;
        int result = instance.top();
        assertEquals(expResult, result);
        if(result != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class StackNum.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackNum instance = new StackNum();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, !result);
        if(!result)
            fail("The test case is a prototype.");
    }
    
}
