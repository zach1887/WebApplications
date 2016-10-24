/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class MinCatTest {

    MinCat mc = new MinCat();

    public MinCatTest() {
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
    //
    @Test
    public void Test1() {
        Assert.assertEquals("Result not as expected", "loHi", mc.minCat("Hello", "Hi"));
        Assert.assertEquals("Result not as expected", "HiHe", mc.minCat("Hi", "Hello"));
        Assert.assertEquals("Result not as expected", "HelloHello", mc.minCat("Hello", "Hello"));
        Assert.assertEquals("Result not as expected", "HiHi", mc.minCat("Hi", "Hi"));
        Assert.assertEquals("Result not as expected", "HiXX", mc.minCat("Hi", "XX"));
        Assert.assertEquals("Result not as expected", "XXHi", mc.minCat("XX", "Hi"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "ellojava", mc.minCat("Hello", "java"));
        Assert.assertEquals("Result not as expected", "llojav", mc.minCat("Hello", "jav"));
        Assert.assertEquals("Result not as expected", "loja", mc.minCat("Hello", "ja"));
        Assert.assertEquals("Result not as expected", "xxxxjava", mc.minCat("Helloxxxxxxxxxxxxxx", "java"));
        Assert.assertEquals("Result not as expected", "ellojava", mc.minCat("xxxxxxxxHello", "java"));
        Assert.assertEquals("Result not as expected", "Hellojavax", mc.minCat("Hello", "javaxxxxxxxxxxxxxxxxxxxxxx"));
        Assert.assertEquals("Result not as expected", "Hj", mc.minCat("H", "javaxxxxxxxxxxxxxxxxxxxxxx"));
        Assert.assertEquals("Result not as expected", "", mc.minCat("", "javaxxxxxxxxxxxxxxxxxxxxxx"));
        Assert.assertEquals("Result not as expected", " j", mc.minCat(" ", "javaxxxxxxxxxxxxxxxxxxxxxx"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "javaHell", mc.minCat("java", "Hello"));
        Assert.assertEquals("Result not as expected", "javaHell", mc.minCat("java", "Hell"));
        Assert.assertEquals("Result not as expected", "avaHel", mc.minCat("java", "Hel"));
        Assert.assertEquals("Result not as expected", "aH", mc.minCat("java", "H"));
        Assert.assertEquals("Result not as expected", "", mc.minCat("java", ""));
        Assert.assertEquals("Result not as expected", "a ", mc.minCat("java", " "));
        Assert.assertEquals("Result not as expected", "va  ", mc.minCat("java", "  "));
    }
}
