/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.controller;

import com.tsguild.vacationwebapplicationmvc.dao.VacationDao;
import com.tsguild.vacationwebapplicationmvc.dto.Trip;

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

    private VacationDao dao;

    @Inject
    public HomeController(VacationDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String displayHomePage() {
        return "home";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/vacc", method = RequestMethod.POST)
    public Trip createTrip(@Valid @RequestBody Trip newTrip) {
        dao.addTrip(newTrip);
        return newTrip;
    }

    @ResponseBody
    @RequestMapping(value = "/vacations", method = RequestMethod.GET)
    public List<Trip> getAllPets() {
        return dao.getAllTrips();
    }

    @ResponseBody
    @RequestMapping(value = "/vacc/{id}", method = RequestMethod.GET)
    public Trip getTripById(@PathVariable("id") int tripId) {
        return dao.getTripById(tripId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/vacc/{vaccId}", method = RequestMethod.PUT)
    public void updateTrip(@PathVariable int vaccId, @RequestBody Trip updatedTrip) {
        updatedTrip.setTripId(vaccId);
        dao.updateTrip(updatedTrip);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/vacc/{id}", method = RequestMethod.DELETE)
    public void removeTrip(@PathVariable int id) {
        dao.removeTrip(id);
    }

}
