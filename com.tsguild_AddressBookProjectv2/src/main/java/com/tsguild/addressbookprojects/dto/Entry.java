/*
 * To change this license header, choose License Headers in ProjectProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.addressbookprojects.dto;

/**
 *
 * @author apprentice
 */
public class Entry {
        private String firstName;
        private String secondName;
        private String streetAddress;
        private String city;
        private String stateAbbrev;  //must be two letters
        private int zipCode; // must be either 5 or 9 digits
        
        public Entry(){

    
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStateAbbrev(String stateAbbrev) {
        this.stateAbbrev = stateAbbrev;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public Entry(String firstName, String secondName, String streetAddress, String city, String stateAbbrev, int zipCode) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.stateAbbrev = stateAbbrev;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getStateAbbrev() {
        return stateAbbrev;
    }

    public int getZipCode() {
        return zipCode;
    }

}

