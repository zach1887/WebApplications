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
public class DressShirt implements Product {
    private String shirtName;
    private double itemPrice;
    private int itemStockNum;
    private int stockAmt;

    public DressShirt (String shirtName, double itemPrice, int itemStockNum, int stockAmt) {
        this.shirtName = shirtName;
        this.itemPrice = itemPrice;
        this.itemStockNum = itemStockNum;
        this.stockAmt = stockAmt;
    }
    @Override
    public String getItemName() {
        return shirtName;
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
            return "DressShirt";
    }

    @Override
    public int getStockAmt() {
      return stockAmt;
    }
    
}
