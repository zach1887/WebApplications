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
public class OrderDaoImpl {

    private String FILE_NAME;
    private final String DELIMITER = ",";
    private HashMap<String, Order> orderMap;
    HashMap<Integer, OrderMap> megamap;
    int numChanges = 0;
//    private HashMap<String, Order> orderMap = new HashMap<>();

    public OrderDaoImpl() {
        orderMap = new HashMap<>();
        megamap = new HashMap<>();
//        FILE_NAME = "Orders_TEST.txt";

    }

    public void loadFromFile(String FILE_NAME) throws IOException {

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));

            while (sc.hasNextLine()) {
                String orderLine = sc.nextLine();
                String[] orderProperties = orderLine.split(DELIMITER);

                Order oldOrder = new Order();

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
                orderMap.put(FILE_NAME.substring(7, 13)+orderProperties[0], oldOrder);

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
                

                oldOrder.setCustomerName(orderProperties[1]);
                oldOrder.setStateAbbrev(orderProperties[2]);
                oldOrder.setProductType(orderProperties[4]);

                try {
                    Integer ordNum = Integer.parseInt(orderProperties[0]);
                    Double taxRate = Double.parseDouble(orderProperties[3]);
                    Double sqFt = Double.parseDouble(orderProperties[5]);
                    Double materialSqFt = Double.parseDouble(orderProperties[6]);
                    Double laborSqFt = Double.parseDouble(orderProperties[7]);
                    Double materialCost = Double.parseDouble(orderProperties[8]);
                    Double laborCost = Double.parseDouble(orderProperties[9]);
                    Double compTax = Double.parseDouble(orderProperties[10]);
                    Double compTotal = Double.parseDouble(orderProperties[11]);

                    oldOrder.setOrderNumber(ordNum);
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
                orderMap.put(FILE_NAME.substring(7, 13) + orderProperties[0], oldOrder);

            }
        } catch (FileNotFoundException ex) {
            new FileWriter(FILE_NAME);

        }
    }

    public Collection<Order> displayOrders(String fileIntro) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFile(fileNameIfExists);

        return orderMap.values();

    }

    public void addOrders(String fileIntro, Order order) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFileAdd(fileNameIfExists);
        orderMap.put(fileIntro, order);

        OrderMap temp = new OrderMap(fileIntro, orderMap.values());
        numChanges++;
        megamap.put(numChanges, temp);
    }

    public void removeOrder(String remDate, String fileIntro, String orderNum) throws IOException {

        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFile(fileNameIfExists);
        Order delOrder = orderMap.get(fileIntro + orderNum);
        orderMap.remove(orderNum, delOrder);

        OrderMap temp = new OrderMap(fileIntro, orderMap.values());

        numChanges++;
        megamap.put(numChanges, temp);

    }

    public Order retreiveEditOrder(String editDate, String fileIntro, String orderNum) throws IOException {
        String fileNameIfExists = "Orders_" + fileIntro + ".txt";

        loadFromFile(fileNameIfExists);

        return orderMap.get(fileIntro + orderNum);
    }

    public void saveAllChanges() throws FileNotFoundException {
        if (numChanges > 0) {
            for (int i = 1; i <= numChanges; i++) {
                OrderMap tempMap = megamap.get(i);
                String dateTag = megamap.get(i).getFileIntro();
                FILE_NAME = "Orders_"  + dateTag + ".txt";
                PrintWriter writer = new PrintWriter(FILE_NAME);
                for (Order o : tempMap.getOrder()) {
                    writer.print(o.getOrderNumber() + DELIMITER + o.getCustomerName()
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
}
