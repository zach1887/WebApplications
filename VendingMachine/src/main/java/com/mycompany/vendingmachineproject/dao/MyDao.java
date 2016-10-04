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
    private HashMap<Integer, VendObject> vendMap;

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
             int i =0;
            while (sc.hasNextLine()) {
                i++;
                VendObject vend = new VendObject();
                String nextVendQty = sc.nextLine();

                String[] VendProperties = nextVendQty.split(DELIMITER);
                
                
                
                String itemName = VendProperties[0];
                vend.setItemName(itemName);
                vend.setItemOrder(i);

                try {
                    int itemQty = Integer.parseInt(VendProperties[1]);
                    double itemPrice = Double.parseDouble(VendProperties[2]);
                    vend.setItemQty(itemQty);
                    vend.setItemPrice(itemPrice);

                } catch (NumberFormatException e) {
                         continue;
                }
                vendMap.put(i, vend);
            }
            sc.close();

        } catch (FileNotFoundException ex) {
            new FileWriter (FILE_NAME);
   

        }
    }
 
    public int getSize() {
        return vendMap.size();
    }
    
    public String getCandyName(int itemOrder) {
        return vendMap.get(itemOrder).getItemName();
    }
    public int getCandyQty(int itemOrder) {
        return vendMap.get(itemOrder).getItemQty();
    }
        
    public double getCandyPrice(int itemOrder) {
        return vendMap.get(itemOrder).getItemPrice();
    }



    public void DecreaseQty(int candyChoice) {
        int oldqty = vendMap.get(candyChoice).getItemQty();
        vendMap.get(candyChoice).setItemQty(oldqty -1);
    }
    
        public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (VendObject v : vendMap.values()) {
          writer.println(v.getItemName() + DELIMITER + v.getItemQty() 
                  + DELIMITER + v.getItemPrice());
        }
        writer.flush();
        writer.close();

    }

}
