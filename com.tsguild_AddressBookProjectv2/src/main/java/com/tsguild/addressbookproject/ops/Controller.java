/*
 * To change this license header, choose License Headers in ProjectProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.addressbookproject.ops;

import com.tsguild.addressbookproject.ui.ConsoleIO;
import com.tsguild.addressbookprojects.dto.Entry;
import com.tsguild.addressbookproject.dao.DAO;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class Controller {

    ConsoleIO console = new ConsoleIO();
    DAO dao = new DAO();
    Entry address = new Entry();

    public void run() {

        try {
            dao.loadFromFile();
        } catch (IOException ex) {
            console.print("Unable to locate file.");
        }

        boolean keepRunning = true;

        while (keepRunning) {
            print_menu();
            int userChoice = console.readInt("Enter a value from 1 to 7.", 1, 7);

            switch (userChoice) {
                case 1:
                    this.addAddress();
                    break;
                case 2:
                    this.removeAddress();
                    break;
                case 3:
                    displaySearchMenu();
                    break;
                case 4:
                    console.print("There are a total of " + countAllAddresses()
                            + " addresses in this book.");
                    break;
                case 5:
                    this.listAllAddresses();
                    break;
                case 6:
                    this.editAddress();
                    break;
                case 7: {
                    try {
                        dao.saveToFile();
                    } catch (IOException ex) {
                        console.print("Unable to save to file location.");
                        String ans = console.readString("Are you sure you want to quit (y/n)? Changes have not been saved.");
                        if (ans.equalsIgnoreCase("y")) {
                            console.print("You have exited the system.");
                            keepRunning = false;
                        }
                    }
                }
                console.print("Any changes that you made have been saved.");
                keepRunning = false;
                break;
                default:
                    break;
            }

        }
    }

    public void print_menu() {
        console.print("Address Book Options:");
        console.print("1. Add an address to the database.");
        console.print("2. Delete an address to the database.");
//        console.print("3. Find an address by last name.");
        console.print("3. Enter the search menu.");
        console.print("4. List the number of addresses in the database.");
        console.print("5. List all addresses in the database.");
        console.print("6. Edit an existing address.");
        console.print("7. Save and exit the program.");

    }

    private void addAddress() {
        String firstName = console.readString("Enter the first name for the new address:");
        String lastName = console.readString("Enter the last name for the new address:");
//        if (!address.getFirstName().isEmpty() && !address.getSecondName().isEmpty()) {
//            console.print("There is already someone in the system with that name.");
//            return;
//        }

        String addressLine1 = console.readString("Enter the street address:");
        String city = console.readString("Enter the city name for the new address.");
        String state = console.readString("Enter the two-letter state abbreviation for the new address:");
        state = validateStateAbbrev(state);
        int zip = console.readInt("Enter the zip code of the new address.");
        zip = validateZipCode(zip);

        address.setFirstName(firstName);
        address.setSecondName(lastName);
        address.setStreetAddress(addressLine1);
        address.setCity(city);
        address.setStateAbbrev(state);
        address.setZipCode(zip);

        dao.addAddress(address);

    }

    private void removeAddress() {
        String delName = console.readString("Enter the full name of the address you would like to delete: ");
        Entry delAddress = dao.removeAddress(delName);

        if (delAddress == null) {
            console.print("There are no matching names in the system");
        } else {
            console.print("The entry for " + delAddress.getFirstName() + " " + "has been removed from the address book.");
        }
    }

    private void locate_address_by_name() {
        String findName = console.readString("Please enter the last name of the person you are trying to find.");
        Collection<Entry> addresses = dao.getAllAddresses();
        for (Entry a : addresses) {
            if (findName.equals(a.getSecondName())) {
                console.print(a.getFirstName() + " " + a.getSecondName());
                console.print(a.getStreetAddress());
                console.print(a.getCity() + ", " + a.getStateAbbrev() + " " + a.getZipCode());
            }

        }
    }

    private void listAllAddresses() {
        console.print("Here are all the addresses in the book:");

        Collection<Entry> addresses = dao.getAllAddresses();
        for (Entry a : addresses) {
            console.print(a.getFirstName() + " " + a.getSecondName());
            console.print(a.getStreetAddress());
            console.print(a.getCity() + ", " + a.getStateAbbrev() + " " + a.getZipCode());
        }

    }

    private void editAddress() {
        String editName = console.readString("Please enter the full name of the address you would like to change.");
        // verfiy that the name is there
        //      address newInfo= dao.
        Entry newName = dao.getAddress(editName);

        if (newName == null) {
            console.print("There is no one with that name in the system.");
            return;
        }

//            private void updatePet() {
//        console.print("**** UPDATE PET RECORD ****");
//        int petId = console.readInt("Pet ID: ");
//        Pet pet = dao.getPet(petId);
        boolean runMenu = true;

        String oldFirstName = newName.getFirstName();
        String oldSecondName = newName.getSecondName();
        String oldAddress = newName.getStreetAddress();
        String oldCity = newName.getCity();
        String oldState = newName.getStateAbbrev();
        int oldZip = newName.getZipCode();
        String newFirst = null;
        String newSecond = null;
        String newAddress = null;
        String newCity = null;
        String newState = null;
        int newZip = 0;
        //     menuChoice: displayEditMenu();
        while (runMenu) {
            int menuChoice = displayEditMenu();
            switch (menuChoice) {

                case 1: {
                    newFirst = console.readString("Enter in the new first name:");
                    newName.setFirstName(newFirst);
                    break;
                }
                case 2: {
                    newSecond = console.readString("Enter in the new last name:");
                    newName.setSecondName(newSecond);
                    break;
                }
                case 3: {
                    newAddress = console.readString("Enter in the new address:");
                    newName.setStreetAddress(newAddress);
                    break;
                }
                case 4: {
                    newCity = console.readString("Enter in the new city:");
                    newName.setCity(newCity);
                    break;
                }
                case 5: {
                    newState = console.readString("Enter in the new state abbreviation:");
                    newState = validateStateAbbrev(newState);
                    newName.setStateAbbrev(newState);

                    break;
                }
                case 6: {
                    newZip = console.readInt("Enter in the new zip code:");
                    newZip = validateZipCode(newZip);
                    newName.setZipCode(newZip);
                    break;
                }
                case 7: {
                    newName.setFirstName(oldFirstName);
                    newName.setSecondName(oldSecondName);
                    newName.setStateAbbrev(oldAddress);
                    newName.setCity(oldCity);
                    newName.setStateAbbrev(oldState);
                    newName.setZipCode(oldZip);
                    console.print("Your changes were not saved.");
                    runMenu = false;
                    break;
                }
                case 8:
                    if (newFirst == null) {
                        newName.setFirstName(oldFirstName);
                    }
                    if (newSecond == null) {
                        newName.setSecondName(oldSecondName);
                    }
                    if (newAddress == null) {
                        newName.setStreetAddress(oldAddress);
                    }
                    if (newCity == null) {
                        newName.setCity(oldCity);
                    }
                    if (newState == null) {
                        newName.setStateAbbrev(oldState);
                    }
                    if (newZip == 0) {
                        newName.setZipCode(oldZip);
                    }

                    if (!newName.getFirstName().equals(oldFirstName)
                            || !newName.getSecondName().equals(oldSecondName)) {
                        dao.removeAddress(editName);
                        dao.updateAddress(address.getFirstName() + " " + address.getSecondName(), newName);
                    } else {
                        dao.updateAddress(editName, newName);
                    }
                    runMenu = false;
                    break;

                default: {
                    break;
                }

            }

        }
    }

    private void searchMenu(int searchChoice) {
        boolean runSearch = true;
        Collection<Entry> entries = dao.getAllAddresses();
        while (runSearch) {
            switch (searchChoice) {
                case 1:
                    String entryName = console.readString("Enter the last name of the person you are searching:");
                    entries.stream().filter(d -> d.getSecondName().contains(entryName))
                            .forEach(d -> console.print(d.getFirstName() + " " + d.getSecondName()
                                    + "\n" + d.getStreetAddress() + "\n" + d.getCity() + ", "
                                    + d.getStateAbbrev() + "  " + d.getZipCode()));
                    break;

                case 2:
                    String cityName = console.readString("Enter the name of the city:");
                    entries.stream().filter(d -> d.getCity().contains(cityName))
                            .forEach(d -> console.print(d.getFirstName() + " " + d.getSecondName()
                                    + "\n" + d.getStreetAddress() + "\n" + d.getCity() + ", "
                                    + d.getStateAbbrev() + "  " + d.getZipCode()));
                    break;

                case 3:
                    String Abbrev = console.readString("Enter the two-letter state abbreviation:");
                    String stAbb = validateStateAbbrev(Abbrev);
                    entries.stream().filter(d -> d.getStateAbbrev().contains(stAbb)).sorted()
                            .forEach(d -> console.print(d.getFirstName() + " " + d.getSecondName()
                                    + "\n" + d.getStreetAddress() + "\n" + d.getCity() + ", "
                                    + d.getStateAbbrev() + "  " + d.getZipCode()));
                    break;

                case 4:
                    int code = console.readInt("Enter the zip code:");
                    int zipCode = validateZipCode(code);
                    entries.stream().filter(d -> d.getZipCode()== zipCode).sorted()
                            .forEach(d -> console.print(d.getFirstName() + " " + d.getSecondName()
                                    + "\n" + d.getStreetAddress() + "\n" + d.getCity() + ", "
                                    + d.getStateAbbrev() + "  " + d.getZipCode()));
                    break;
                case 5:
                    runSearch = false;
                    break;

                default:
                    break;

            }
        }
    }

    


    

    private int countAllAddresses() {
        Collection<Entry> addresses = dao.getAllAddresses();
        return addresses.size();

    }

    private int displayEditMenu() {
        console.print("Select from the following options.");
        console.print("Change the first name of the entry (1).");
        console.print("Change the last name of the entry (2).");
        console.print("Change the address of the entry (3).");
        console.print("Change the city of the entry (4).");
        console.print("Change the state abbreviation of the entry (5).");
        console.print("Change the zip code of the entry (6).");
        console.print("Cancel changes an return to main menu (7).");
        console.print("Save changes and go back to the main menu.(8).");
        return console.readInt("Your selection:  ", 1, 8);
    }

    private int validateZipCode(int zip) {

        while ((zip < 10000 || zip > 99999)
                && (zip < 1000000000 || zip > 999999999)) {
            console.print("The input is invalid.  Zip codes may only contain 5 digits or 9 digits.");
            zip = console.readInt("Enter the zip code of the new address.");
        }
        return zip;
    }

    private String validateStateAbbrev(String state) {
        boolean isLetter1, isLetter2;

        do {
            if ((state.charAt(0) >= 'a' && state.charAt(0) <= 'z')
                    || (state.charAt(0) >= 'A' && state.charAt(0) <= 'Z')) {
                isLetter1 = true;
            } else {
                isLetter1 = false;
            }

            if ((state.charAt(1) >= 'a' && state.charAt(1) <= 'z')
                    || (state.charAt(1) >= 'A' && state.charAt(1) <= 'Z')) {
                isLetter2 = true;
            } else {
                isLetter2 = false;
            }

            if (state.length() != 2 || !isLetter1 || !isLetter2) {
                console.print("The input is invalid.");
                state = console.readString("Enter the two-letter state abbreviation for the new address:");
            }
        } while (state.length() != 2 || !isLetter1 || !isLetter2);

        return state;

    }

    private int displaySearchMenu() {
        console.print("Select one of the options below.");
        console.print("1. Search by last name.");
        console.print("2. Search by city.");
        console.print("3. Search by state.");
        console.print("4. Search by zip code.");
        console.print("Return to the main menu. (5)");
        int searchChoice = console.readInt("Your selection:  ", 1, 5);
        return searchChoice;
    }
}
