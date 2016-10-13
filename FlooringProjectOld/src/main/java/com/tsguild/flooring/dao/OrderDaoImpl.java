/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import com.tsguild.flooring.dto.Order;
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
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author apprentice
 */
public class OrderDaoImpl {

    private String FILE_NAME;
    private final String DELIMITER = ",";
    private HashMap<String, Order> orderMap = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    TaxesDaoImpl tdao = new TaxesDaoImpl();
    ProductDaoImpl pdao = new ProductDaoImpl();

    public OrderDaoImpl() {
        orderMap = new HashMap<>();
//        FILE_NAME = "Orders_TEST.txt";

    }

    public void loadFromFile(String FILE_NAME) throws IOException {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String orderLine = sc.nextLine();
                String[] orderProperties = orderLine.split(DELIMITER);

                Order oldOrder = new Order();

                oldOrder.setOrderNumber(orderProperties[0]);
                oldOrder.setCustomerName(orderProperties[1]);
                oldOrder.setStateAbbrev(orderProperties[2]);
                oldOrder.setProductType(orderProperties[4]);

                try {
                    Double taxRate = Double.parseDouble(orderProperties[3]);
                    Double sqFt = Double.parseDouble(orderProperties[5]);
                    Double materialSqFt = Double.parseDouble(orderProperties[6]);
                    Double laborSqFt = Double.parseDouble(orderProperties[7]);
                    Double materialCost = Double.parseDouble(orderProperties[8]);
                    Double laborCost = Double.parseDouble(orderProperties[9]);
                    Double compTax = Double.parseDouble(orderProperties[10]);
                    Double compTotal = Double.parseDouble(orderProperties[11]);

                    oldOrder.setTaxRate(taxRate);
                    oldOrder.setMaterialCostPerSqFt(materialSqFt);
                    oldOrder.setLaborCostPerSqFt(laborSqFt);
                    oldOrder.setSquareFT(sqFt);
                    oldOrder.setMaterialCost(materialCost);
                    oldOrder.setMaterialCost(laborCost);
                    oldOrder.setCompTax(compTax);
                    oldOrder.setTotalAmt(compTotal);
                } catch (NumberFormatException e) {
                    continue;
                }
                orderMap.put(orderProperties[0], oldOrder);

            }
        } catch (FileNotFoundException ex) {

        }
    }

    public void loadFromFileAdd(String FILE_NAME) throws IOException {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String orderLine = sc.nextLine();
                String[] orderProperties = orderLine.split(DELIMITER);

                Order oldOrder = new Order();

                oldOrder.setOrderNumber(orderProperties[0]);
                oldOrder.setCustomerName(orderProperties[1]);
                oldOrder.setStateAbbrev(orderProperties[2]);
                oldOrder.setProductType(orderProperties[4]);

                try {
                    Double taxRate = Double.parseDouble(orderProperties[3]);
                    Double sqFt = Double.parseDouble(orderProperties[5]);
                    Double materialSqFt = Double.parseDouble(orderProperties[6]);
                    Double laborSqFt = Double.parseDouble(orderProperties[7]);
                    Double materialCost = Double.parseDouble(orderProperties[8]);
                    Double laborCost = Double.parseDouble(orderProperties[9]);
                    Double compTax = Double.parseDouble(orderProperties[10]);
                    Double compTotal = Double.parseDouble(orderProperties[11]);

                    oldOrder.setTaxRate(taxRate);
                    oldOrder.setMaterialCostPerSqFt(materialSqFt);
                    oldOrder.setLaborCostPerSqFt(laborSqFt);
                    oldOrder.setSquareFT(sqFt);
                    oldOrder.setMaterialCost(materialCost);
                    oldOrder.setMaterialCost(laborCost);
                    oldOrder.setCompTax(compTax);
                    oldOrder.setTotalAmt(compTotal);
                } catch (NumberFormatException e) {
                    continue;
                }
                orderMap.put(orderProperties[0], oldOrder);

            }
        } catch (FileNotFoundException ex) {
//            FileWriter = new FileWriter(FILE_NAME);

        }
    }

    public Collection<Order> displayOrders(String fileIntro) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFile(fileNameIfExists);

        return orderMap.values();

    }

    public void addOrders(String fileIntro, String custName, String stateAbbrev, String ProductType, double sqFt) throws IOException {

        String FILE_NAME = "Orders_" + fileIntro + ".txt";
        loadFromFileAdd(FILE_NAME);

        Order newOrder = new Order();

        newOrder.setCustomerName(custName);
        newOrder.setStateAbbrev(stateAbbrev);
        newOrder.setProductType(ProductType);
        newOrder.setSquareFT(sqFt);

        newOrder.setTaxRate(tdao.getTaxRate(newOrder.getStateAbbrev()));

        newOrder.setMaterialCostPerSqFt(pdao.getMaterialCost(newOrder.getProductType()));
        newOrder.setLaborCostPerSqFt(pdao.getLaborCost(newOrder.getProductType()));

        newOrder.setMaterialCost(newOrder.getMaterialCost() * newOrder.getSquareFT());
        newOrder.setLaborCost(newOrder.getLaborCost() * newOrder.getSquareFT());
        newOrder.setCompTax(newOrder.getCompTax() * (newOrder.getLaborCost() + newOrder.getMaterialCost()));
        newOrder.setTotalAmt(newOrder.getLaborCost() + newOrder.getMaterialCost() + newOrder.getCompTax());

        for (int i = 1; i < 1000; i++) {
            if (orderMap.containsKey(fileIntro + i)) {
                i++;
            } else {
                orderMap.put(fileIntro + i, newOrder);
                break;
            }

        }

    }

}
