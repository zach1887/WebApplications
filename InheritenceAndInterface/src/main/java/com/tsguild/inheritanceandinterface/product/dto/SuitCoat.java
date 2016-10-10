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
public class SuitCoat implements Product {

    private String coatName;
    private double itemPrice;
    private int itemStockNum;
    private int stockAmt;

    public SuitCoat(String coatName, double itemPrice, int itemStockNum, int stockAmt) {
        this.coatName = coatName;
        this.itemPrice = itemPrice;
        this.itemStockNum = itemStockNum;
    }

    @Override
    public String getItemName() {
        return coatName;
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
        return "SuitCoat";
    }

    @Override
    public int getStockAmt() {
        return stockAmt;
    }
}
