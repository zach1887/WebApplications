/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.vacationwebapplicationmvc.controller;

import com.tsguild.vacationwebapplicationmvc.dao.VacationDao;
import com.tsguild.vacationwebapplicationmvc.dao.SearchTerm;
import com.tsguild.vacationwebapplicationmvc.dto.Trip;
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

    private VacationDao dao;

    @Inject
    public SearchController(VacationDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String displaySearchPage() {
        return "search";
    }

    @ResponseBody
    @RequestMapping(value = "/search/vacations", method = RequestMethod.POST)
    public List<Trip> searchVacc(@RequestBody Map<String, String> searchMap) {
        List<Trip> vacations = dao.getAllTrips();

        String monthString = searchMap.get("monthOfTrip");
        String yearString = searchMap.get("yearOfTrip");
        String cityString = searchMap.get("destCity");
        String countryString = searchMap.get("destCountry");
        String daysLengthString = searchMap.get("lengthDays");

        if (monthString != null && !monthString.isEmpty()) {
            vacations = vacations.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((Trip t) -> {
                        String monthName = t.getMonthOfTrip();
                        return monthName.equalsIgnoreCase(monthString);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }

        if (yearString != null && !yearString.isEmpty()) {
            vacations = vacations.stream()
                    .filter(t -> t.getYearOfTrip() == Integer.parseInt(yearString))
                    .collect(Collectors.toList());
        }

        if (cityString != null && !cityString.isEmpty()) {
            vacations = vacations.stream()
                    .filter((Trip t) -> {
                        String cityName = t.getDestCity();
                        return cityName.equalsIgnoreCase(cityString);
                    })
                    .collect(Collectors.toList());
        }

        if (countryString != null && !countryString.isEmpty()) {
            vacations = vacations.stream()
                    .filter((Trip t) -> {
                        String countryName = t.getDestCountry();
                        return countryName.equalsIgnoreCase(countryString);
                    })
                    .collect(Collectors.toList());
        }

        if (daysLengthString != null && !daysLengthString.isEmpty()) {
            vacations = vacations.stream()
                    .filter(t -> t.getLengthDays() == Integer.parseInt(daysLengthString))
                    .collect(Collectors.toList());
        }

        return vacations;
    }
}
