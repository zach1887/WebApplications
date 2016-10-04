/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject.dto;

/**
 *
 * @author Jesse
 */
public class VendObject {

    private String itemName;
    private int itemQty;
    private double itemPrice;
    private int itemOrder;


public VendObject(){
}

    public VendObject(String itemName, int itemQty, double itemPrice) {
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemOrder(int itemOrder) {
        this.itemOrder = itemOrder;
    }

    

}
