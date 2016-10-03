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

            while (sc.hasNextLine()) {
                VendObject vend = new VendObject();
                String nextVendQty = sc.nextLine();

                String[] VendProperties = nextVendQty.split(DELIMITER);

                try {
                    int CtSnickers = Integer.parseInt(VendProperties[0]);
                    int CtReeses = Integer.parseInt(VendProperties[1]);
                    int CtTwix = Integer.parseInt(VendProperties[2]);
                    int CtCerts = Integer.parseInt(VendProperties[3]);
                    int CtGum = Integer.parseInt(VendProperties[4]);
                    vend.setCtSnickers(CtSnickers);
                    vend.setCtReeses(CtReeses);
                    vend.setCtTwix(CtTwix);
                    vend.setCtCerts(CtCerts);
                    vend.setCtGum(CtGum);

                } catch (NumberFormatException e) {
                    //      continue;
                }
                vendMap.put(1, vend);

            }
            sc.close();

        } catch (FileNotFoundException ex) {
            VendObject vend = new VendObject();
            vend.setCtSnickers(10);
            vend.setCtReeses(10);
            vend.setCtTwix(8);
            vend.setCtCerts(3);
            vend.setCtGum(5);

        }
    }

    public int[] displayQuantities() {
        VendObject vend = new VendObject();
        int quantity [] = new int [5];
        quantity[0] = vend.getCtSnickers();
        quantity[1] = vend.getCtReeses();
        quantity[2] = vend.getCtTwix();
        quantity[3] = vend.getCtCerts();
        quantity[4] = vend.getCtGum();

        return quantity;
    }

    public int[] displayPrices() {
        VendObject vend = new VendObject();
        int[] price= {0, 0, 0, 0, 0};

        price[0] = vend.getPRICE_SNICKERS();
        price[1] = vend.getPRICE_REESES();
        price[2] = vend.getPRICE_TWIX();
        price[3] = vend.getPRICE_CERTS();
        price[4] = vend.getPRICE_GUM();

        return price;
    }

    public int checkCandyPrice(int candyChoice) {
        VendObject vend = new VendObject();
        int candyPrice;
        switch (candyChoice) {
            case 1:
                candyPrice = vend.getPRICE_SNICKERS();
                break;
            case 2:
                candyPrice = vend.getPRICE_REESES();
                break;
            case 3:
                candyPrice = vend.getPRICE_TWIX();
                break;
            case 4:
                candyPrice = vend.getPRICE_CERTS();
                break;
            case 5:
                candyPrice = vend.getPRICE_GUM();
                break;
            default:
                candyPrice = 999;
        }

        return candyPrice;
    }

    public void updateQuantity(int candyChoice) {
       VendObject vend = new VendObject();
        switch (candyChoice) {
            case 1:
                vend.setCtSnickers(vend.getCtSnickers() - 1);
                break;
            case 2:
                vend.setCtReeses(vend.getCtReeses() - 1);
                break;
            case 3:
                vend.setCtTwix(vend.getCtTwix() - 1);
                break;
            case 4:
                vend.setCtCerts(vend.getCtCerts() - 1);
                break;
            case 5:
                vend.setCtGum(vend.getCtGum() - 1);
                break;
            default:
                break;
        }
    }

    public void saveToFile() throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));

        for (VendObject v : vendMap.values()) {
            writer.println(v.getCtSnickers() + DELIMITER + v.getCtReeses()
                    + DELIMITER + v.getCtTwix() + DELIMITER
                    + v.getCtCerts() + DELIMITER + v.getCtGum());
        }
        writer.flush();
        writer.close();

    }

}
