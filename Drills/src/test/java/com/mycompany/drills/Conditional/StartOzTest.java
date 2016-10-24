/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

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
public class StartOzTest {
    StartOz soz = new StartOz();
    
    public StartOzTest() {
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
     Assert.assertEquals("oz", soz.startOz("ozmandias"));
     }
     @Test
     public void Test2() {
     Assert.assertEquals("z", soz.startOz("bzoo"));
     }
     @Test
     public void Test3() {
     Assert.assertEquals("o", soz.startOz("oxx"));
     }
     @Test
     public void Test4() {
     Assert.assertEquals("oz", soz.startOz("ozItdoesnotmatterwhat I write here"));
     }
     @Test
     public void Test5() {
     Assert.assertEquals("z", soz.startOz(" zmandias"));
     }
     @Test
     public void Test6() {
     Assert.assertEquals("o", soz.startOz("oThe entire plot of Romeo and Juliet"));
     }
     @Test
     public void Test7() {
     Assert.assertEquals("o", soz.startOz("o xx"));
     }
     @Test
     public void Test8() {
     Assert.assertEquals("", soz.startOz("  Itdoesnotmatterwhat I write here"));
     }
     @Test
     public void Test9() {
     Assert.assertEquals("", soz.startOz("xxItdoesnotmatterwhat I write here"));
     }
}
