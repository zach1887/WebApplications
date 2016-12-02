/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vendingmachinewebapp.dao;

import com.tsguild.vendingmachinewebapp.dto.Item;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ahill
 */
public class VendingDaoImplTest {

    ItemDao testDao;

    public VendingDaoImplTest() {
    }

    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean(DaoJdbcImpl.class);
    }

//    public Trip(int tripId, String monthOfTrip, int yearOfTrip, String destCity, String destCountry, 
    //            int lengthDays, boolean tripOverseas, String otherCitiesVisited)

    /**
     * Test Spec Rundown
     *
     * Add Pet: add new pet add/'replace' pet add similar pet add several pets
     *
     * Remove Pet: remove existing pet remove non-existent pet remove 'similar'
     * pet remove existing pet twice
     *
     * Get All Pets
     *
     * never null empty list on empty list after add new matches size count + 1,
     * and contains added pet list after 'replace' matches previous size count
     * and contains replaced pet, not original list after add similar, matches
     * prev size + 1, and contains both 'similar' list after remove 1 is
     * decremented in size and does not contain removed list after remove
     * nonexisting does not change list after remove twice only removes the one
     * pet
     *
     * Get Pet get on non-existent returns null get after add new returns new
     * pet get after pet replaced returns replaced pet get after add similar
     * returns similar, not original get after a pet remove returns null get
     * after a similar pet removed similar returns original get after a pet
     * removed twice returns null
     *
     */
    @Test
    public void addOneToEmptyDaoTest() {
   
    }

    @Test
    public void testAgainstEmptyDAO() {


    }

    @Test
    public void testAddOneTrip() {


    }

//

}
