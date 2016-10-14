/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dto;

/**
 *
 * @author apprentice
 */
public class Order {
    
    private int orderNumber;  // 
    private String customerName;
    private String stateAbbrev;
    private double taxRate;  // linked to stateAbbrev for new orders
    private String productType;
    private double squareFT;
    private double materialCostPerSqFt; // linked to productType for new orders
    private double laborCostPerSqFt; // linked to productType for new orders
    private double materialCost; // calculated for new orders
    private double laborCost; // calculated for new order - retreived for older orders
    private double compTax; // calculated for new orders
    private double totalAmt; // calculated for new orders

    public Order() {

    }

    public Order(String customerName, String stateAbbrev, String productType, double squareFT) {
        this.customerName = customerName;
        this.stateAbbrev = stateAbbrev;
        this.productType = productType;
        this.squareFT = squareFT;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStateAbbrev() {
        return stateAbbrev;
    }

    public void setStateAbbrev(String stateAbbrev) {
        this.stateAbbrev = stateAbbrev;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getSquareFT() {
        return squareFT;
    }

    public void setSquareFT(double squareFT) {
        this.squareFT = squareFT;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getMaterialCostPerSqFt() {
        return materialCostPerSqFt;
    }

    public void setMaterialCostPerSqFt(double materialCostPerSqFt) {
        this.materialCostPerSqFt = materialCostPerSqFt;
    }

    public double getLaborCostPerSqFt() {
        return laborCostPerSqFt;
    }

    public void setLaborCostPerSqFt(double laborCostPerSqFt) {
        this.laborCostPerSqFt = laborCostPerSqFt;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public double getCompTax() {
        return compTax;
    }

    public void setCompTax(double compTax) {
        this.compTax = compTax;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }


}
