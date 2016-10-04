/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.ops;

import com.mycompany.dvdproject.dao.dao;
import com.mycompany.dvdproject.dto.DVDObject;
import com.mycompany.dvdproject.ui.ConsoleIO;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author Jesse
 */
public class DVDCommander {

    dao AccessObject = new dao();
    ConsoleIO console = new ConsoleIO();

    public void run() throws IOException {

        AccessObject.loadFromFile();
        boolean keepRunning = true;
        int userChoice;

        while (keepRunning) {
            userChoice = display_menu();
            switch (userChoice) {
                case 1:
                    add_to_library();
                    break;
                case 2:
                    remove_from_library();
                    break;
                case 3:
                    edit_DVD_from_library();
                    break;
                case 4:
                    list_all_DVDs();
                    break;
                case 5:
                    String search = console.readString("Enter a part of the title you are searching for:  ");
                    search_titles_in_library(search);
                    break;
                case 6:
                    AccessObject.saveToFile();
                    keepRunning = false;
                    break;
                default:
                    break;
            }

        }

    }

    public int display_menu() {
        console.print("Welcome to the DVD Library");
        console.print("Please select from the choices below.");
        console.print("Add a DVD to the library (1).");
        console.print("Remove a DVD from the library (2).");
        console.print("Edit information for a DVD in the library (3).");
        console.print("List all DVD's in the library (4).");
        console.print("Search for information by DVD title. (5)");
        console.print("Save all changes and exit the system. (6)");
        int choice = console.readInt("Your selection:  ", 1, 6);
        return choice;
    }

    private void add_to_library() {
        DVDObject dvd = new DVDObject();
        String newTitle = console.readString("Enter the title of the DVD you are adding to the collection:");
        int NewYear = console.readInt("Enter the year of the DVD you are adding to the collection:");
        String newRating = console.readString("Enter the MPAA rating of the DVD you are adding to the collection:");
        String newDirector = console.readString("Enter the director of the DVD you are adding to the collection:");
        String newStudio = console.readString("Enter the studio of the DVD you are adding to the collection:");
        String newComments = console.readString("Enter any comments of the DVD you are adding to the collection:");
        dvd.setTitle(newTitle);
        dvd.setReleaseYear(NewYear);
        dvd.setMPAArating(newRating);
        dvd.setDirector(newDirector);
        dvd.setStudio(newStudio);
        dvd.setComments(newComments);

        AccessObject.addDVD(dvd);
    }

    private void remove_from_library() {
        String delDVD = console.readString("Enter the title of the DVD you would like to remove from the collection:");
        DVDObject deletedDVD = AccessObject.removeDVD(delDVD);

        if (deletedDVD == null) {
            console.print("That title is not part of the collection.");
        } else {
            AccessObject.removeDVD(delDVD); 
            console.print("The DVD with title " + delDVD + " has been removed from the collection.");
        }
            
        }


    private void edit_DVD_from_library() {
        String changeTitle = console.readString("Enter the name of the DVD you would like to edit:  ");
        DVDObject changeDVD = AccessObject.getDVDInfo(changeTitle);

        if (changeDVD == null) {
            console.print("That DVD title does not match any in the collection.");
            return;
        }
        String oldTitle = changeDVD.getTitle();
        int oldYear = changeDVD.getReleaseYear();
        String oldMPAA = changeDVD.getMPAArating();
        String oldDirector = changeDVD.getDirector();
        String oldStudio = changeDVD.getStudio();
        String oldComments = changeDVD.getComments();
        String newTitle = null;
        int newYear = 0;
        String newMPAA = null;
        String newDirector = null;
        String newStudio = null;
        String newComments = null;

        boolean runEditMenu = true;
        int editChoice;
        while (runEditMenu) {
            editChoice = display_edit_menu();
            switch (editChoice) {
                case 1:
                    newTitle = console.readString("Enter the new title for the DVD.");
                    changeDVD.setTitle(newTitle);
                    break;
                case 2:
                    newYear = console.readInt("Enter the new release year for the DVD.");
                    changeDVD.setReleaseYear(newYear);
                    break;
                case 3:
                    newMPAA = console.readString("Enter the new MPAA rating for the DVD.");
                    changeDVD.setMPAArating(newMPAA);
                    break;
                case 4:
                    newDirector = console.readString("Enter the new director for the DVD.");
                    changeDVD.setDirector(newDirector);
                    break;
                case 5:
                    newStudio = console.readString("Enter the new studio of the DVD.");
                    changeDVD.setStudio(newStudio);
                    break;
                case 6:
                    newComments = console.readString("Enter the new comments for the DVD.");
                    changeDVD.setComments(newComments);
                    break;
                case 7:
                    changeDVD.setTitle(oldTitle);
                    changeDVD.setReleaseYear(oldYear);
                    changeDVD.setMPAArating(oldMPAA);
                    changeDVD.setDirector(oldDirector);
                    changeDVD.setStudio(oldStudio);
                    changeDVD.setComments(oldComments);
                    console.print("Your changes have not been saved.");
                    runEditMenu = false;
                    break;
                case 8:
                    if (newTitle == null) {
                        changeDVD.setTitle(oldTitle);
                    }
                    if (newYear == 0) {
                        changeDVD.setReleaseYear(oldYear);
                    }
                    if (newMPAA == null) {
                        changeDVD.setMPAArating(oldMPAA);
                    }
                    if (newDirector == null) {
                        changeDVD.setDirector(oldDirector);
                    }
                    if (newStudio == null) {
                        changeDVD.setStudio(oldStudio);
                    }
                    if (newComments == null) {
                        changeDVD.setComments(oldComments);
                    }

                    if (newTitle == null) {
                        AccessObject.updateDVD(changeDVD);
                    } else {
                        AccessObject.removeDVD(oldTitle);
                        AccessObject.updateDVD(changeDVD);
                    }
                    console.print("Your changes have been saved.");
                    runEditMenu = false;
                    break;
                default:
                    break;

            }

        }
    }

    private void search_titles_in_library(String search) {
       Collection<DVDObject> dvd= AccessObject.getallDVDs();
       
       for (DVDObject d : dvd){
           if (d.getTitle().contains(search)) {
               console.print(d.getTitle() + " " + d.getReleaseYear() 
                             + d.getMPAArating() + " " + d.getDirector()
                             + " " + d.getStudio() + "\n" + d.getComments());
           }
       }
          
    }

    private void list_all_DVDs() {
        Collection<DVDObject> dvds = AccessObject.getallDVDs();

        if (dvds.isEmpty()) {
            console.print("There are no DVDs entered in the collection.");
        } else {
            for (DVDObject d : dvds) {
                console.print(d.getTitle() + " " + d.getReleaseYear());
            }
        }
    }

    private int display_edit_menu() {
        console.print("Select from the options below.");
        console.print("Change the DVD title (1).");
        console.print("Change the DVD release year (2).");
        console.print("Change the MPAA rating (3).");
        console.print("Change the director of the DVD (4).");
        console.print("Change the studio of the DVD (5).");
        console.print("Change the comments for the DVD (6).");
        console.print("Cancel all changes and exit (7).");
        console.print("Save all changes and exit(8).");
        int userChoice = console.readInt("Your selection:  ", 1, 8);
        return userChoice;
    }

}
