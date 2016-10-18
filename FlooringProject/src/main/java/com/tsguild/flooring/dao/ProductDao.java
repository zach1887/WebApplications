/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import java.util.Set;

/**
 *
 * @author apprentice
 */
public interface ProductDao {

    String getMaterialName (String productType);
    
    double getLaborCost(String productType);

    double getMaterialCost(String productType);
    
    Set<String> listAllValues();

    void loadFromFile();
    
}
