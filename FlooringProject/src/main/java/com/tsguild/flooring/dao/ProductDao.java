/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

/**
 *
 * @author apprentice
 */
public interface ProductDao {

    double getLaborCost(String productType);

    double getMaterialCost(String productType);

    void loadFromFile();
    
}
