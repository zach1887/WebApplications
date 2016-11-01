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
        return "noAjax/addTrip";
    }

    @RequestMapping(value = "/ajaxFree/add", method = RequestMethod.POST)
    public String processAddForm(HttpServletRequest request) {
        String monthTrip = request.getParameter("tripMonth");
        String year = request.getParameter("tripYear");
        String destCity = request.getParameter("destCity");
        String destCountry = request.getParameter("destCountry");
        String length = request.getParameter("length");
        String overseas = request.getParameter("overseas");
        String otherCities = request.getParameter("otherCities");

        if (!monthTrip.isEmpty() && monthTrip != null
                && !year.isEmpty() && year != null
                && !destCity.isEmpty() && destCity != null
                && !destCountry.isEmpty() && destCountry != null
                && !length.isEmpty() && length != null
                && !overseas.isEmpty() && overseas != null) {

            try {
                int yearTrip = Integer.parseInt(year);
                int lengthTrip = Integer.parseInt(length);

                Trip newTrip;
                if ("si".equals(overseas)) {
                    newTrip = new Trip(-1, monthTrip, yearTrip, destCity, destCountry, lengthTrip, true, otherCities);
                } else {
                    newTrip = new Trip(-1, monthTrip, yearTrip, destCity, destCountry, lengthTrip, false, otherCities);
                }
                dao.addTrip(newTrip);
                return "redirect:/home";
            } catch (NumberFormatException e) {
                return "home";
            }
        } else {
            return "redirect:/home";
        }
    }

    @RequestMapping(value = "ajaxFree/remove", method = RequestMethod.GET)
    public String removeTrip(HttpServletRequest request) {
        String tripIdString = request.getParameter("tripId");
        int id = Integer.parseInt(tripIdString);
        dao.removeTrip(id);
        return "redirect:/ajaxFree/home";
    }

    @RequestMapping(value = "ajaxFree/edit", method = RequestMethod.GET)
    public String displayEditForm(Model model, HttpServletRequest request) {
        String tripToEditId = request.getParameter("tripId");
        int tripId = Integer.parseInt(tripToEditId);
        Trip tr = dao.getTripById(tripId);
        model.addAttribute("editThisTrip", tr);
        return "noAjax/editTrip";
    }

    @RequestMapping(value = "ajaxFree/edit", method = RequestMethod.POST)
    public String processEditForm(Model model, HttpServletRequest request) {
        String stringId = request.getParameter("tripId");
        String stringMonth = request.getParameter("tripMonth");
        String stringYear = request.getParameter("tripYear");
        String stringCity = request.getParameter("destCity");
        String stringLength = request.getParameter("length");
        String stringCountry = request.getParameter("destCountry");
        String otherCities = request.getParameter("otherCities");

        int tripId = Integer.parseInt(stringId);
        int days = Integer.parseInt(stringLength);
        int Year = Integer.parseInt(stringYear);

        boolean overseas = "si".equals(request.getParameter("overseas"));

        if (overseas) {
            Trip editTr = new Trip(tripId, stringMonth, Year, stringCity, stringCountry, days, true, otherCities);
            dao.updateTrip(editTr);
        } else {
            Trip editTr = new Trip(tripId, stringMonth, Year, stringCity, stringCountry, days, false, otherCities);
            dao.updateTrip(editTr);
        }
        return "redirect:/ajaxFree/home";

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
        tr.setTripOverseas(true);
        dao.addTrip(tr);
        model.addAttribute("tripList", dao.getAllTrips());
        return "noAjax/main";
    }
}
