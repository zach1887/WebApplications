/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import com.mycompany.drills.logic.LoveSix;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jesse
 */
public class LoveSixTest {

    LoveSix ls = new LoveSix();

    public LoveSixTest() {
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

        Assert.assertTrue("Test 1 should be true", ls.loveSix(6, 4));

    }
    @Test
    public void Test2() {

        Assert.assertFalse("Test 2 should be false", ls.loveSix(4, 5));

    }
    @Test
    public void Test3() {

        Assert.assertTrue("Test 3 should be true", ls.loveSix(1, 5));

    }
    @Test
    public void Test4() {

        Assert.assertTrue("Test 4 should be true", ls.loveSix(6, 6));

    }
    @Test
    public void Test5() {

        Assert.assertFalse("Test 5 should be false", ls.loveSix(3, 8));

    }
    @Test
    public void Test6() {

        Assert.assertTrue("Test 6 should be true", ls.loveSix(9, 3));

    }
    @Test
    public void Test7() {

        Assert.assertTrue("Test 7 should be true", ls.loveSix(3, 9));

    }
    @Test
    public void Test8() {

        Assert.assertTrue("Test 8 should be true", ls.loveSix(3, 6));

    }
}
