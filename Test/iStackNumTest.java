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
public class iStackNumTest {
    
    public iStackNumTest() {
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
     * Test of push method, of class iStackNum.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        int c = 0;
        iStackNum instance = new iStackNumImpl();
        instance.push(c);
        if(instance.pop() != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class iStackNum.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        iStackNum instance = new iStackNumImpl();
        int expResult = 0;
        int result = instance.pop();
        assertEquals(expResult, result);
        if( result != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class iStackNum.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        iStackNum instance = new iStackNumImpl();
        int expResult = 0;
        int result = instance.top();
        assertEquals(expResult, result);
        if( result != 0)
            fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class iStackNum.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        iStackNum instance = new iStackNumImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        if(result)
            fail("The test case is a prototype.");
    }

    public class iStackNumImpl implements iStackNum {

        public void push(int c) {
        }

        public int pop() {
            return 0;
        }

        public int top() {
            return 0;
        }

        public boolean empty() {
            return false;
        }
    }
    
}
