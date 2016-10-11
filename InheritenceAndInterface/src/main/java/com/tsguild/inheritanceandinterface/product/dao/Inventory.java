/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product.dao;

import com.tsguild.inheritanceandinterface.product.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Jesse
 */
public class Inventory {

    HashMap<String, Product> inventoryMap = new HashMap<>();
    public final String FILE_NAME;
    private final String DELIMITER = "::";

    public Inventory() {
        HashMap<String, Product> inventoryMap = new HashMap<>();
        FILE_NAME = "inventory,txt";
    }

    public void loadFromFile() throws IOException {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String itemLine = sc.nextLine();
                String[] itemProperties = itemLine.split(DELIMITER);

                if (itemProperties.length != 5) {
                    continue;
                }

                String itemName = itemProperties[0];
                String itemCategory = itemProperties[1];
                try {
                    int stockNum = Integer.parseInt(itemProperties[2]);
                    double itemPrice = Double.parseDouble(itemProperties[3]);
                    int stockQty = Integer.parseInt(itemProperties[4]);

                } catch (NumberFormatException e) {
                    continue;
                }

                switch (itemCategory) {
                    case ("DressShirt"):
                        createNewDressShirt(itemName, Double.parseDouble(itemProperties[3]),
                                Integer.parseInt(itemProperties[2]), Integer.parseInt(itemProperties[4]));

                        break;
                    case ("SuitCoat"):
                        createNewSuitCoat(itemName, Double.parseDouble(itemProperties[3]),
                                Integer.parseInt(itemProperties[2]), Integer.parseInt(itemProperties[4]));

                        break;
                    case ("Pants"):
                        createNewPants(itemName, Double.parseDouble(itemProperties[3]),
                                Integer.parseInt(itemProperties[2]), Integer.parseInt(itemProperties[4]));

                        break;
                    case ("Accessory"):
                        createNewAccessory(itemName, Double.parseDouble(itemProperties[3]),
                                Integer.parseInt(itemProperties[2]), Integer.parseInt(itemProperties[4]));

                        break;
                    default:
                        break;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            new FileWriter(FILE_NAME);

        }
    }

    public void createNewDressShirt(String name, double price, int stockNum, int stockAmt) {
        DressShirt ds = new DressShirt(name, price, stockNum, stockAmt);
        addToInventory(ds);
    }

    public void createNewSuitCoat(String name, double price, int stockNum, int stockAmt) {
        SuitCoat sc = new SuitCoat(name, price, stockNum, stockAmt);
        addToInventory(sc);
    }

    public void createNewPants(String name, double price, int stockNum, int stockAmt) {
        Pants pt = new Pants(name, price, stockNum, stockAmt);
        addToInventory(pt);
    }

    public void createNewAccessory(String name, double price, int stockNum, int stockAmt) {
        Accessory acc = new Accessory(name, price, stockNum, stockAmt);
        addToInventory(acc);
    }

    public void addToInventory(Product product) {
        inventoryMap.put(product.getItemCategory() + product.getItemStockNum(), product);
    }

    public void DropFromInventory(Product product) {
        inventoryMap.remove(product.getItemCategory() + product.getItemStockNum(), product);
    }

    public void listAllInventory() {

        for (Product p : inventoryMap.values()) {
            System.out.println(p.getItemName() + "  " + p.getItemCategory());
            System.out.println(p.getItemPrice() + "  " + p.getItemStockNum() + " " + p.getStockAmt());
        }

    }

    public String returnItemName(String invKey) {
        return inventoryMap.get(invKey).getItemName();
    }

    public int returnItemQty(String invKey) {
        return inventoryMap.get(invKey).getStockAmt();
    }

    public void SetNewQty(String invKey, int chgAmt) {

            inventoryMap.get(invKey).setStockAmt(chgAmt);
      
    }

    public double valuateItem(String invKey) {

        return inventoryMap.get(invKey).getItemPrice() * inventoryMap.get(invKey).getStockAmt();

    }
    
    
    public double valuateInventory() {
        double valuation = 0.00;
        for (Product p: inventoryMap.values()) {
            valuation += p.getItemPrice()*p.getStockAmt();
    }
        return valuation;
    }
    
    public void saveToFile() throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (Product p : inventoryMap.values()) {
            writer.println(p.getItemName() + DELIMITER + p.getItemCategory() + DELIMITER
                    + p.getStockAmt() + DELIMITER + p.getItemPrice() + DELIMITER
                    + p.getStockAmt());
        }
        writer.flush();
        writer.close();
    }

}

