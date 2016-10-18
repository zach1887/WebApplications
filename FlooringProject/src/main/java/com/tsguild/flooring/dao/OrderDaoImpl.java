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

/**
 *
 * @author apprentice
 */
public class OrderDaoImpl implements OrderDao {

    private final String FILE_DIR;
    private final String DELIMITER = ",";
    HashMap<String, HashMap<String, Order>> megamap;

    public OrderDaoImpl() {
        megamap = new HashMap<>();
        FILE_DIR = "OrdersByDate/";

    }

    @Override
    public void loadFromFile(String dateTag) throws IOException {
            String FILE_NAME;
        try {
            FILE_NAME = "Orders_" + dateTag + ".txt";
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_DIR+FILE_NAME)));
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
                    oldOrder.setLaborCost(laborCost);
                    oldOrder.setCompTax(compTax);
                    oldOrder.setTotalAmt(compTotal);
                } catch (NumberFormatException e) {
                    continue;
                }
                tempMap.put(dateTag + oldOrder.getOrderNumber(), oldOrder);

            }
            megamap.put(dateTag, tempMap);
        } catch (FileNotFoundException ex) {

        }
    }


    @Override
    public Collection<Order> displayOrders(String dateTag) {

        try {
            loadFromFile(dateTag);
        } catch (IOException ex) {
            return null;
        }
        if (megamap.isEmpty() || megamap.size() == 0) {
            return null;
        }

        return megamap.get(dateTag).values();

    }

    @Override
    public void addOrders(String dateTag, Order order) throws IOException {

        HashMap addMap = megamap.get(dateTag);

        if (addMap == null) {
            addMap = new HashMap<>();
            addMap.put(dateTag + order.getOrderNumber(), order);
            megamap.put(dateTag, addMap);
        } else {
            megamap.remove(dateTag);
            addMap.put(dateTag + order.getOrderNumber(), order);
            megamap.put(dateTag, addMap);
        }
    }

    @Override
    public void removeOrder(String dateTag, int orderNum) throws IOException {
        HashMap delMap = megamap.get(dateTag);
        megamap.remove(dateTag);
        delMap.remove(dateTag + orderNum);
        if (delMap != null) {
            megamap.put(dateTag, delMap);
        }

    }


    @Override
    public Order getOrder(String dateTag, int orderNum) throws IOException {

        String fileNameIfExists = "Orders_" + dateTag + ".txt";
        loadFromFile(fileNameIfExists);
        if (megamap.isEmpty() || megamap.isEmpty()) {
            return null;
        }

        if (!megamap.containsKey(dateTag)) {
            return null;
        }
        if (!megamap.get(dateTag).containsKey(dateTag + orderNum)) {
            return null;
        }
        return megamap.get(dateTag).get(dateTag + orderNum);
    }


    @Override
    public void saveAllChanges() throws FileNotFoundException {
        Collection<String> dates = megamap.keySet();

        for (String d : dates) {
            String FILE_NAME = "Orders_" + d + ".txt";
            PrintWriter writer = new PrintWriter(FILE_DIR + FILE_NAME);
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
