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
public interface Product {
    
    public String getItemName();
    public double getItemPrice();
    public int getItemStockNum();
    public String getItemCategory();
    public int getStockAmt();
    
}
