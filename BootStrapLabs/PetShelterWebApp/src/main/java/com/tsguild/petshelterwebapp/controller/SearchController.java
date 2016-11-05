/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.controller;

import com.tsguild.petshelterwebapp.dao.PetShelterDao;
import com.tsguild.petshelterwebapp.dao.SearchTerm;
import com.tsguild.petshelterwebapp.dto.Pet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author apprentice
 */
@Controller
public class SearchController {

    private PetShelterDao dao;

    @Inject
    public SearchController(PetShelterDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String displaySearchPage() {
        return "search";
    }

    @ResponseBody
    @RequestMapping(value = "/search/pets", method = RequestMethod.POST)
    public List<Pet> searchPets(@RequestBody Map<String, String> searchMap) {
        List<Pet> pets = dao.getAllPets();

        String petNameString = searchMap.get("petName");
        String petBreedString = searchMap.get("petBreed");
        String petDispString = searchMap.get("petDisposition");
        String petVaccString = searchMap.get("petVacc");

        Map<SearchTerm, String> criteriaMap = new HashMap<>();
        if (petNameString != null && !petNameString.isEmpty()) {
            pets = pets.stream()
                    .filter(p -> p.getPetName().toLowerCase().contains(petNameString.toLowerCase()))
                    .collect(Collectors.toList());

        }

        if (petBreedString != null && !petBreedString.isEmpty()) {
            pets = pets.stream()
                    .filter(p -> p.getPetBreed().toLowerCase().contains(petBreedString.toLowerCase()))
                    .collect(Collectors.toList());

        }
        if (petDispString != null && !petDispString.isEmpty()) {
            pets = pets.stream()
                    .filter(p -> p.getDisposition().toLowerCase().contains(petDispString.toLowerCase()))
                    .collect(Collectors.toList());
            
        }



        return pets;
    }
}
