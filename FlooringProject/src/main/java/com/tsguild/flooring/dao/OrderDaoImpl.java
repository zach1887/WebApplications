/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.dao;

import com.tsguild.flooring.dto.Order;
import com.tsguild.flooring.dto.OrderMap;
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
public class OrderDaoImpl implements OrderDao {

    private String FILE_NAME;
    private final String DELIMITER = ",";
//    private HashMap<String, Order> orderMap;
    HashMap<String, HashMap<String, Order>> megamap;
//    private HashMap<String, Order> orderMap = new HashMap<>();

    public OrderDaoImpl() {
//        orderMap = new HashMap<>();
        megamap = new HashMap<>();
//        FILE_NAME = "Orders_TEST.txt";

    }

    @Override
    public void loadFromFile(String FILE_NAME) throws IOException {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
            HashMap<String, Order> tempMap = new HashMap<>();
            while (sc.hasNextLine()) {
                String orderLine = sc.nextLine();
                String[] orderProperties = orderLine.split(DELIMITER);

                Order oldOrder = new Order();
//                Collection<Order> orderSet = null;
                oldOrder.setCustomerName(orderProperties[1]);
                oldOrder.setStateAbbrev(orderProperties[2]);
                oldOrder.setProductType(orderProperties[4]);

                try {
                    int orderNumber = Integer.parseInt(orderProperties[0]);
                    Double taxRate = Double.parseDouble(orderProperties[3]);
                    Double sqFt = Double.parseDouble(orderProperties[5]);
                    Double materialSqFt = Double.parseDouble(orderProperties[6]);
                    Double laborSqFt = Double.parseDouble(orderProperties[7]);
                    Double materialCost = Double.parseDouble(orderProperties[8]);
                    Double laborCost = Double.parseDouble(orderProperties[9]);
                    Double compTax = Double.parseDouble(orderProperties[10]);
                    Double compTotal = Double.parseDouble(orderProperties[11]);

                    oldOrder.setOrderNumber(orderNumber);
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
                tempMap.put(FILE_NAME.substring(7, 15) + oldOrder.getOrderNumber(), oldOrder);

            }
            megamap.put(FILE_NAME.substring(7, 15), tempMap);
        } catch (FileNotFoundException ex) {

        }
    }

    @Override
    public void loadFromFileAdd(String FILE_NAME) throws IOException {
        try {
            loadFromFile(FILE_NAME);
        } catch (FileNotFoundException e) {
            new FileWriter(FILE_NAME);
        }
    }

    @Override
    public Collection<Order> displayOrders(String fileIntro) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFile(fileNameIfExists);

        return megamap.get(fileIntro).values();

    }

    @Override
    public void addOrders(String fileIntro, Order order) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";
        loadFromFileAdd(fileNameIfExists);
//        HashMap<String, Order> addMap = new HashMap<>();
        HashMap addMap = megamap.get(fileIntro);

        if (addMap == null) {
            addMap = new HashMap<>();
            addMap.put(fileIntro + order.getOrderNumber(), order);
            megamap.put(fileIntro, addMap);
        } else {
            megamap.remove(fileIntro);
            addMap.put(fileIntro + order.getOrderNumber(), order);
            megamap.put(fileIntro, addMap);
        }
    }

    @Override
    public void removeOrder(String fileIntro, int orderNum) throws IOException {
        HashMap delMap = megamap.get(fileIntro);
        megamap.remove(fileIntro);       
        delMap.remove(fileIntro + orderNum);
        if (delMap != null) {
            megamap.put(fileIntro, delMap);
        }

    }

    @Override
    public void switchOrder(Order editOrder, Order correctedOrder, String fileIntro, String newFileIntro) throws IOException {
        removeOrder(fileIntro, editOrder.getOrderNumber());
        addOrders(newFileIntro, correctedOrder);
    }

    @Override
    public Order retreiveEditOrder(String editDate, String fileIntro, String orderNum) throws IOException {
        
        String fileNameIfExists = "Orders_" + fileIntro + ".txt";
        loadFromFile(fileNameIfExists);
//        HashMap<String, Order> addMap = new HashMap<>();
        HashMap<String, Order> editMap = megamap.get(fileIntro); 

        if (editMap.containsKey(fileIntro + orderNum)) {
            return editMap.get(fileIntro + orderNum);
        } else {
            return null;
        }
    }

    @Override
    public void saveAllChanges() throws FileNotFoundException {
        Collection<String> dates = megamap.keySet();

        for (String d : dates) {
            String FILE_NAME = "Orders_" + d + ".txt";
            PrintWriter writer = new PrintWriter(FILE_NAME);
//            Collection<String> orderNumbers = megamap.get(d).keySet();
            Collection<Order> orders = megamap.get(d).values();

            for (Order o : orders) {
                writer.println(o.getOrderNumber() + DELIMITER + o.getCustomerName()
                        + DELIMITER + o.getStateAbbrev() + DELIMITER + o.getTaxRate()
                        + DELIMITER + o.getProductType() + DELIMITER + o.getSquareFT()
                        + DELIMITER + o.getMaterialCostPerSqFt() + DELIMITER
                        + o.getLaborCostPerSqFt() + DELIMITER + o.getMaterialCost()
                        + DELIMITER + o.getLaborCost() + DELIMITER + o.getCompTax()
                        + DELIMITER + o.getTotalAmt());
            }
       
        writer.flush();
        writer.close();
    }

}
}
