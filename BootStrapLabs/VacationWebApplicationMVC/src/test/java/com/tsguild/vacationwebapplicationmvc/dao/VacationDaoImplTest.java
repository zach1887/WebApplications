/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.dao;

import com.tsguild.vacationwebapplicationmvc.dto.Trip;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Jesse
 */
public class VacationDaoImplTest {

    VacationDao testDao;

    public VacationDaoImplTest() {

    }

    @Before
    public void setUp() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
        testDao = factory.getBean(VacationDaoImpl.class);
    }
    
    Trip [] testValues= {
        new Trip(-1, "May", 1995,"Las Vegas","USA", 6, false,""),
        new Trip(-1, "June", 1998,"Prague","Czech Republic", 9, true,"Vienna"),
        new Trip(-1, "December", 2003,"Las Vegas","USA", 4, false,""),
        new Trip(-1, "August", 2014,"Baltimore","USA", 5, false,"Bethesda"),
        new Trip(-1, "june", 2004,"Madrid","Spain", 11, true,"Barcelona, Seville, Toledo"),
        new Trip(-1, "December", 2011,"Columbus","USA", 2, false,""),
        new Trip(-1, "May", 2021,"Sydney","Australia", 26, true,"Canberra, Melbourne")   
    };
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
//    public Trip(int tripId, String monthOfTrip, int yearOfTrip, String destCity, String destCountry, int lengthDays, boolean tripOverseas, String otherCitiesVisited) {
//        this.tripId = tripId;
//        this.monthOfTrip = monthOfTrip;
//        this.yearOfTrip = yearOfTrip;
//        this.destCity = destCity;
//        this.destCountry = destCountry;
//        this.lengthDays = lengthDays;
//        this.tripOverseas = tripOverseas;
//        this.otherCitiesVisited = otherCitiesVisited;
//    }