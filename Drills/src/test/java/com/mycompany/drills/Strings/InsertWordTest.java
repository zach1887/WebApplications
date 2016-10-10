/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

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
public class InsertWordTest {
    InsertWord iw = new InsertWord();
    
    public InsertWordTest() {
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
     Assert.assertEquals("Output not as expected", "<<Yay>>", iw.insertWord("<<>>", "Yay"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("Output not as expected", "<<Woohoo>>", iw.insertWord("<<>>", "Woohoo"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("Output not as expected", "[[Word]]", iw.insertWord("[[]]", "Word"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("Output not as expected", "  Yay  ", iw.insertWord("    ", "Yay"));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("Output not as expected", " [Yay ]", iw.insertWord(" [ ]", "Yay"));
     }

}
