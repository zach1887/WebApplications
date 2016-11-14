/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.dao;

import com.tsguild.vacationwebapplicationmvc.dto.Trip;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ahill
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

//    public Trip(int tripId, String monthOfTrip, int yearOfTrip, String destCity, String destCountry, 
    //            int lengthDays, boolean tripOverseas, String otherCitiesVisited)
    Trip[] tripForTesting = {
        new Trip(-1, "May", 2021, "Paris", "France", 13, true, "Calaix"),
        new Trip(-1, "June", 2021, "Brussels", "Belgium", 13, true, "Utrecht"),
        new Trip(-1, "August", 2021, "Seattle", "USA", 7, false, null),
        new Trip(-1, "September", 2010, "Buenos Aires", "Argentina", 16, false, "Montevideo, Asuncion"),
        new Trip(-1, "April", 2011, "San Francisco", "USA", 8, false, "Oakland"),
        new Trip(-1, "june", 2011, "Harare", "Zimbambwe", 8, true, null)
    };
    Trip[] copiedTrips = {
        new Trip(-1, "May", 2021, "Paris", "France", 13, true, "Calaix"),
        new Trip(-1, "June", 2021, "Brussels", "Belgium", 13, true, "Utrecht"),
        new Trip(-1, "August", 2021, "Seattle", "USA", 7, false, null),
        new Trip(-1, "September", 2010, "Buenos Aires", "Argentina", 16, false, "Montevideo, Asuncion"),
        new Trip(-1, "April", 2011, "San Francisco", "USA", 8, false, "Oakland"),
        new Trip(-1, "june", 2011, "Harare", "Zimbambwe", 8, true, null)
    };
    Trip[] updatedTrips = {
        new Trip(-1, "May", 2026, "Paris", "France", 13, true, "Calaix"),
        new Trip(-1, "June", 2021, "Brussels", "Belgium", 16, true, "Utrecht"),
        new Trip(-1, "September", 2021, "Seattle", "USA", 7, false, "Portland"),
        new Trip(-1, "September", 2011, "Buenos Aires", "Argentina", 16, false, "Montevideo, Asuncion"),
        new Trip(-1, "April", 2011, "San Francisco", "USA", 10, false, "Oakland"),
        new Trip(-1, "june", 2011, "Harare", "Zimbambwe", 8, true, null)
    };

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
        // Step1: Make a Pet
        Trip paris = new Trip(-1, "May", 2021, "Paris", "France", 13, true, "Calaix");

        // Step2: Add pet to dao
        testDao.addTrip(paris);

        // Step3: get pet out of dao by id
        Trip shouldMatch = testDao.getTripById(paris.getTripId());

        // Step4: Make sure the pet added looks like the pet retrieved
        // We can only use assertEquals here because we overrode the .equals method in Pet
        Assert.assertEquals("Trip stored does not match trip returned",
                paris, shouldMatch);
        //        Assert.assertEquals("Added/GetByID pet id did not match.", fido.getId(), hopefullyFido.getId());
        //        Assert.assertEquals("Added/GetByID pet name did not match 'fido' as expected", "fido", hopefullyFido.getId());
    }

    @Test
    public void testAgainstEmptyDAO() {

        Assert.assertNull("Asking for a non existent pet should return null.", testDao.getTripById(44));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' is nonzero with empty DAO.", 0, testDao.getAllTrips().size());
    }

    @Test
    public void testAddOneTrip() {
        Trip newTrip = tripForTesting[0];
        testDao.addTrip(newTrip);

        Assert.assertEquals("Returned pet does not match expected.", newTrip, testDao.getTripById(newTrip.getTripId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding one pet.", 1, testDao.getAllTrips().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(newTrip));

    }

    @Test
    public void testUpdateTrip() {
        
        testDao.addTrip(tripForTesting[0]);
        updatedTrips[0].setTripId(tripForTesting[0].getTripId());
        testDao.updateTrip(updatedTrips[0]);
        
//        testDao.addPet(petsForTesting[0]);
//        similarPets[0].setId(petsForTesting[0].getId());
//        testDao.updatePet(similarPets[0]);

        Assert.assertEquals("Updated pet get does not match expected.", updatedTrips[0], testDao.getTripById(updatedTrips[0].getTripId()));
        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing one pet.", 1, testDao.getAllTrips().size());
        Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(updatedTrips[0]));
    }

    @Test
    public void testAddMultipleTrips() {
        for (Trip trip : tripForTesting) {
            testDao.addTrip(trip);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several pets.",
                tripForTesting.length, testDao.getAllTrips().size());

        for (int i = 0; i < tripForTesting.length; i++) {
            Assert.assertEquals("Returned pet does not match expected.", tripForTesting[i], testDao.getTripById(tripForTesting[i].getTripId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(tripForTesting[i]));
        }

    }

    @Test
    public void testUpdateMultiplePets() {
        for (Trip trip : tripForTesting) {
            testDao.addTrip(trip);
        }

        for (int i = 0; i < tripForTesting.length; i++) {
            updatedTrips[i].setTripId(tripForTesting[i].getTripId());
            testDao.updateTrip(updatedTrips[i]);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after replacing several pets.",
                tripForTesting.length, testDao.getAllTrips().size());

        for (int i = 0; i < updatedTrips.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on update.", updatedTrips[i], testDao.getTripById(updatedTrips[i].getTripId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(updatedTrips[i]));
        }

    }
//
    @Test
    public void testAddSimilarPets() {
        for (Trip trip : tripForTesting) {
            testDao.addTrip(trip);
        }

        for (Trip trip : updatedTrips) {
            testDao.addTrip(trip);
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count does not match after adding several similar pets.",
                tripForTesting.length + updatedTrips.length, testDao.getAllTrips().size());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding several similar pets.",
                tripForTesting.length + updatedTrips.length, testDao.getAllTrips().size());

        for (int i = 0; i < updatedTrips.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", updatedTrips[i],
                    testDao.getTripById(updatedTrips[i].getTripId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(updatedTrips[i]));
        }

        for (int i = 0; i < tripForTesting.length; i++) {
            Assert.assertEquals("Get pet does not match expected return on addition of similar pet.", tripForTesting[i],
                    testDao.getTripById(tripForTesting[i].getTripId()));
            Assert.assertTrue("Returned pet in getAllPets does not match expected.", testDao.getAllTrips().contains(tripForTesting[i]));
        }

    }

    @Test
    public void testAddAndRemoveOneTrip() {
        testDao.addTrip(tripForTesting[3]);
        testDao.removeTrip(tripForTesting[3].getTripId());

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertNull("Get pet should return null after being removed.", testDao.getTripById(tripForTesting[0].getTripId()));
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet.", 0, testDao.getAllTrips().size());
    }

    @Test
    public void testAddAndRemovePetTwice() {
        testDao.addTrip(tripForTesting[0]);
        testDao.removeTrip(tripForTesting[0].getTripId());
        testDao.removeTrip(tripForTesting[0].getTripId());

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertNull("Pet should return null after being removed.", testDao.getTripById(tripForTesting[0].getTripId()));
        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a single pet twice.", 0, testDao.getAllTrips().size());
    }

    @Test
    public void testAddAndRemoveMultipleTrip() {

        for (Trip trip : tripForTesting) {
            testDao.addTrip(trip);
        }

        int trAdded = tripForTesting.length;
        for (int i = 0; i < tripForTesting.length; i += 2) {
            testDao.removeTrip(tripForTesting[i].getTripId());
            trAdded--;
        }

        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllTrips());
        Assert.assertEquals("Expected pet count of 'all pets' does not match after adding & removing several pets.",
                trAdded, testDao.getAllTrips().size());

        for (int i = 0; i < tripForTesting.length; i++) {
            if (i % 2 == 1) {
                Assert.assertEquals("Returned pet does not match expected.", tripForTesting[i], testDao.getTripById(tripForTesting[i].getTripId()));
            } else {
                Assert.assertNull("Pet should be removed and return null.", testDao.getTripById(tripForTesting[i].getTripId()));
            }
        }

    }
//
//    @Test
//    public void testAddAndRemovePetsMultipleTimes() {
//
//        for (Pet pet : petsForTesting) {
//            testDao.addPet(pet);
//        }
//
//        for (Pet pet : petsForTesting) {
//            testDao.removePet(pet.getId());
//        }
//
//        for (Pet pet : petsForTesting) {
//            testDao.addPet(pet);
//        }
//
//        Assert.assertNotNull("List of all pets should not be null.", testDao.getAllPets());
//        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a all pets.",
//                petsForTesting.length, testDao.getAllPets().size());
//
//
//
//        for (int i = 0; i < petsForTesting.length; i++) {
//            Pet pet = petsForTesting[i];
//            Assert.assertEquals("Pet should return after being re-added.", pet, testDao.getPetById(pet.getId()));
//            testDao.removePet(pet.getId());
//            Assert.assertNull("Pet should return null after being removed.", testDao.getPetById(pet.getId()));
//        }
//
//        Assert.assertEquals("Expected pet count of 'all pets' should be zero when adding/removing a all pets.", 0, testDao.getAllPets().size());
//
//    }
//
    @Test
    public void testTripCountOnAddition() {

        // Add all pets and check that count increments appropriately
        for (int i = 0; i < tripForTesting.length; i++) {
            testDao.addTrip(tripForTesting[i]);
            Assert.assertEquals("Expected " + (i + 1) + " pets after adding trip.",
                    i + 1, testDao.getAllTrips().size());
        }

    }
    
    @Test
    public void testPetCountOnUpdate() {

        // Add all pets and check that count increments appropriately
        for (int i = 0; i < tripForTesting.length; i++) {
            testDao.addTrip(tripForTesting[i]);
            updatedTrips[i].setTripId(tripForTesting[i].getTripId());
            testDao.updateTrip(updatedTrips[i]);
            Assert.assertEquals("Expected " + (i + 1) + " pets after updating petses.",
                    i + 1, testDao.getAllTrips().size());
        }

    }
//
    @Test
    public void testPetCountAfterRemoval() {

        // Add all pets
        for (int i = 0; i < tripForTesting.length; i++) {
            testDao.addTrip(tripForTesting[i]);
        }

        // Remove pets one by one and test that count decrements properly
        for (int i = 0; i < tripForTesting.length; i++) {
            testDao.removeTrip(tripForTesting[i].getTripId());
            Assert.assertEquals("Expected " + (tripForTesting.length - i - 1) + " pets after removing petses.",
                    tripForTesting.length - i - 1, testDao.getAllTrips().size());
        }
    }

    @Test
    public void testTripAfterRemovalOfNonExistent() {

        // Add all pets
        for (int i = 0; i < tripForTesting.length; i++) {
            testDao.addTrip(tripForTesting[i]);
        }

        testDao.removeTrip(100);
        Assert.assertEquals("Expected " + tripForTesting.length + " trips after removal.",
                tripForTesting.length, testDao.getAllTrips().size());

    }
//
//    @Test
//    public void testPetCountAfterTwiceRemoved() {
//
//        // Add all pets
//        for (int i = 0; i < petsForTesting.length; i++) {
//            testDao.addPet(petsForTesting[i]);
//        }
//
//        // Remove pets one by one and test that count decrements properly
//        for (int i = 0; i < petsForTesting.length; i++) {
//            testDao.removePet(petsForTesting[i].getId());
//        }
//
//        Assert.assertEquals("Expected " + 0 + " pets after removing petses.",
//                0, testDao.getAllPets().size());
//
//        // Remove pets one by one and test that count decrements properly
//        for (int i = 0; i < petsForTesting.length; i++) {
//            testDao.removePet(petsForTesting[i].getId());
//        }
//
//        Assert.assertEquals("Expected " + 0 + " pets after attempting to re-remove petses.",
//                0, testDao.getAllPets().size());
//
//    }

}
