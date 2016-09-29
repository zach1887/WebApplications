/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.addressbookproject.dao;

import com.tsguild.addressbookprojects.dto.AddressDTO;
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
public class AddressBookDAO {

    public final String FILE_NAME;
    private HashMap<String, AddressDTO> addressBook;
    private final String DELIMITER = "::";

    public AddressBookDAO() {
        FILE_NAME = "AddressBook.txt";
        addressBook = new HashMap<>();
    }

    public void addAddress(AddressDTO address) {
        addressBook.put(address.getFirstName() + " " + address.getSecondName(), address);
    }

    public AddressDTO removeAddress(String delName) {
        return addressBook.remove(delName);
    }

    public Collection<AddressDTO> getAllAddresses() {
        return addressBook.values();
    }

}
