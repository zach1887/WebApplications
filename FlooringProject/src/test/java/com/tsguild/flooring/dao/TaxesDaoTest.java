package com.tsguild.flooring.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class TaxesDaoTest {
    TaxesDaoImpl testDao;
   
    public TaxesDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {
        testDao = new TaxesDaoImpl();
        testDao.LoadFromFile();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void readValuesCorrectly() {
     Assert.assertEquals("OH should return 6.25", 6.25,testDao.getTaxRate("OH"),.001);
     Assert.assertEquals("PA should return 6.75", 6.75,testDao.getTaxRate("PA"),.001);
     Assert.assertEquals("MI should return 5.75", 5.75,testDao.getTaxRate("MI"),.001);
     Assert.assertEquals("IN should return 6.00", 6.00,testDao.getTaxRate("IN"),.001);
     }
     
     @Test
     public void doesStateExistTest() {
         Assert.assertTrue("IN exists!", testDao.doesStateExist("IN"));
         Assert.assertTrue("IL exists!", testDao.doesStateExist("IN"));
         Assert.assertTrue("IA exists!", testDao.doesStateExist("IN"));
         Assert.assertFalse("IX does not exist!", testDao.doesStateExist("IX"));
         Assert.assertTrue("PA exists!", testDao.doesStateExist("PA"));
         Assert.assertTrue("VI exists!", testDao.doesStateExist("VI"));
         Assert.assertFalse("ZZ does not exist!", testDao.doesStateExist("ZZ"));
     }
     @Test
     public void isStateListedTest() {
         Assert.assertTrue("IN is on the list", testDao.isStateListed("IN"));
         Assert.assertTrue("OH is on the list", testDao.isStateListed("OH"));
         Assert.assertTrue("MI is on the list", testDao.isStateListed("MI"));
         Assert.assertTrue("PA is on the list", testDao.isStateListed("PA"));
         Assert.assertFalse("null should be rejected", testDao.isStateListed(""));
         Assert.assertFalse("DE is not on the list", testDao.isStateListed("DE"));
         Assert.assertFalse("DC is not on the list", testDao.isStateListed("DC"));
         Assert.assertFalse("FL is not on the list", testDao.isStateListed("FL"));

     }
     
     
}
