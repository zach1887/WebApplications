/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.dao;

import com.mycompany.dvdproject.dto.DVD;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Jesse
 */
public interface DVDLibraryAPI {

    void addDVD(DVD dvd);

    void displayDVDInfo();

    DVD getDVDInfo(String title);
    //     public Collection<DVDObject> getAllDVDs (String search){
    //         for (DVD d : dvdMap.values()) {
    //             if (d.getTitle().contains(search.)) {
    //                 console.print(d.getTitle() + "  " + d.getReleaseYear() + " "
    //                                + d.getMPAArating() + " " + d.getDirector() + " "
    //                                + d.getStudio() + "\n" + d.getComments() );
    //             }
    //
    //         }
    //         return dvdMap.values();
    //     }
    //

    Collection<DVD> getallDVDs();

    void loadFromFile() throws IOException;

    DVD removeDVD(String title);

    void saveToFile() throws IOException;

    void searchByTitle();

    void updateDVD(DVD changeDVD);
    
}
