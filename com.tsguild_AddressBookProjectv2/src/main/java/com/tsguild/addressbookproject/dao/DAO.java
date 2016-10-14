/*
 * To change this license header, choose License Headers in ProjectProperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.addressbookproject.dao;

import com.tsguild.addressbookprojects.dto.Entry;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class DAO {

    public final String FILE_NAME;
    private HashMap<String, Entry> addressBook;
    private final String DELIMITER = "::";

    public DAO() {
        FILE_NAME = "AddressBook.txt";
        addressBook = new HashMap<>();
    }

    public void loadFromFile() throws IOException {

        try {
            Scanner houseScanner = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (houseScanner.hasNextLine()) {
                String houseLine = houseScanner.nextLine();
                String[] houseProperties = houseLine.split(DELIMITER);

//                if (houseProperties.length != 6) {
//                    continue;
//                }

                Entry oneHouse = new Entry();
                oneHouse.setFirstName(houseProperties[0]);
                oneHouse.setSecondName(houseProperties[1]);
                oneHouse.setStreetAddress(houseProperties[2]);
                oneHouse.setCity(houseProperties[3]);
                oneHouse.setStateAbbrev(houseProperties[4]);

                try {
                    int zipC = Integer.parseInt(houseProperties[5]);
                    oneHouse.setZipCode(zipC);
                } catch (NumberFormatException e) {
                    continue;
                }
                addressBook.put(oneHouse.getFirstName() + " " +oneHouse.getSecondName() , oneHouse);
          }

        } catch (FileNotFoundException ex) {
            new FileWriter(FILE_NAME);
        }

    }

    public void addAddress(Entry address) {
        addressBook.put(address.getFirstName() + " " + address.getSecondName(), address);
    }

    public Entry getAddress(String nameEntered) {
        return addressBook.get(nameEntered);
    }

    public Entry removeAddress(String delName) {
        return addressBook.remove(delName);
    }

    public Collection<Entry> getAllAddresses() {
        return addressBook.values();
    }

    public void updateAddress(String editName, Entry address) {
        addressBook.put(editName, address);
    }

    public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (Entry a : addressBook.values()) {
            writer.println(a.getFirstName() + DELIMITER + a.getSecondName()
                    + DELIMITER + a.getStreetAddress() + DELIMITER
                    + a.getCity() + DELIMITER + a.getStateAbbrev()
                    + DELIMITER + a.getZipCode());
        }
        writer.flush();
        writer.close();

    }
}
