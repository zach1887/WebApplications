/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product;

/**
 *
 * @author Jesse
 */
public class Pants implements Product {

    private String pantsName;
    private double itemPrice;
    private int itemStockNum;
    private int stockAmt;

    public Pants(String pantsName, double itemPrice, int itemStockNum, int stockAmt) {
        this.pantsName = pantsName;
        this.itemPrice = itemPrice;
        this.itemStockNum = itemStockNum;
        this.stockAmt = stockAmt;
    }

    @Override
    public String getItemName() {
        return pantsName;
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
        return "Pants";
    }

    @Override
    public int getStockAmt() {
        return stockAmt;
    }

    @Override
    public void setStockAmt(Product product, int chgAmt) {
        this.stockAmt = product.getStockAmt() + chgAmt;
    }
}
