/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.dao;

import com.tsguild.vacationwebapplicationmvc.dto.Trip;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author apprentice
 */
public interface VacationDao {

    Trip addTrip(Trip newTrip);

    List<Trip> getAllTrips();

    Trip getTripById(int tripId);

    void removeTrip(int tripId);

    List<Trip> searchTrips(Predicate<Trip> filter);

    void updateTrip(Trip trip);
    
}
