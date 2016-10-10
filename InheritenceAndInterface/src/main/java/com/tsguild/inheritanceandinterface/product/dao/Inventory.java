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

    public String[] listAllInventory() {

        Set<String> values = inventoryMap.keySet();

        String[] keyArray = values.toArray(new String[0]);
        return keyArray;

    }

    public String returnItemName(String invKey) {
        return inventoryMap.get(invKey).getItemName();
    }
    
    public void SetNewQty(String invKey, int chgAmt) {
       inventoryMap.get(invKey).setStockAmt(inventoryMap.get(invKey).getStockAmt()+chgAmt);
    }
    
    

}
