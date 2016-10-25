/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.dao;

import com.tsguild.petshelterwebapp.dto.Pet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author apprentice
 */
public class PetShelterDaoImpl implements PetShelterDao {

    private Map<Integer, Pet> petMap = new HashMap<>();
    private static int petIDCounter = 0;

    @Override
    public Pet addPet(Pet pet) {
        pet.setPetId(petIDCounter);;
        petMap.put(petIDCounter, pet);
        petIDCounter++;
        return pet;

    }

    @Override
    public Pet getPetByID(int petID) {
        return petMap.get(petID);
  }

    @Override
    public List<Pet> getAllPets() {
       return petMap.values().stream().collect(Collectors.toList());  
   }

    @Override
    public void updatePet(Pet pet) {
    petMap.put(pet.getPetId(), pet);
    }

    @Override
    public void removePet(int ID) {
    petMap.remove(ID);
    }

    @Override
    public List<Pet> searchPet(Map<SearchTerm, String> criteria) {
        return null;  // will be written over later
   }

    @Override
    public List<Pet> searchPets(Predicate<Pet> filter) {
        return petMap.values().stream()
                .filter(filter)
                .collect(Collectors.toList());
        
     }

}
