/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject.dao;

import com.mycompany.vendingmachineproject.dto.VendObject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class MyDao {

    private String FILE_NAME;
    private final String DELIMITER = "::";
    private HashMap<String, VendObject> vendMap;

//    public dao() {
//        dvdMap = new HashMap<>();
//        FILE_NAME = "DVDLibrary.txt";
//
//    }
    public MyDao() {  // constructor used in the commander file
        vendMap = new HashMap<>();
        FILE_NAME = "vendingData.txt";
    }

    public void loadFromFile() throws IOException {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                VendObject vend = new VendObject();
                String nextVendQty = sc.nextLine();

                String[] VendProperties = nextVendQty.split(DELIMITER);
                
                String itemName = VendProperties[0];
                vend.setItemName(itemName);

                try {
                    int itemQty = Integer.parseInt(VendProperties[1]);
                    double itemPrice = Double.parseDouble(VendProperties[2]);
                    vend.setItemQty(itemQty);
                    vend.setItemPrice(itemPrice);

                } catch (NumberFormatException e) {
                    //      continue;
                }
                vendMap.put(itemName, vend);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            new FileWriter (FILE_NAME);
   

        }
    }

        
 
    
    public String getCandyName(String key) {
        return vendMap.get(key).getItemName();
    }
    public int getCandyQty(String key) {
        return vendMap.get(key).getItemQty();
    }
    public double getCandyPrice(String key) {
        return vendMap.get(key).getItemPrice();
    }

//    public void saveToFile() throws IOExceptio
//        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
//
//        for (VendObject v : vendMap.values()) {
//
//        }
//        writer.flush();
//        writer.close();
//
//    }

}
