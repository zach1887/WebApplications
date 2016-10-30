/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.dao;

import com.tsguild.vacationwebapplicationmvc.dto.Trip;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class VacationDaoImpl implements VacationDao {

    private Map<Integer, Trip> tripMap = new HashMap<>();
    private static int tripIDCounter = 0;

    @Override
    public Trip addTrip(Trip newTrip) {
        newTrip.setTripId(tripIDCounter);
        tripMap.put(tripIDCounter, newTrip);
        tripIDCounter++;
        return newTrip;
    }
    
    @Override
    public Trip getTripById (int tripId) {
        return tripMap.get(tripId);
    }
    
    @Override
    public List<Trip> getAllTrips() {
        return tripMap.values().stream().collect(Collectors.toList());
    }
    
    @Override
    public void updateTrip(Trip trip) {
        tripMap.put(trip.getTripId(), trip);
    }
    
    @Override
    public void removeTrip(int tripId) {
        tripMap.remove(tripId);
    }
    
    @Override
    public List<Trip> searchTrips(Predicate<Trip> filter) {
        return tripMap.values().stream().collect(Collectors.toList());
                }
    
}
