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
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    
    @RequestMapping(value = "/ajaxFree/editWithSpring", method = RequestMethod.POST)
    public String processEditFormWithSpring(@Valid @ModelAttribute("editThisPet")Pet editedPet,
                                             BindingResult thingsThatGoWrong) {
        if(thingsThatGoWrong.hasErrors()) {
            return "noAjax/editPetSpringFormValidation";
        }
        dao.updatePet(editedPet);        
        return "redirect:/ajaxFree/home";
    }
    @RequestMapping(value= "/ajaxFree/edit", method=RequestMethod.GET)
    public String displayPetEditNoAjax(Model model, HttpServletRequest request) {
        String petToEditId = request.getParameter("petId");
        int petId = Integer.parseInt(petToEditId);
        Pet p = dao.getPetByID(petId);
        model.addAttribute("editThisPet",p);
//        return "noAjax/editPet";
        return "noAjax/editPetSpringForm";
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
    
    @RequestMapping(value ="ajaxFree/edit", method = RequestMethod.POST)
    public String processEditFormOldSchool(HttpServletRequest request) {
        String idString = request.getParameter("petId");
        String nameString =request.getParameter("petName");
        String breedString =request.getParameter("petBreed");
        String dispString = request.getParameter("petDisp");
        String vaccString = request.getParameter("vacc");
        
        int id = Integer.parseInt(idString);
        boolean vaccinated = "si".equals(vaccString);
        
        Pet editedPet = new Pet(id, nameString, breedString, dispString, vaccinated);
        
        dao.updatePet(editedPet);
        
        
        return "redirect:/ajaxFree/home";
    }
    
    @RequestMapping(value = "ajaxFree/adopt", method = RequestMethod.GET)
    public String adoptPetOut(HttpServletRequest request) {
        String petIdString = request.getParameter("petId");
         int id = Integer.parseInt(petIdString);
         dao.removePet(id);
         return "redirect:/ajaxFree/home";     
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
