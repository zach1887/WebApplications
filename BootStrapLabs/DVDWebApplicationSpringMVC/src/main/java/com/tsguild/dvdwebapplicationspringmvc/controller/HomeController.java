/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.controller;

import com.tsguild.dvdwebapplicationspringmvc.dao.DVDLibraryDao;
import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author apprentice
 */
@Controller
public class HomeController {
    
    private DVDLibraryDao dao;
    
    @Inject
    public HomeController(DVDLibraryDao dao) {
        this.dao = dao;
        
    }
    
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }
    
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/dvd", method = RequestMethod.POST)
    public DVD createDVD(@Valid @RequestBody DVD newDVD) {
        dao.addDVD(newDVD);
        return newDVD;
    }
    
    @ResponseBody
    @RequestMapping(value = "/dvdCollection", method = RequestMethod.GET)
    public List<DVD> getAllDVDs() {
        return dao.getallDVDs();
    }
    
    @ResponseBody
    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.GET)
    public DVD getDVDById(@PathVariable("id") int dvdId) {
        return dao.getDVDbyID(dvdId);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/dvd/{dvdId}", method = RequestMethod.PUT)
    public void updateDVD(@PathVariable int dvdId, @RequestBody DVD updatedDVD) {
        updatedDVD.setIdDVD(dvdId);
        dao.updateDVD(updatedDVD);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/dvd/{id}", method = RequestMethod.DELETE)
    public void removeDVD(@PathVariable int id) {
        dao.removeDVD(id);
    }
    
}
