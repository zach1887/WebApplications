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
public class DoNotYakTest {
    DoNotYak dny = new DoNotYak();
    public DoNotYakTest() {
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
         Assert.assertEquals("Results not as expected","pak",dny.doNotYak("yakpak"));
         Assert.assertEquals("Results not as expected","pak",dny.doNotYak("pakyak"));
         Assert.assertEquals("Results not as expected","123ya",dny.doNotYak("yak123ya"));
     }
     @Test
     public void Test2() {
         Assert.assertEquals("Results not as expected","pak",dny.doNotYak("yakpakyakyak"));
         Assert.assertEquals("Results not as expected","pak",dny.doNotYak("pakyakyakyak"));
         Assert.assertEquals("Results not as expected","123ya",dny.doNotYak("yakyakyak123yakyakyakyakya"));
     }
     @Test
     public void Test3() {
         Assert.assertEquals("Results not as expected","paky",dny.doNotYak("yakpaky"));
         Assert.assertEquals("Results not as expected","ypaky",dny.doNotYak("ypakyaky"));
         Assert.assertEquals("Results not as expected","123123123123ya",dny.doNotYak("123123123yak123ya"));
     }
     @Test
     public void Test4() {
         Assert.assertEquals("Results not as expected","",dny.doNotYak("yak"));
         Assert.assertEquals("Results not as expected","",dny.doNotYak("yakyakyak"));
         Assert.assertEquals("Results not as expected","",dny.doNotYak(""));
         Assert.assertEquals("Results not as expected"," ",dny.doNotYak(" "));
         Assert.assertEquals("Results not as expected","  ",dny.doNotYak("  "));
     }
     @Test
     public void Test5() {
         Assert.assertEquals("Results not as expected","m",dny.doNotYak("m"));
         Assert.assertEquals("Results not as expected","mm",dny.doNotYak("mm"));
         Assert.assertEquals("Results not as expected","mmm",dny.doNotYak("mmm"));
         Assert.assertEquals("Results not as expected","mmmm",dny.doNotYak("mmmm"));
         Assert.assertEquals("Results not as expected","mmmm",dny.doNotYak("mmmmyak"));
     }
}
