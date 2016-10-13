/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.ops;

import com.tsguild.flooring.ui.ConsoleIO;
import com.tsguild.flooring.dao.*;
import com.tsguild.flooring.dto.Order;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;
import java.util.Collection;

/**
 *
 * @author apprentice
 */
public class Controller {

    ConsoleIO console = new ConsoleIO();
    OrderDaoImpl dao = new OrderDaoImpl();
    ProductDaoImpl pdao = new ProductDaoImpl();
    TaxesDaoImpl tdao = new TaxesDaoImpl();

    public void run() throws IOException, ParseException {
        boolean runMenu = true;
        pdao.loadFromFile();
        tdao.LoadFromFile();

        int userChoice;
        while (runMenu) {
            userChoice = startupMenu();
            switch (userChoice) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    editMenu();
                    break;
                case 4:
                    removeMenu();
                    break;
                case 5:
                    saveWork();
                    break;
                case 6:
                    runMenu = false;
                    break;
                default:
                    break;
            }

        }
    }

    private int startupMenu() {
        console.print("Flooring Mastery");
        console.print("Select from the options below.");
        console.print("1.  Display all orders on a given date.");
        console.print("2.  Add a new order.");
        console.print("3.  Edit an existing order.");
        console.print("4.  Remove an existing order.");
        console.print("5.  Save current work.");
        console.print("6.  Exit the database.");
        int userChoice = console.readInt("Your selection", 1, 6);
        return userChoice;
    }

    private void displayMenu() throws IOException {
        String reqDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(reqDate)) {
            console.print("That date is invalid.  Please enter another date.");
            reqDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        }
        String fileIntro = reqDate.substring(0, 2) + reqDate.substring(3, 5) + reqDate.substring(6);
        Collection<Order> ordersThatDate = dao.displayOrders(fileIntro);

        for (Order o : ordersThatDate) {
            console.print(o.getCustomerName() + "  " + o.getOrderNumber() + " "
                    + o.getStateAbbrev() + " " + o.getProductType() + " "
                    + o.getSquareFT() + " " + o.getTotalAmt());
        }
    }

    private void addMenu() throws IOException {
        String addDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(addDate)) {
            console.print("That date is invalid.  Please enter another date.");
            addDate = console.readString("Enter a date to search (mm/dd/yyyy), including leading zeroes:  ");
        }
        String fileIntro = addDate.substring(0, 2) + addDate.substring(3, 5) + addDate.substring(6);

        int orderNum = console.readInt("Enter the order number:");
        String custName = console.readString("Enter the name of the customer:  ");
        String stateAbbrev = console.readString("Enter the two-letter state abbreviation for the customer:  ");
        String productType = console.readString("Enter the product type for the customer:  ");
        while (!pdao.typeIncluded(productType)) {
            console.print("That product type is not included in our files.  Please make another selection.");
            productType = console.readString("Enter the product type for the customer:  ");
        }
        double sqFt = console.readDouble("Enter the square feet of flooring for the order:  ", 1, 10000);
        Order newOrder = new Order();
        newOrder.setCustomerName(custName);
        newOrder.setOrderNumber(orderNum);
        newOrder.setProductType(productType);
        newOrder.setStateAbbrev(stateAbbrev);
        newOrder.setSquareFT(sqFt);

        newOrder.setTaxRate(tdao.getTaxRate(stateAbbrev));
        newOrder.setMaterialCostPerSqFt(pdao.getMaterialCost(productType));
        newOrder.setLaborCostPerSqFt(pdao.getLaborCost(productType));

        newOrder.setLaborCost(sqFt * newOrder.getLaborCostPerSqFt());
        newOrder.setMaterialCost(sqFt * newOrder.getMaterialCostPerSqFt());
        newOrder.setCompTax(sqFt * newOrder.getTaxRate());
        newOrder.setTotalAmt(newOrder.getLaborCost() + newOrder.getMaterialCost() + newOrder.getCompTax());

        dao.addOrders(fileIntro, newOrder);
    }

    private void removeMenu() throws IOException {
        String remDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(remDate)) {
            console.print("That date is invalid.  Please enter another date.");
            remDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        }
        String orderNum = console.readString("Enter the order number that you would like to delete.");
        String fileIntro = remDate.substring(0, 2) + remDate.substring(3, 5) + remDate.substring(6);
        // pull out date
        //
        dao.removeOrder(remDate, fileIntro, orderNum);
    }

    private void editMenu() throws IOException {
        String editDate = console.readString("Enter a date for the order you need to change (mm/dd/yyyy), including leading zeroes:  ");
        while (!isDateValid(editDate)) {
            console.print("That date is invalid.  Please enter another date.");
            editDate = console.readString("Enter a date for the new order (mm/dd/yyyy), including leading zeroes:  ");
        }
        String orderNum = console.readString("Enter the order number that you would like to delete.");
        String fileIntro = editDate.substring(0, 2) + editDate.substring(3, 5) + editDate.substring(6);

        Order editOrder = dao.retreiveEditOrder(editDate, fileIntro, orderNum);

        console.print("Enter new values or press ENTER to keep the old value.");

        String stringOrder = console.readString("Order Number (" + editOrder.getOrderNumber() + "):  ");
        if (!stringOrder.isEmpty()) {

        }

        String custName = console.readString("Customer name (" + editOrder.getCustomerName() + "):  ");
        if (!custName.isEmpty()) {
            editOrder.setCustomerName(custName);
        }

        String StateAbbrev = console.readString("State Abbreviation(" + editOrder.getStateAbbrev() + "):  ");
        if (!StateAbbrev.isEmpty()) {
            editOrder.setStateAbbrev(StateAbbrev);
        }

        String taxRate = console.readString("Tax rate" + editOrder.getTaxRate() + "):  ");

        String prodType = console.readString("Product Type (" + editOrder.getProductType() + "):  ");
        if (!prodType.isEmpty()) {
            editOrder.setStateAbbrev(StateAbbrev);
        }

        Double sqFt = console.readDouble("Square footage of the order +(" + editOrder.getSquareFT() + "):  ");
        Double matCost = console.readDouble("Material Cost per square foot (" + editOrder.getMaterialCostPerSqFt() + "):");
        Double labCost = console.readDouble("Labor Cost per square foot (" + editOrder.getLaborCostPerSqFt() + "):");
        Double mat = console.readDouble("Cost of material (" + editOrder.getMaterialCost() + "):");
        Double lab = console.readDouble("Cost of labor (" + editOrder.getLaborCost() + "):");
        Double tax = console.readDouble("Tax (" + editOrder.getCompTax() + "):");
        Double total = console.readDouble("Total Cost of Order (" + editOrder.getLaborCost() + "):");

//         console.print("Press Enter to keep existing info...");
//        String name = console.readString("PET NAME (" + pet.getName() + "):");
//        String condition = console.readString("PET CONDITION (" + pet.getCondition() + "):");
//        String species = console.readString("PET SPECIES (" + pet.getSpecies() + "):");
//        String ageString = console.readString("PET AGE (" + pet.getAge() + "):");
//
//        if (!name.isEmpty()) {
//            pet.setName(name);
//        }
//        if (!condition.isEmpty()) {
//            pet.setCondition(condition);
//        }
//        if (!species.isEmpty()) {
//            pet.setSpecies(species);
//        }
//        if (!ageString.isEmpty()) {
//            try {
//                int age = Integer.parseInt(ageString);
//            } catch (NumberFormatException e) {
//                console.print("Please enter a valid number for the age, or a -# to keep current age.");
//                int age = console.readInt("PET AGE (" + pet.getAge() + "):");
//                if (age > 0) {
//                    pet.setAge(age);
//                }
//            }
//        }
//
//        
//        dao.updatePet(pet);
    }

    public boolean isDateValid(String str) {
        if (str.length() != 10) {
            return false;
        }
        String mm = str.substring(0, 2);
        String dd = str.substring(3, 5);
        String yyyy = str.substring(6);
        int m, d, y;

        try {
            m = Integer.parseInt(mm);
            d = Integer.parseInt(dd);
            y = Integer.parseInt(yyyy);
        } catch (NumberFormatException e) {
            return false;
        }
        if (y < 1901 || y > 2099) {
            return false;
        }
        if (m > 12) {
            return false;
        }
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d > 31) {
            return false;
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            return false;
        }
        if (m == 2 && y % 4 == 0 && d > 29) {
            return false;
        }
        return !(m == 2 && d > 28);

    }

    private saveWork() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
