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
public class AltPairsTest {

    AltPairs altp = new AltPairs();

    public AltPairsTest() {
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
        Assert.assertEquals("kien", altp.altPairs("kitten"));
        Assert.assertEquals("Chole", altp.altPairs("Chocolate"));
        Assert.assertEquals("Congrr", altp.altPairs("CodingHorror"));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("ki", altp.altPairs("ki"));
        Assert.assertEquals("kitten", altp.altPairs("ki  tt  en  "));
        Assert.assertEquals("kittens", altp.altPairs("ki  tt  en  s"));
        Assert.assertEquals("kittens!", altp.altPairs("ki  tt  en  s!"));
        Assert.assertEquals("kittens!", altp.altPairs("ki  tt  en  s! "));
        Assert.assertEquals("kittens!", altp.altPairs("ki  tt  en  s!  "));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("Chole", altp.altPairs("Chocolate"));
        Assert.assertEquals("Chol", altp.altPairs("Chocolat"));
        Assert.assertEquals("Chol", altp.altPairs("Chocola"));
        Assert.assertEquals("Chol", altp.altPairs("Chocol"));
        Assert.assertEquals("Cho", altp.altPairs("Choco"));
        Assert.assertEquals("Ch", altp.altPairs("Choc"));
    }

    @Test
    public void Test4() {
        Assert.assertEquals("CongHoor", altp.altPairs("Coding  Horror"));
        Assert.assertEquals("Cong  rr", altp.altPairs("Coding    Horror"));
        Assert.assertEquals("Cong  Hoor", altp.altPairs("Coding      Horror"));
        Assert.assertEquals("  di  rr", altp.altPairs("  Coding  Horror"));
        Assert.assertEquals("  CongHoor", altp.altPairs("    Coding  Horror"));
        Assert.assertEquals("  di  rr", altp.altPairs("  Coding  Horror"));
    }
}
