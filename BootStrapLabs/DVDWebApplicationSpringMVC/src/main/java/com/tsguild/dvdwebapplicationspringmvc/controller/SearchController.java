/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.controller;

import com.tsguild.dvdwebapplicationspringmvc.dao.DVDLibraryDao;
import com.tsguild.dvdwebapplicationspringmvc.dao.SearchTerm;
import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
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

    private DVDLibraryDao dao;

    @Inject
    public SearchController(DVDLibraryDao dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String displaySearchPage() {
        return "search";
    }

    @ResponseBody
    @RequestMapping(value = "/search/dvds", method = RequestMethod.POST)
    public List<DVD> searchDVDs(@RequestBody Map<String, String> searchMap) {
        List<DVD> dvds = dao.getallDVDs();

        String titleCriteria = searchMap.get("title");
        String yearCriteria = searchMap.get("releaseYear");
        String ratingCriteria = searchMap.get("mPAArating");
        String directorCriteria = searchMap.get("comments");
        String studioCriteria = searchMap.get("studio");

        if (titleCriteria != null && !titleCriteria.isEmpty()) {
            dvds = dvds.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((DVD d) -> {
                        String dvdTitle = d.getTitle().toLowerCase();
                        String dvdSearch = titleCriteria.toLowerCase();
                        return dvdTitle.contains(dvdSearch);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
        if (yearCriteria != null && !yearCriteria.isEmpty()) {
            int yearEntered = Integer.parseInt(yearCriteria);

            dvds = dvds.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((DVD d) -> {
                        int dvdYear = d.getReleaseYear();
                        return (dvdYear == yearEntered);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
        if (ratingCriteria != null && !ratingCriteria.isEmpty()) {
            dvds = dvds.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((DVD d) -> {
                        String dvdRating = d.getmPAArating().toLowerCase();
                        String dvdSearch = ratingCriteria.toLowerCase();
                        return dvdRating.contains(dvdSearch);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
        if (directorCriteria != null && !directorCriteria.isEmpty()) {
            dvds = dvds.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((DVD d) -> {
                        String dvdDirector = d.getDirector().toLowerCase();
                        String dvdSearch = directorCriteria.toLowerCase();
                        return dvdDirector.contains(dvdSearch);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
        if (studioCriteria != null && !studioCriteria.isEmpty()) {
            dvds = dvds.stream()
                    //                    .filter( p -> p.getName().contains(petNameString) )
                    .filter((DVD d) -> {
                        String dvdStudio = d.getStudio().toLowerCase();
                        String dvdSearch = studioCriteria.toLowerCase();
                        return dvdStudio.contains(dvdSearch);
                    })
                    //                    .filter((Pet p) -> {return p.getName().toLowerCase().contains(petNameString.toLowerCase());})
                    .collect(Collectors.toList());
        }
        return dvds;
    }
}
