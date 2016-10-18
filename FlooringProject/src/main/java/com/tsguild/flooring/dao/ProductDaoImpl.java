/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import com.tsguild.flooring.dto.Order;
import com.tsguild.flooring.dto.Product;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class ProductDaoImpl implements ProductDao {

    private String FILE_NAME;
    private final String DELIMITER = ",";
    private HashMap<String, Product> priceMap = new HashMap<>();
    public boolean typeIncluded;

    public ProductDaoImpl() {
        priceMap = new HashMap<>();
        FILE_NAME = "Data/Products.txt";
    }

    @Override
    public void loadFromFile() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String priceLine = sc.nextLine();
                String[] priceProperties = priceLine.split(DELIMITER);
                String productType = priceProperties[0];
                try {
                    Double materialCost = Double.parseDouble(priceProperties[1]);
                    Double laborCost = Double.parseDouble(priceProperties[2]);
                    Product newPrice = new Product(productType,materialCost, laborCost);

                    priceMap.put(priceProperties[0], newPrice);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            sc.close();

        } catch (FileNotFoundException ex) {
//             new FileWriter (FILE_NAME);
        }
    }

    @Override
    public String getMaterialName(String productType) {
        if (!priceMap.containsKey(productType))
            return null;
        return priceMap.get(productType).getMaterialName();
    }
    @Override
    public double getMaterialCost(String productType) {
        return priceMap.get(productType).getMaterialCostPerSqFt();
    }

    @Override
    public double getLaborCost(String productType) {
        return priceMap.get(productType).getLaborCostPerSqFt();
    }

    @Override    
    public Set <String> listAllValues() {
        return priceMap.keySet();
    }

}
