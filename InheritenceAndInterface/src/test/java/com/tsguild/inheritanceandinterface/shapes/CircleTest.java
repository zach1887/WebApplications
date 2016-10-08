/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.shapes;

import com.tsguild.inheritanceandinterface.shapes.Circle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class CircleTest {
    
    public CircleTest() {
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
     * Test of Area method, of class Circle.
     */
    @Test
    public void testArea() {
        Circle instance = new Circle("black",3);
        double expResult = 9*Math.PI;
        double result = instance.Area();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Circle.
     */
    @Test
    public void testPerimeter() {
       Circle instance = new Circle("black",3);
        double expResult = 6*Math.PI;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void test2Area() {
        Circle instance = new Circle("grey",0);
        double expResult = 0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Circle.
     */
    @Test
    public void test2Perimeter() {
       Circle instance = new Circle("grey",0);
        double expResult = 0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void test3Area() {
        Circle instance = new Circle("gold",10);
        double expResult = 100*Math.PI;
        double result = instance.Area();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Circle.
     */
    @Test
    public void test3Perimeter() {
       Circle instance = new Circle("gold",10);
        double expResult = 20*Math.PI;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void test4Area() {
        Circle instance = new Circle("not a circle",-4);
        double expResult = 0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Circle.
     */
    @Test
    public void test4Perimeter() {
       Circle instance = new Circle("not a circle",-4);
        double expResult = 0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
