/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.shapes;

import com.tsguild.inheritanceandinterface.shapes.Rectangle;
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
public class RectangleTest {

    public RectangleTest() {
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
     * Test of Area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        Rectangle instance = new Rectangle("red",15, 10);
        double expResult = 150.0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Rectangle.
     */
    @Test
    public void testPerimeter() {
        Rectangle instance = new Rectangle("red", 15, 10);
        double expResult = 50.0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void test2Area() {
        Rectangle instance = new Rectangle("blue", 100, 0.001);
        double expResult = .1;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Rectangle.
     */
    @Test
    public void test2Perimeter() {
        Rectangle instance = new Rectangle("blue", 100, 0.001);
        double expResult = 200.002;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void test3Area() {
        Rectangle instance = new Rectangle("nonexistent", -2, 8);
        double expResult = 0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Rectangle.
     */
    @Test
    public void test3Perimeter() {
        Rectangle instance = new Rectangle("nonexistent", -2, 8);
        double expResult = 0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void test4Area() {
        Rectangle instance = new Rectangle("straightLine", 3, 0);
        double expResult = 0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Rectangle.
     */
    @Test
    public void test4Perimeter() {
        Rectangle instance = new Rectangle("straightLine", 3, 0);
        double expResult = 0;
        double result = instance.Perimeter();
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

}
