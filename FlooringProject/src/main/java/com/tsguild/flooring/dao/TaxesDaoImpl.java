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
            if (!isStateListed(stateAbbrev)) return 0;
            return taxMap.get(stateAbbrev);
        }
        
        public boolean doesStateExist (String stateAbbrev) {
          return (stateAbbrev.equalsIgnoreCase("AL") || stateAbbrev.equalsIgnoreCase("AK")      
                  || stateAbbrev.equalsIgnoreCase("AR") || stateAbbrev.equalsIgnoreCase("AZ")
                  || stateAbbrev.equalsIgnoreCase("CA") || stateAbbrev.equalsIgnoreCase("CO")      
                  || stateAbbrev.equalsIgnoreCase("CT") || stateAbbrev.equalsIgnoreCase("DE")
                  || stateAbbrev.equalsIgnoreCase("FL") || stateAbbrev.equalsIgnoreCase("GA") // 10 states
                  || stateAbbrev.equalsIgnoreCase("HI") || stateAbbrev.equalsIgnoreCase("IL")
                  || stateAbbrev.equalsIgnoreCase("IN") || stateAbbrev.equalsIgnoreCase("IA")
                  || stateAbbrev.equalsIgnoreCase("ID") || stateAbbrev.equalsIgnoreCase("KS")
                  || stateAbbrev.equalsIgnoreCase("KY") || stateAbbrev.equalsIgnoreCase("LA")
                  || stateAbbrev.equalsIgnoreCase("ME") || stateAbbrev.equalsIgnoreCase("MA") // 20 states
                  || stateAbbrev.equalsIgnoreCase("MD") || stateAbbrev.equalsIgnoreCase("MI")
                  || stateAbbrev.equalsIgnoreCase("MS") || stateAbbrev.equalsIgnoreCase("MT")
                  || stateAbbrev.equalsIgnoreCase("MO") || stateAbbrev.equalsIgnoreCase("MN")
                  || stateAbbrev.equalsIgnoreCase("NE") || stateAbbrev.equalsIgnoreCase("NV")
                  || stateAbbrev.equalsIgnoreCase("NM") || stateAbbrev.equalsIgnoreCase("NJ") // 30 states
                  || stateAbbrev.equalsIgnoreCase("NH") || stateAbbrev.equalsIgnoreCase("NY") 
                  || stateAbbrev.equalsIgnoreCase("ND") || stateAbbrev.equalsIgnoreCase("NC")
                  || stateAbbrev.equalsIgnoreCase("OH") || stateAbbrev.equalsIgnoreCase("OK")
                  || stateAbbrev.equalsIgnoreCase("OR") || stateAbbrev.equalsIgnoreCase("PA")
                  || stateAbbrev.equalsIgnoreCase("RI") || stateAbbrev.equalsIgnoreCase("SC")  // 40 states
                  || stateAbbrev.equalsIgnoreCase("SD") || stateAbbrev.equalsIgnoreCase("TX") 
                  || stateAbbrev.equalsIgnoreCase("TN") || stateAbbrev.equalsIgnoreCase("UT") 
                  || stateAbbrev.equalsIgnoreCase("VA") || stateAbbrev.equalsIgnoreCase("VT") 
                  || stateAbbrev.equalsIgnoreCase("WA") || stateAbbrev.equalsIgnoreCase("WI") 
                  || stateAbbrev.equalsIgnoreCase("WV") || stateAbbrev.equalsIgnoreCase("WY") // 50 states
                  || stateAbbrev.equalsIgnoreCase("PR") || stateAbbrev.equalsIgnoreCase("VI")); // + two terroritories
                  }
        public boolean isStateListed (String stateAbbrev){            
        return taxMap.keySet().contains(stateAbbrev);
}
        
        
    }

