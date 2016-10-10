/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

import com.mycompany.drills.logic.SpecialEleven;
import junit.framework.Assert;
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
public class SpecialElevenTest {

    SpecialEleven s11 = new SpecialEleven();

    public SpecialElevenTest() {
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
    public void test1() {

        Assert.assertTrue("Test 1 should return as true.", s11.specialEleven(22));
    }

    @Test
    public void test2() {

        Assert.assertTrue("Test 2 should return as true.", s11.specialEleven(23));
    }

    @Test
    public void test3() {

        Assert.assertFalse("Test 3 should return as false.", s11.specialEleven(24));
    }

    @Test
    public void test4() {

        Assert.assertTrue("Test 4 should return as true.", s11.specialEleven(22000));
    }

    @Test
    public void test5() {

        Assert.assertFalse("Test 5 should return as false.", s11.specialEleven(21999));
    }

    @Test
    public void test6() {

        Assert.assertTrue("Test 6 should return as true.", s11.specialEleven(22221));
    }

}
