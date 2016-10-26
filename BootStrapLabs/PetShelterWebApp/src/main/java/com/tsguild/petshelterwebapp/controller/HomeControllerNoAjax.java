/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.petshelterwebapp.controller;

import com.tsguild.petshelterwebapp.dao.PetShelterDao;
import com.tsguild.petshelterwebapp.dto.Pet;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author apprentice
 */
@Controller
//@RequestMapping(value="noAjax")
public class HomeControllerNoAjax {
    
    private PetShelterDao dao;
    
    @Inject
    public HomeControllerNoAjax(PetShelterDao dao) {
        this.dao=dao;
    }
    
    @RequestMapping(value= "/ajaxFree/home", method=RequestMethod.GET)
    public String displayPetShelterNoAjax(Model model) {
        model.addAttribute("petList",dao.getAllPets());
        return "noAjax/main";
    }
    
    @RequestMapping(value="/ajaxFree/add", method=RequestMethod.GET)
    public String displayNoAjaxAddForm() {
        return "noAjax/addPet";
        
    }
    @RequestMapping(value="/ajaxFree/add", method=RequestMethod.POST)
    public String processNoAjaxAddForm(HttpServletRequest request) {
        String petName = request.getParameter("petName");
        String petBreed = request.getParameter("petBreed");
        String petDisp = request.getParameter("petDisp");
        String vacc = request.getParameter("vaccinated");
        
        if(petName != null && !petName.isEmpty() &&
          petBreed != null && !petBreed.isEmpty() &&
          petDisp != null && !petDisp.isEmpty() &&
          vacc != null && !vacc.isEmpty()) {
          
            Pet newPet;
            if (vacc.equals("si")) {
                newPet = new Pet(-1, petName, petBreed, petDisp, true);
            } else{
                newPet = new Pet(-1, petName, petBreed, petDisp, false);
            }
            dao.addPet(newPet);
            return "redirect:/ajaxFree/home";
        }
            
        return "noAjax/addPet";
        
    }
    @RequestMapping(value= "/addPets", method=RequestMethod.GET)    
    public String addRandomPets(Model model) {
        Pet fido = new Pet();
        fido.setPetName("Fido");
        fido.setPetBreed("Puppy");
        fido.setDisposition("Friendly");
        fido.setVaccinated(true);
        dao.addPet(fido);
        model.addAttribute("petList",dao.getAllPets());
        return "noAjax/main";
        
    }
}
