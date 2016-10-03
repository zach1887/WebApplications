/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.MethodDrills.logic;

import junit.framework.Assert;
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
public class AreInOrderTest {

    AreInOrder inOrd = new AreInOrder();

    public AreInOrderTest() {
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

    @Test
    public void Test1() {

        Assert.assertTrue("Test 1 should be true.", inOrd.areInOrder(1, 2, 4, false));

    }

    @Test
    public void Test2() {

        Assert.assertFalse("Test 2 should be false.", inOrd.areInOrder(1, 2, 1, false));

    }
    @Test
    public void Test3() {

        Assert.assertTrue("Test 3 should be true.", inOrd.areInOrder(1, 1, 2, true));

    }
    @Test
    public void Test4() {

        Assert.assertFalse("Test 4 should be false.", inOrd.areInOrder(1, 1, 2, false));

    }
    @Test
    public void Test5() {

        Assert.assertTrue("Test 5 should be true.", inOrd.areInOrder(3, 3, 3, true));

    }
    @Test
    public void Test6() {

        Assert.assertFalse("Test 6 should be false.", inOrd.areInOrder(4, 4, 4, false));

    }
}
