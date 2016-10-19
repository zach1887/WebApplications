/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import com.tsguild.flooring.dto.Product;
import java.util.Set;

/**
 *
 * @author apprentice
 */
public interface ProductDao {

    
    Product getProduct (String productType);
    
    Set<String> listAllValues();

    void loadFromFile();
    
}
