/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.dao;

import com.mycompany.dvdproject.dto.DVD;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.ArrayList;
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
    private HashMap<String, DVD> dvdMap;

    public dao() {
        dvdMap = new HashMap<>();
        FILE_NAME = "DVDLibrary2.txt";

    }

    public void loadFromFile() throws IOException {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String nextDVDLine = sc.nextLine();

                String[] DVDProperties = nextDVDLine.split(DELIMITER);

                DVD dvd = new DVD();
                dvd.setTitle(DVDProperties[0]);
                dvd.setMPAArating(DVDProperties[2]);
                dvd.setDirector(DVDProperties[3]);
                dvd.setStudio(DVDProperties[4]);
                
                ArrayList arr = new ArrayList<>();
                for (int j = 5; j < DVDProperties.length; j++) {
                    arr.add(DVDProperties[j]);
                }
                dvd.setComments(arr);

                
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

    public void addDVD(DVD dvd) {
        dvdMap.put(dvd.getTitle(), dvd);
    }

    public DVD removeDVD(String title) {
        return dvdMap.remove(title);

    }

    public void updateDVD(DVD changeDVD) {
        dvdMap.put(changeDVD.getTitle(), changeDVD);

    }

    public void displayDVDInfo() {

    }

    public DVD getDVDInfo(String title) {
        return dvdMap.get(title);

    }
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

    public Collection<DVD> getallDVDs() {
        return dvdMap.values();

    }

    public void searchByTitle() {
    }

    public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (DVD d : dvdMap.values()) {
            writer.println(d.getTitle() + DELIMITER + d.getReleaseYear()
                    + DELIMITER + d.getMPAArating() + DELIMITER
                    + d.getDirector() + DELIMITER + d.getStudio()
                    + DELIMITER + d.getComments());
        }
            writer.flush();
            writer.close();

        }
    }
