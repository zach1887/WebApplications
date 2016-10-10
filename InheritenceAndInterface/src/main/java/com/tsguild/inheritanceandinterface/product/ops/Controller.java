/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product.ops;

import com.tsguild.inheritanceandinterface.product.ui.ConsoleIO;
import com.tsguild.inheritanceandinterface.product.dao.Inventory;
import com.tsguild.inheritanceandinterface.product.dto.Product;
import java.util.HashMap;

/**
 *
 * @author Jesse
 */
public class Controller {

    ConsoleIO console = new ConsoleIO();
    Inventory inv = new Inventory();
    HashMap<String, com.tsguild.inheritanceandinterface.product.Product> inventoryMap = new HashMap<>();

    public void run() {
        int userChoice;
        int newChoice, newStockNum, newStockAmt, addInvChoice, remInvChoice, valItemChoice;
        String newName, itemKey = "";
        double newPrice;

        boolean keepRunning = true;
        
        while (keepRunning) {
        userChoice = displayMenuOptions();
        switch (userChoice) {
            case 1:
                console.print("What category will the new item belong to?");
                newChoice = displayItemMenu();
                if (newChoice == 5) {
                    break;
                } else {
                    createNewItem(newChoice);
                }
                break;

            case 2:
                console.print("What category contains the item whose stock you would like to replenish?");
                addInvChoice = displayItemMenu();
                if (addInvChoice == 5) {
                    break;
                }
                addInvChoice(addInvChoice);
                break;

            case 3:
                console.print("What category contains the item whose stock you would like to replenish?");
                remInvChoice = displayItemMenu();
                break;

            case 4:
                listAllInventory();
                break;

            case 5:
                console.print("What category contains the item whose stock you would like to valuate?");
                valItemChoice = displayItemMenu();
                break;

            case 6:
                calculateValInventory();
                break;

            case 7:
                keepRunning = false;
                break;

            default:
                break;
        }

    }
    }

    private int displayMenuOptions() {
        console.print("Welcome to the department store inventory homepage.");
        console.print("Select from the options below.");
        console.print("Add a new item to the inventory (1).");
        console.print("Add stock to an existing item (2).");
        console.print("Remove stock from an existing item (3).");
        console.print("List all current inventory (4).");
        console.print("Calculate the value of the existing stock of one item (5).");
        console.print("Calculate the value of the entire inventory (6).");
        console.print("Save changes and exit the program (7).");
        int userChoice = console.readInt("Your selection", 1, 7);
        return userChoice;
    }

    private int displayItemMenu() {
        console.print("Dress shirt (1).");
        console.print("Suit coat(2).");
        console.print("Suit pants (3).");
        console.print("Accessory(4).");
        console.print("Cancel and return to main menu(5).");
        int newItemChoice = console.readInt("Your selection", 1, 5);
        return newItemChoice;
    }

    private void createNewItem(int newChoice) {
        String newName = console.readString("Enter the name of the new item:  ");
        double newPrice = console.readDouble("Enter the price of the new item:  ");
        int newStockNumber = console.readInt("Enter the stock number of the new item:  ", 1, 10000);
        int newStockAmt = console.readInt("Enter the stock amount of the new item: ", 1, 1000);
        switch (newChoice) {
            case 1:
                inv.createNewDressShirt(newName, newPrice, newStockNumber, newStockAmt);
                break;

            case 2:
                inv.createNewSuitCoat(newName, newPrice, newStockNumber, newStockAmt);
                break;

            case 3:
                inv.createNewPants(newName, newPrice, newStockNumber, newStockAmt);
                break;

            case 4:
                inv.createNewAccessory(newName, newPrice, newStockNumber, newStockAmt);
                break;

            default:
                break;
        }

    }

    private int addInvChoice(int addChoice) {

        if (addChoice == 5) {
            return 5;
        }

        int restockID = console.readInt("What is the stock number of the item you would like to restock?");
        String invKey = createKey(addChoice, restockID);

        if (inv.returnItemName(invKey) != null) {
            console.print("That item exists.");
            int newQty = console.readInt("Enter the amount of new inventory you would like to add:  ", 0, 100);
            inv.SetNewQty(invKey, newQty);
        } else {
            console.print("That item does not exist.");
        }
        return 0;

    }

    private int remInvChoice(int remChoice) {

        if (remChoice == 5) {
            return 5;
        }
        int depleteID = console.readInt("What is the stock number of the item you would like to deplete?");
        String invKey = createKey(remChoice, depleteID);
        if (inv.returnItemName(invKey) != null) {
            console.print("That item exists.");
            int newQty = console.readInt("Enter the amount of new inventory you would like to removed:  ", 0, 999);
            while (newQty > inv.returnItemQty(invKey)) {
                System.out.println("That is more inventory than it available, or 0 to exit.");
                newQty = console.readInt(invKey, 0, 999);
            }

            inv.SetNewQty(invKey, -newQty);
        } else {
            console.print("That item does not exist.");
        }
        return 0;

    }

    private void valInvChoice(int valChoice) {


        int valuateID = console.readInt("What is the stock number of the item you would like to valuate?");
        String invKey = createKey(valChoice, valuateID);
        


        if (inv.returnItemName(invKey) != null) {
            console.print("The item " + inv.returnItemName(invKey) + " has a current valuation of $" 
                    + inv.valuateItem(invKey) + ".");
 
        } else {
            console.print("That item does not exist.");
        }

    }

    private String createKey(int categoryNumber, int stockNum) {
        String invKey = "";
        switch (categoryNumber) {
            case 1:
                invKey = "DressShirt" + stockNum;
                break;
            case 2:
                invKey = "SuitCoat" + stockNum;
                break;
            case 3:
                invKey = "Pants" + stockNum;
                break;
            case 4:
                invKey = "Accessory" + stockNum;
                break;
            default:
                break;
        }
        return invKey;

    }

    private void listAllInventory() {
        inv.listAllInventory();
    }


    private double calculateValInventory() {
        return 0.0;
    }


}
