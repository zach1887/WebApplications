/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

import com.mycompany.drills.Strings.RemoveDel;
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
public class RemoveDelTest {

    RemoveDel rd = new RemoveDel();

    public RemoveDelTest() {
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
        Assert.assertEquals("Test 1 should output abc","abc", rd.removeDel("adelbc"));

    }
    @Test
    public void Test2() {
        Assert.assertEquals("Test 2 should output aHello.", "aHello", rd.removeDel("adelHello"));

    }
    @Test
    public void Test3() {
        Assert.assertEquals("Test 3 should output dXX3.", "dXX3", rd.removeDel("ddelXX3"));

    }
    @Test
    public void Test4() {
        Assert.assertEquals("Test 4 should output adedbc.", "adedbc", rd.removeDel("adedbc"));

    }
    @Test
    public void Test5() {
        Assert.assertEquals("Test 5 should output aadel335.", "aadel335", rd.removeDel("aadel335"));

    }
    @Test
    public void Test6() {
        Assert.assertEquals("Test 6 should output aaadel335.", "aaadel335", rd.removeDel("aaadel335"));

    }
    @Test
    public void Test7() {
        Assert.assertEquals("Test 7 should output del335.", "del335", rd.removeDel("del335"));

    }

}
