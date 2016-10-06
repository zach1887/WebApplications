/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritenceandinterface.shapes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class TriangleTest {
    Triangle tri1 = new Triangle ("red",6, 8, 10);
    Triangle tri2 = new Triangle ("blue",8, 6, 10);
    Triangle tri3 = new Triangle ("yellow",8, 8, 8);
    Triangle tri4 = new Triangle ("green",7, 9, 12);
    Triangle tri5 = new Triangle ("orange",3, 7.1, 10);
    Triangle tri6 = new Triangle ("not a triangle at all",3,5,10);
    
    public TriangleTest() {
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
     * Test of Area method, of class Triangle.
     */
    @Test
    public void testArea() {
        Assert.assertEquals(0, tri6.Area());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void testPerimeter() {
        Assert.assertEquals(0, tri6.Perimeter());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
