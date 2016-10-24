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
public class TrimOneTest {

    TrimOne trim = new TrimOne();

    public TrimOneTest() {
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
        Assert.assertEquals("Result not as expected", "ell", trim.trimOne("Hello"));
        Assert.assertEquals("Result not as expected", "ell", trim.trimOne("XellX"));
        Assert.assertEquals("Result not as expected", "ell", trim.trimOne(" ell "));
    }

    @Test
    public void Test2() {
        Assert.assertEquals("Result not as expected", "av", trim.trimOne("java"));
        Assert.assertEquals("Result not as expected", "av", trim.trimOne(" ava"));
        Assert.assertEquals("Result not as expected", "av", trim.trimOne("jav "));
    }
    @Test
    public void Test3() {
        Assert.assertEquals("Result not as expected", "odin", trim.trimOne("coding"));
        Assert.assertEquals("Result not as expected", "coding", trim.trimOne(" coding "));
        Assert.assertEquals("Result not as expected", " coding ", trim.trimOne("  coding  "));
    }
    @Test
    public void Test4() {
        Assert.assertEquals("Result not as expected", "", trim.trimOne(""));
        Assert.assertEquals("Result not as expected", "", trim.trimOne(" "));
        Assert.assertEquals("Result not as expected", "", trim.trimOne("  "));
    }
    @Test
    public void Test5() {
        Assert.assertEquals("Result not as expected", "", trim.trimOne("1"));
        Assert.assertEquals("Result not as expected", "", trim.trimOne("11"));
        Assert.assertEquals("Result not as expected", "1", trim.trimOne("111"));
    }
    @Test
    public void Test6() {
        Assert.assertEquals("Result not as expected", "whatever", trim.trimOne("xwhateverx"));
        Assert.assertEquals("Result not as expected", "whatever", trim.trimOne("*whatever*"));
        Assert.assertEquals("Result not as expected", "whatever", trim.trimOne("mwhateverx"));
    }

}
