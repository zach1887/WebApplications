package com.tsguild.petshelter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class Pet {
    private int ID;
    private String petName;
    private String condition;    
    private String species;

    // default constructor called by new Pet();
    public Pet(){
}
    public Pet(int ID, String name, String condition, String species){
        this.ID = ID;
        this.petName = name;
        this.condition = condition;
        this.species = species;
    }   
    // accessors for each variable
    public int getID() {
        return ID;
    }
    public String getPetName() {
        return petName;
    }
    public String getCondition() {
        return condition;
    }
    public String getSpecies() {
        return species;
    }
    
    //mutators for each variable
    
    public void setID (int newID){
        ID = newID;
    }
//    public Pet setID (int newID){
//        ID = newID;
//        return this;     This would be part of a builder pattern.        
//    }

    public void setPetName(String newName){
        petName = newName;
    }
    
    public void setCondition(String newCondition){
        condition = newCondition;
    }
    public void setSpecies(String newSpecies){
        species = newSpecies;
    }
    
    
    
}
