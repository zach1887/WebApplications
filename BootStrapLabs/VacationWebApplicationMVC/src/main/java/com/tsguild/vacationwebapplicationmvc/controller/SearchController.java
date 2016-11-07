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

        String monthString = searchMap.get("tripMonth");
        String yearString = searchMap.get("tripYear");
        String cityString = searchMap.get("tripDestCity");
        String countryString = searchMap.get("tripDestCountry");
        String daysLengthString = searchMap.get("tripDaysLength");

        if (monthString != null && !monthString.isEmpty()) {
            vacations = vacations.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((Trip t) -> {
                        String monthName = t.getMonthOfTrip().toLowerCase();
                        String monthSearch = monthString.toLowerCase();
                        return monthName.contains(monthSearch);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
//        if (yearString != null && !yearString.isEmpty()) {
//            vacations = vacations.stream()
//                    //                    .filter( p -> p.getName().contains(petNameString) )
//                    .filter((Trip t) -> {
//                        int yearInput = Integer.parseInt(yearString);
//                        return
//                    })
//                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
//                    .collect(Collectors.toList());
//        }

        // TODO: fix Vacc search
        return vacations;
    }
}
