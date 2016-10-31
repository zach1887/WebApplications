/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.dto;

import java.util.Objects;

/**
 *
 * @author apprentice
 */
public class Trip {
    private int tripId;
    private String monthOfTrip;
    private int yearOfTrip;
    private String destCity;
    private String destCountry;
    private int lengthDays;
    private boolean tripOverseas;
    private String otherCitiesVisited;

    public Trip() {
    }

    public Trip(int tripId, String monthOfTrip, int yearOfTrip, String destCity, String destCountry, int lengthDays, boolean tripOverseas, String otherCitiesVisited) {
        this.tripId = tripId;
        this.monthOfTrip = monthOfTrip;
        this.yearOfTrip = yearOfTrip;
        this.destCity = destCity;
        this.destCountry = destCountry;
        this.lengthDays = lengthDays;
        this.tripOverseas = tripOverseas;
        this.otherCitiesVisited = otherCitiesVisited;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getMonthOfTrip() {
        return monthOfTrip;
    }

    public void setMonthOfTrip(String monthOfTrip) {
        this.monthOfTrip = monthOfTrip;
    }

    public int getYearOfTrip() {
        return yearOfTrip;
    }

    public void setYearOfTrip(int yearOfTrip) {
        this.yearOfTrip = yearOfTrip;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCounrty) {
        this.destCountry = destCountry;
    }

    public int getLengthDays() {
        return lengthDays;
    }

    public void setLengthDays(int lengthDays) {
        this.lengthDays = lengthDays;
    }

    public boolean isTripOverseas() {
        return tripOverseas;
    }

    public void setTripOverseas(boolean tripOverseas) {
        this.tripOverseas = tripOverseas;
    }

    public String getOtherCitiesVisited() {
        return otherCitiesVisited;
    }

    public void setOtherCitiesVisited(String otherCitiesVisited) {
        this.otherCitiesVisited = otherCitiesVisited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.monthOfTrip);
        hash = 83 * hash + this.yearOfTrip;
        hash = 83 * hash + Objects.hashCode(this.destCity);
        hash = 83 * hash + Objects.hashCode(this.destCountry);
        hash = 83 * hash + this.lengthDays;
        hash = 83 * hash + (this.tripOverseas ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.otherCitiesVisited);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trip other = (Trip) obj;
        if (this.yearOfTrip != other.yearOfTrip) {
            return false;
        }
        if (this.lengthDays != other.lengthDays) {
            return false;
        }
        if (this.tripOverseas != other.tripOverseas) {
            return false;
        }
        if (!Objects.equals(this.monthOfTrip, other.monthOfTrip)) {
            return false;
        }
        if (!Objects.equals(this.destCity, other.destCity)) {
            return false;
        }
        if (!Objects.equals(this.destCountry, other.destCountry)) {
            return false;
        }
        if (!Objects.equals(this.otherCitiesVisited, other.otherCitiesVisited)) {
            return false;
        }
        return true;
    }
    
    
    
}
