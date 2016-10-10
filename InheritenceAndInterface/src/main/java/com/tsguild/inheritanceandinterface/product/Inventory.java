/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Jesse
 */
public class Inventory {

    HashMap<String, Product> inventoryMap = new HashMap<>();

    public void createNewDressShirt(Product product) {
        DressShirt ds = new DressShirt(product.getItemName(), product.getItemPrice(),
                product.getItemStockNum(), product.getStockAmt());
    }

    public void createNewSuitCoat(String name, double price, int stockNum, int stockAmt) {
        SuitCoat sc = new SuitCoat(name, price, stockNum, stockAmt);
    }

    public void createNewPants(String name, double price, int stockNum, int stockAmt) {
        Pants pt = new Pants(name, price, stockNum, stockAmt);
    }

    public void createNewAccessory(String name, double price, int stockNum, int stockAmt) {
        Accessory acc = new Accessory(name, price, stockNum, stockAmt);
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

}
