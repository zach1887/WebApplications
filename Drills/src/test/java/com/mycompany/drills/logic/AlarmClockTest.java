/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

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
public class AlarmClockTest {
    AlarmClock alarm = new AlarmClock();
    public AlarmClockTest() {
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
         Assert.assertEquals("Result not as expected","7:00",alarm.alarmClock(1, false));
         Assert.assertEquals("Result not as expected","7:00",alarm.alarmClock(2, false));
         Assert.assertEquals("Result not as expected","7:00",alarm.alarmClock(3, false));
         Assert.assertEquals("Result not as expected","7:00",alarm.alarmClock(4, false));
         Assert.assertEquals("Result not as expected","7:00",alarm.alarmClock(5, false));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(6, false));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(0, false));
     }
     @Test
     public void Test2() {
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(1, true));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(2, true));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(3, true));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(4, true));
         Assert.assertEquals("Result not as expected","10:00",alarm.alarmClock(5, true));
         Assert.assertEquals("Result not as expected","off",alarm.alarmClock(6, true));
         Assert.assertEquals("Result not as expected","off",alarm.alarmClock(0, true));
     }
}
