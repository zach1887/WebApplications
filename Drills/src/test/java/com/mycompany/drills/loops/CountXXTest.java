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
public class CountXXTest {
    CountXX cx = new CountXX();
    public CountXXTest() {
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
     
     Assert.assertEquals("Output is incorrect",1,cx.countXX("abcxx"));
}
     @Test
     public void Test2() {
     
     Assert.assertEquals("Output is incorrect",2,cx.countXX("xxx"));
}
     @Test
     public void Test3() {
     
     Assert.assertEquals("Output is incorrect",3,cx.countXX("xxxx"));
}
     @Test
     public void Test4() {
     
     Assert.assertEquals("Output is incorrect",2,cx.countXX("xx xx"));
}
     @Test
     public void Test5() {
     
     Assert.assertEquals("Output is incorrect",0,cx.countXX("x1x1x1x1x1x1x1x1x"));
}
     @Test
     public void Test6() {
     
     Assert.assertEquals("Output is incorrect",8,cx.countXX("xxxxxxxxx"));
}
}
