/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.addressbookproject.ops;

import com.tsguild.addressbookproject.ConsoleIO;

/**
 *
 * @author apprentice
 */
public class AddressBook_Controller {

    ConsoleIO console = new ConsoleIO();

    public void run() {

        boolean keepRunning = true;

        print_menu();
        int userChoice = console.readInt("Enter a value from 1 to 6.", 1, 6);

        while (keepRunning) {
            switch (userChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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
        console.print("3. Find an address by last name.");
        console.print("4. List the number of addresses in the database.");
        console.print("5. List all addresses in the database.");
        console.print("6.  Save and exit the program.");

    }
}
