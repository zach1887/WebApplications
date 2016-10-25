/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.controller;

import com.tsguild.petshelterwebapp.dao.PetShelterDao;
import com.tsguild.petshelterwebapp.dto.Pet;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
@RequestMapping(value="noAjax")
public class HomeControllerNoAjax {
    
    private PetShelterDao dao;
    
    @Inject
    public HomeControllerNoAjax(PetShelterDao dao) {
        this.dao=dao;
    }
    
    @RequestMapping(value= "/home", method=RequestMethod.GET)
    public String displayPetShelterNoAjax(Model model) {
        model.addAttribute("petList",dao.getAllPets());
        return "noAjax/home";
    }
    
    public String addRandomPets(Model model) {
        Pet fido = new Pet();
        fido.setPetName("Fido");
        fido.setPetBreed("Puppy");
        fido.setDisposition("Friendly");
        fido.setVaccinated(true);
        dao.addPet(fido);
        model.addAttribute("petList",dao.getAllPets());
        return "noAjax/home";
        
    }
}
