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
        int userChoice = displayMenuOptions();
        int newChoice, newStockNum, newStockAmt, addInvChoice;
        String newName;
        double newPrice;

        boolean keepRunning = true;

        switch (userChoice) {
            case 1:
                newChoice = displayNewItemMenu();
                if (newChoice == 5) {
                    break;
                } else {
                    createNewItem(newChoice);
                }
                break;

            case 2:
                addInvChoice = addInvChoice();
                if (addInvChoice == 5) break;
                
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

    private int displayNewItemMenu() {
        console.print("Which category does the new item fall into?");
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
        int newStockNumber = console.readInt("Enter the stock number of the new item:  ");
        int newStockAmt = console.readInt("Enter the stock amount for the new item: ");
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
    
    private int addInvChoice() {
        console.print("Which category does the item you wish to restock fall into?");
        console.print("Dress shirt (1).");
        console.print("Suit coat(2).");
        console.print("Suit pants (3).");
        console.print("Accessory(4).");
        console.print("Cancel and return to main menu(5).");
        int newItemChoice = console.readInt("Your selection", 1, 5);
        if (newItemChoice == 5) return 5;
        
        String invKey = "";
        int restockID = console.readInt("What is the stock number of the item you would like to restock?");
        switch (newItemChoice) {
            case 1:
                invKey = "DressShirt" + restockID;
                break;
            case 2:
                invKey = "SuitCoat" + restockID;
                break;
            case 3:
                invKey = "Pants" + restockID;
                break;
            case 4:
                invKey = "Accessory" + restockID;
                break;
            default: break;
        }
            
            if (inv.returnItemName(invKey) != null) {
                console.print ("That item exists.");
                 int newQty = console.readInt("Enter the amount of new inventory you would like to add:  ", 0, 100);
                 inv.SetNewQty(invKey, newQty);
            }
            else {
                console.print("That item does not exist.");
            }
            return 0;
            
            
        }
        
    }

