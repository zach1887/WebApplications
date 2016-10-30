/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.dvdwebapplicationspringmvc.dao;

import com.tsguild.dvdwebapplicationspringmvc.dto.DVD;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.function.Predicate;

import java.util.stream.Collectors;

/**
 *
 * @author Jesse
 */
public class DVDLibraryImpl implements DVDLibraryDao {

    private HashMap<Integer, DVD> dvdMap;
    private static int idCounter = 0;


    @Override
    public DVD addDVD(DVD dvd) {
        dvd.setIdDVD(idCounter);
        idCounter++;
        dvdMap.put(dvd.getIdDVD(), dvd);
        return dvd;
    }


    @Override
    public void removeDVD(int idDVD) {
        dvdMap.remove(idDVD);

    }


    @Override
    public void updateDVD(DVD changeDVD) {
        dvdMap.put(changeDVD.getIdDVD(), changeDVD);

    }


    @Override
    public List<DVD> getallDVDs() {
        return dvdMap.values().stream().collect(Collectors.toList());

    }
    
    @Override
    public DVD getDVDbyID(int ID) {
        return dvdMap.get(ID);
    }
 
    @Override
    public List<DVD> searchDVD(Map<SearchTerm, String> criteria) {
        String titleCriteria = criteria.get(SearchTerm.TITLE);
        int yearCriteria = Integer.parseInt(criteria.get(SearchTerm.YEAR));
        String ratingCriteria = criteria.get(SearchTerm.RATING);
        String directorCriteria = criteria.get(SearchTerm.DIRECTOR);
        String studioCriteria = criteria.get(SearchTerm.STUDIO);
        
        Predicate<DVD> titleMatches;
        Predicate<DVD> yearMatches;
        Predicate<DVD> ratingMatches;
        Predicate<DVD> directorMatches;
        Predicate<DVD> studioMatches;
        
        Predicate<DVD> truePredicate = (c) -> {return true;};
        
        titleMatches = (titleCriteria == null || titleCriteria.isEmpty()) 
                ? truePredicate : (c) -> c.getTitle().equals(titleCriteria);
        
        yearMatches = (yearCriteria == 0) ? truePredicate : (c) -> c.getReleaseYear() == yearCriteria;
                
        ratingMatches = (ratingCriteria == null || ratingCriteria.isEmpty()) 
                ? truePredicate : (c) -> c.getMPAArating().equals(ratingCriteria);
        
        directorMatches = (directorCriteria == null || directorCriteria.isEmpty()) 
                ? truePredicate : (c) -> c.getDirector().equals(directorCriteria);
        
        studioMatches = (studioCriteria == null || studioCriteria.isEmpty()) 
                ? truePredicate : (c) -> c.getStudio().equals(studioCriteria);
        
        return dvdMap.values().stream()
                .filter(titleMatches .and (yearMatches) .and (ratingMatches)
                        .and (directorMatches) .and (studioMatches))
                        .collect(Collectors.toList());
    }

    }
