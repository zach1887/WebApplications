/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject.ops;

import com.mycompany.dvdproject.dao.DVDLibraryImpl;
import com.mycompany.dvdproject.dto.DVD;
import com.mycompany.dvdproject.ui.ConsoleIO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Predicate;

/**
 *
 * @author Jesse
 */
public class DVDController {

    DVDLibraryImpl AccessObject = new DVDLibraryImpl();
    ConsoleIO console = new ConsoleIO();

    public void run() throws IOException {

        AccessObject.loadFromFile();
        boolean keepRunning = true;
        int userChoice, searchChoice, menuChoice, statsChoice;

        while (keepRunning) {
            userChoice = display_menu();
            switch (userChoice) {
                case 1:
                    add_to_library();
                    break;
                case 2:
                    removeDVD();
                    break;
                case 3:
                    editDVD();
                    break;
                case 4:
                    listAllDVDs();
                    break;
                case 5:
                    searchMenu();

                    break;
                case 6:
                    statsMenu();
                    break;
                case 7:
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
        console.print("Enter the search menu(5). ");
        console.print("Compute various statistics for your collection(6).");
        console.print("Save all changes and exit the system (7).");
        int choice = console.readInt("Your selection:  ", 1, 7);
        return choice;
    }

    private void add_to_library() {
        DVD dvd = new DVD();
        String newTitle = console.readString("Enter the title of the DVD you are adding to the collection:");
        int NewYear = console.readInt("Enter the year of the DVD you are adding to the collection:");
        String newRating = console.readString("Enter the MPAA rating of the DVD you are adding to the collection:");
        String newDirector = console.readString("Enter the director of the DVD you are adding to the collection:");
        String newStudio = console.readString("Enter the studio of the DVD you are adding to the collection:");
        String newComment = console.readString("Enter any comments of the DVD you are adding to the collection:");
        ArrayList newComments = new ArrayList<>();
        while (!newComment.isEmpty()) {
            newComments.add(newComment);
            newComment = console.readString("Enter any additional comments or enter to quit:");
        }

        dvd.setTitle(newTitle);
        dvd.setReleaseYear(NewYear);
        dvd.setMPAArating(newRating);
        dvd.setDirector(newDirector);
        dvd.setStudio(newStudio);
        dvd.setComments(newComments);

        AccessObject.addDVD(dvd);
    }

    private void removeDVD() {
        String delDVD = console.readString("Enter the title of the DVD you would like to remove from the collection:");
        DVD deletedDVD = AccessObject.removeDVD(delDVD);

        if (deletedDVD == null) {
            console.print("That title is not part of the collection.");
        } else {
            AccessObject.removeDVD(delDVD);
            console.print("The DVD with title " + delDVD + " has been removed from the collection.");
        }

    }

    private void editDVD() {
        String changeTitle = console.readString("Enter the name of the DVD you would like to edit:  ");
        DVD changeDVD = AccessObject.getDVDInfo(changeTitle);

        if (changeDVD == null) {
            console.print("That DVD title does not match any in the collection.");
            return;
        }
        String oldTitle = changeDVD.getTitle();
        int oldYear = changeDVD.getReleaseYear();
        String oldMPAA = changeDVD.getMPAArating();
        String oldDirector = changeDVD.getDirector();
        String oldStudio = changeDVD.getStudio();
        ArrayList oldComments = changeDVD.getComments();
        String newTitle = null;
        int newYear = 0;
        String newMPAA = null;
        String newDirector = null;
        String newStudio = null;
        String newComments = null;

        boolean runEditMenu = true;
        int editChoice;
        while (runEditMenu) {
            editChoice = displayEditMenu();
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
                    newComments = console.readString("Enter the new comments for the DVD.  Note that *all* previous comments will be replaced.");
                    ArrayList newCom = new ArrayList<>();
                    while (!newComments.isEmpty()) {
                        newCom.add(newComments);
                        newComments = console.readString("Enter additional comments or enter to quit:  ");
                    }
                    changeDVD.setComments(newCom);
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

    private void searchByTitle(String search) {
        Collection<DVD> dvd = AccessObject.getallDVDs();

        dvd.stream().filter((d) -> (d.getTitle().contains(search))).forEach((d) -> {
            console.print(d.getTitle() + " " + d.getReleaseYear()
                    + d.getMPAArating() + " " + d.getDirector()
                    + " " + d.getStudio() + "\n" + d.getComments());
        });

    }

    private void search_titles_by_Year(String search) {
        Collection<DVD> dvd = AccessObject.getallDVDs();

        dvd.stream().mapToInt(d -> d.getReleaseYear()).max().getAsInt();

    }

    private void listAllDVDs() {
        Collection<DVD> dvds = AccessObject.getallDVDs();

        if (dvds.isEmpty()) {
            console.print("There are no DVDs entered in the collection.");
        } else {
            for (DVD d : dvds) {
                console.print(d.getTitle() + " " + d.getReleaseYear());
            }
        }
    }

    private int displayEditMenu() {
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

    private int displayStatsMenu() {
        console.print("Select from the options below:");
        console.print("Compute the average age of all titles (1).");
        console.print("Locate the newest titles in the collection (2).");
        console.print("Locate the oldest titles in the collection (3).");
        console.print("Compute the average number of notes per title (4).");
        console.print("Return to main menu (5).");
        int userChoice = console.readInt("Your selection:  ", 1, 5);
        return userChoice;
    }

    private void statsMenu() {
        Collection<DVD> dvd = AccessObject.getallDVDs();
        boolean runStatMenu = true;
        while (runStatMenu) {
        int choice = displayStatsMenu();
        switch (choice) {
            case 1:
                double avgYear = dvd.stream().mapToInt(d -> d.getReleaseYear()).average().getAsDouble();
                console.print("The average year of release is " + (int) avgYear + "or about " + (2016 - avgYear) + " years old.");
                break;
            case 2:
                int minYear = dvd.stream().mapToInt(d -> d.getReleaseYear()).max().getAsInt();
                dvd.stream().filter(d -> d.getReleaseYear() == minYear).forEach(d -> System.out.println(d.getTitle() + " " + d.getReleaseYear()));
                break;
            case 3:
                int maxYear = dvd.stream().mapToInt(d -> d.getReleaseYear()).min().getAsInt();
                dvd.stream().filter(d -> d.getReleaseYear() == maxYear).forEach(d -> System.out.println(d.getTitle() + " " + d.getReleaseYear()));
                break;
            case 4:
                double avgNotes = dvd.stream().mapToInt(d -> d.getComments().size()).average().getAsDouble();
                console.print("There are an average of " + avgNotes + " notes per title.");
                break;
            case 5:
                runStatMenu = false;
            default:
                break;
        }

    }
}

private int displaySearchMenu() {
        console.print("Select from the options below:");
        console.print("Search collection by title (1).");
        console.print("Search collection for a given year (2).");
        console.print("List all titles within a given range of years (3).");
        console.print("List all titles by a given director (4).");
        console.print("List all titles from a given studio (5).");
        console.print("Return to main menu (6).");
        int userChoice = console.readInt("Your selection:  ", 1, 6);
        return userChoice;

    }

    private void searchMenu() {
        Collection<DVD> dvd = AccessObject.getallDVDs();
        boolean runSearch = true;
        
        while (runSearch) {
            int choice = displaySearchMenu();

            switch (choice) {
                case 1:
                    String input = console.readString("Enter a part of the title:  ");
                    dvd.stream().filter(p -> p.getTitle().contains(input)).forEach(p -> System.out.println(p.getTitle() + " " + p.getReleaseYear()));
                    break;
                case 2:
                    int inputYr = console.readInt("Enter a year:  ");
                    dvd.stream().filter(p -> p.getReleaseYear() == inputYr).forEach(p -> System.out.println(p.getTitle() + " " + p.getReleaseYear()));
                    break;
                case 3:
                    int begYr = console.readInt("Enter the lower number of the year range:  ");
                    int endYr = console.readInt("Enter the higher number of the year range:  ");
                    dvd.stream().filter(p -> p.getReleaseYear() >= begYr && p.getReleaseYear() <= endYr).forEach(p -> System.out.println(p.getTitle() + " " + p.getReleaseYear()));
                    break;
                case 4:
                    String dir = console.readString("Enter the full name of the director:  ");
                    dvd.stream().filter(p -> p.getDirector().contains(dir)).forEach(p -> System.out.println(p.getTitle() + " " + p.getReleaseYear()));
                    break;
                case 5:
                    String stud = console.readString("Enter the full name of the studio:  ");
                    dvd.stream().filter(p -> p.getStudio().contains(stud)).forEach(p -> System.out.println(p.getTitle() + " " + p.getReleaseYear()));
                    break;
                case 6:
                    runSearch = false;
                default:
                    break;

            }

        }
    }

}
