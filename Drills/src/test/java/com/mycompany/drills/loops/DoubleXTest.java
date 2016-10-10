/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

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
public class DoubleXTest {

    DoubleX dx = new DoubleX();

    public DoubleXTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void Test1() {

        Assert.assertTrue("Not true as expected.", dx.doubleX("axxbb"));
    }
    @Test
    public void Test2() {

        Assert.assertFalse("Not false as expected.", dx.doubleX("axaxxax"));
    }
    @Test
    public void Test3() {

        Assert.assertTrue("Not true as expected.", dx.doubleX("xxxxx"));
    }
    @Test
    public void Test4() {

        Assert.assertFalse("Not false as expected.", dx.doubleX("abcdefgh"));
    }
    @Test
    public void Test5() {

        Assert.assertTrue("Not true as expected.", dx.doubleX("abc xx sdfsdfsdf"));
    }

}
