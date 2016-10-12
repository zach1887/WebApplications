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
public class Price {
    private double materialCostPerSqFt;
    private double laborCostPerSqFt;

    public Price(double materialCostPerSqFt, double laborCostPerSqFt) {
        this.materialCostPerSqFt = materialCostPerSqFt;
        this.laborCostPerSqFt = laborCostPerSqFt;
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
    
    
    
}
