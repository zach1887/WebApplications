/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dao;

import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jesse
 */
public class DVDLibraryImplTest {

    DVDLibraryDao testDao;

    public DVDLibraryImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean(DVDLibraryImpl.class);
    }
    
    ArrayList<String> arr0 = new ArrayList<>();
    
        
    
//    DVD testDVD0 = new DVD(-1, "Casablanca",1942,"NR","Curtiz","Warner Bros", arr0);
//{"Second favorite movie of all time"}
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
