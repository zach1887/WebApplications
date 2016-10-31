/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.controller;

import com.tsguild.vacationwebapplicationmvc.dao.VacationDao;
import com.tsguild.vacationwebapplicationmvc.dto.Trip;

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

    @RequestMapping(value = "/ajaxFree/home", method = RequestMethod.GET)
    public String displayVacation(Model model) {
        model.addAttribute("tripList", dao.getAllTrips());
        return "noAjax/main";
    }
    
    @RequestMapping(value = "/ajaxFree/add", method = RequestMethod.GET)
    public String displayAddForm() {
        return "addTrip";
    }

    @RequestMapping(value = "/ajaxFree/add", method = RequestMethod.POST)
    public String processAddForm(HttpServletRequest request) {
        String monthTrip = request.getParameter("monthOfTrip");
        String year = request.getParameter("yearOfTrip");
        String destCity = request.getParameter("destCity");
        String destCountry = request.getParameter("destCountry");
        String length = request.getParameter("lengthDays");
        String overseas = request.getParameter("tripOverseas");
        String otherCities = request.getParameter("otherCitiesVisited");

        try {
            int yearTrip = Integer.parseInt(year);
            int lengthTrip = Integer.parseInt(length);

            if (!monthTrip.isEmpty() && monthTrip != null
                    && !year.isEmpty() && year != null
                    && !destCity.isEmpty() && destCity != null
                    && !destCountry.isEmpty() && destCountry != null
                    && !length.isEmpty() && length != null
                    && !overseas.isEmpty() && overseas != null) {

                Trip newTrip;
                if ("si".equals(overseas)) {
                    newTrip = new Trip(-1, monthTrip, yearTrip, destCity, destCountry, lengthTrip, true, otherCities);
                } else {
                    newTrip = new Trip(-1, monthTrip, yearTrip, destCity, destCountry, lengthTrip, false, otherCities);
                }
                dao.addTrip(newTrip);
                return "redirect:/home";
            }
        } catch (NumberFormatException e) {
            return "noAjax/addTrip";
        }

        return "noAjax/addTrip";
    }

    @RequestMapping(value = "ajaxFree/edit", method = RequestMethod.GET)
    public String displayEditForm(Model model, HttpServletRequest request) {
        String tripToEditId = request.getParameter("tripId");
        int tripId = Integer.parseInt(tripToEditId);
        Trip tr = dao.getTripById(tripId);
        model.addAttribute("editThisTrip",tr);
        return "noAjax/editTrip";
    }

    @RequestMapping(value = "/addTest", method = RequestMethod.GET)
    public String addTestData(Model model) {
        Trip tr = new Trip();
        tr.setMonthOfTrip("May");
        tr.setYearOfTrip(2016);
        tr.setDestCity("Quito");
        tr.setDestCountry("Ecuador");
        tr.setLengthDays(11);
        tr.setOtherCitiesVisited("Guayaquil, Cuenca");
        dao.addTrip(tr);
        model.addAttribute("petList", dao.getAllTrips());
        return "noAjax/main";
    }
}
