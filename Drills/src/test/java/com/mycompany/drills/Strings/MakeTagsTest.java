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
public class MakeTagsTest {
    MakeTags mt = new MakeTags();
    public MakeTagsTest() {
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
         
         Assert.assertEquals("Ouptut not as expected", "<i>Yay</i>",mt.makeTags("i", "Yay"));
         
     }
     @Test
     public void Test2() {
           Assert.assertEquals("Ouptut not as expected", "<i>Hello</i>",mt.makeTags("i", "Hello"));
     }
     @Test
     public void Test3() {
           Assert.assertEquals("Ouptut not as expected", "<cite>Hello</cite>",mt.makeTags("cite", "Hello"));
     }
     @Test
     public void Test4() {
           Assert.assertEquals("Ouptut not as expected", "<cite> </cite>",mt.makeTags("cite", " "));
     }
     @Test
     public void Test5() {
           Assert.assertEquals("Ouptut not as expected", "<cite></cite>",mt.makeTags("cite", ""));
     }
          @Test
     public void Test6() {
           Assert.assertEquals("Ouptut not as expected", "< >Hello</ >",mt.makeTags(" ", "Hello"));
     }
     @Test
     public void Test7() {
           Assert.assertEquals("Ouptut not as expected", "<>Hello</>",mt.makeTags("", "Hello"));
     }
}
