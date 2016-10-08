/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.shapes;

import com.tsguild.inheritanceandinterface.shapes.Triangle;
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
    Triangle tri1 = new Triangle ("red",3, 4, 5);
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
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 6, tri1.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void testPerimeter() {
         Assert.assertEquals("So be this shit", 12, tri1.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test2Area() {
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 24, tri2.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void test2Perimeter() {
         Assert.assertEquals("So be this shit", 24, tri2.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test3Area() {
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 27.7128, tri3.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void test3Perimeter() {
         Assert.assertEquals("So be this shit", 24, tri3.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test4Area() {
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 31.3050, tri4.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void test4Perimeter() {
         Assert.assertEquals("So be this shit", 28, tri4.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test5Area() {
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 3.23276, tri5.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void test5Perimeter() {
         Assert.assertEquals("So be this shit", 20.1, tri5.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void test6Area() {
//        Assert.assertEquals(6,tri1.Area(),.0001);
        Assert.assertEquals("This shit be fucked up", 0, tri6.Area(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Perimeter method, of class Triangle.
     */
    @Test
    public void test6Perimeter() {
         Assert.assertEquals("So be this shit", 0, tri6.Perimeter(), 0.001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
