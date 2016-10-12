/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

//import com.tsguild.flooring.dto.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class TaxesDaoImpl implements TaxesDao {

    private String FILE_NAME;
    private final String DELIMITER = ",";
    private HashMap<String, Double> taxMap = new HashMap<>();

    public TaxesDaoImpl() {
        taxMap = new HashMap<>();
        FILE_NAME = "Data/Taxes.txt";

    }
    
    @Override
    public void LoadFromFile() throws IOException {
        
        try {
            Scanner sc = new Scanner (new BufferedReader (new FileReader (FILE_NAME)));
            
            while (sc.hasNextLine()) {
                String taxLine = sc.nextLine();
                String [] taxProperties = taxLine.split(DELIMITER);
                
                try {
                    Double taxRate = Double.parseDouble(taxProperties[1]);
                    taxMap.put(taxProperties[0], taxRate);                    
                }
                catch (NumberFormatException e) {
                    continue;
                }
                } 
                 sc.close();   
                
            }
            
         catch (FileNotFoundException ex) {
             new FileWriter (FILE_NAME);
         }
    }

        
             
    @Override
        public double getTaxRate (String stateAbbrev) {
            return taxMap.get(stateAbbrev);
        }
        
        
        
        
    }

