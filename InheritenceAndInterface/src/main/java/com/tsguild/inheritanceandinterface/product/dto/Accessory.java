/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product.dto;

import com.tsguild.inheritanceandinterface.product.*;

/**
 *
 * @author Jesse
 */
public class Accessory implements Product {

    private String accessName;
    private double itemPrice;
    private int itemStockNum;
    private int stockAmt;

    public Accessory(String accessName, double itemPrice, int itemStockNum, int stockAmt) {
        this.accessName = accessName;
        this.itemPrice = itemPrice;
        this.itemStockNum = itemStockNum;
        this.stockAmt = stockAmt;
    }

    @Override
    public String getItemName() {
        return accessName;
    }

    @Override
    public double getItemPrice() {
        return itemPrice;
    }

    @Override
    public int getItemStockNum() {
        return itemStockNum;
    }

    @Override
    public String getItemCategory() {
        return "Accessory";
    }

    @Override
    public int getStockAmt() {
        return stockAmt;
    }
}
