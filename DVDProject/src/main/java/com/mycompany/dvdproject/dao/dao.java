/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.dao;

import com.mycompany.dvdproject.dto.DVDObject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesse
 */
public class dao {

    private String FILE_NAME;
    private final String DELIMITER = "::";
    private HashMap<String, DVDObject> dvdMap;

    public dao() {
        dvdMap = new HashMap<>();
        FILE_NAME = "DVDLibrary.txt";

    }

    public void loadFromFile() throws IOException {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String nextDVDLine = sc.nextLine();

                String[] DVDProperties = nextDVDLine.split(DELIMITER);

                DVDObject dvd = new DVDObject();
                dvd.setTitle(DVDProperties[0]);
                dvd.setMPAArating(DVDProperties[2]);
                dvd.setDirector(DVDProperties[3]);
                dvd.setStudio(DVDProperties[4]);
                dvd.setComments(DVDProperties[5]);

                try {
                    int releaseYear = Integer.parseInt(DVDProperties[1]);
                    dvd.setReleaseYear(releaseYear);
                } catch (NumberFormatException e) {
                    continue;
                }
                dvdMap.put(dvd.getTitle(), dvd);

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            new FileWriter(FILE_NAME);
        }
    }

    public void addDVD(DVDObject dvd) {
        dvdMap.put(dvd.getTitle(), dvd);
    }

    public DVDObject removeDVD(String title) {
        return dvdMap.remove(title);

    }

    public void updateDVD(DVDObject changeDVD) {
        dvdMap.put(changeDVD.getTitle(), changeDVD);

    }

    public void displayDVDInfo() {

    }

    public DVDObject getDVDInfo(String title) {
        return dvdMap.get(title);

    }
//     public Collection<DVDObject> getAllDVDs (String search){
//         for (DVDObject d : dvdMap.values()) {
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

    public Collection<DVDObject> getallDVDs() {
        return dvdMap.values();

    }

    public void searchByTitle() {
    }

    public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (DVDObject d : dvdMap.values()) {
            writer.println(d.getTitle() + DELIMITER + d.getReleaseYear()
                    + DELIMITER + d.getMPAArating() + DELIMITER
                    + d.getDirector() + DELIMITER + d.getStudio()
                    + DELIMITER + d.getComments());
        }
            writer.flush();
            writer.close();

        }
    }
