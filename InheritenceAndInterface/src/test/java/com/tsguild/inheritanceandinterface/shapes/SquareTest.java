/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.shapes;

import com.tsguild.inheritanceandinterface.shapes.Square;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SquareTest {
    
    public SquareTest() {
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
     * Test of Area method, of class Square.
     */
    @Test
    public void testArea1() {
        Square instance = new Square("red",10.0);
        double expResult = 100;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Square.
     */
    @Test
    public void testPerimeter() {
    Square instance = new Square("red",10.0);
        double expResult = 40.0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void test2Area() {
        Square instance = new Square("blue",8.0);
        double expResult = 64;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Square.
     */
    @Test
    public void test2Perimeter() {
    Square instance = new Square("blue",8.0);
        double expResult = 32.0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
    }
    
    @Test
    public void test3Area() {
        Square instance = new Square("fuchsia",0);
        double expResult = 0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Square.
     */
    @Test
    public void test3Perimeter() {
    Square instance = new Square("fuchsia",0);
        double expResult = 0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
    }
    
}
