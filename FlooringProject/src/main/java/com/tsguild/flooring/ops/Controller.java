/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.flooring.ops;

import com.tsguild.flooring.ui.ConsoleIO;
import com.tsguild.flooring.dao.*;
import com.tsguild.flooring.dao.OrderDaoImpl;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DecimalFormat;

/**
 *
 * @author apprentice
 */
public class Controller {

    ConsoleIO console = new ConsoleIO();
    OrderDaoImpl dao = new OrderDaoImpl();
    ProductDaoImpl pdao = new ProductDaoImpl();
    TaxesDaoImpl tdao = new TaxesDaoImpl();
    SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
    Date date = new Date();

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
                    break;
                case 4:
                    break;
                case 5:
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
        String reqDate = console.readString("Enter a date to search (mm/dd/yyyy):  ");
        try {
            String fileIntro = convertDate(sdf.parse(reqDate));
            dao.displayOrders(fileIntro);
        } catch (ParseException ex) {
            console.print("That date is invalid.  Please select another date.");
        }
    }

    private void addMenu() throws IOException, ParseException {
        String addDate = console.readString("Enter a date for the new order (mm/dd/yyyy):  ");
        String fileIntro = convertDate(sdf.parse(addDate));

        String custName = console.readString("Enter the name of the customer:  ");
        String stateAbbrev = console.readString("Enter the two-letter state abbreviation for the customer:  ");
        String productType = console.readString("Enter the product type for the customer:  ");
        while (pdao.typeIncluded) {
            console.print("That product type is not included in our files.  Please make another selection.");
            productType = console.readString("Enter the product type for the customer:  ");
        }
        double sqFt = console.readDouble("Enter the square feet of flooring for the order:  ", 1, 10000);

        dao.addOrders(fileIntro, custName, stateAbbrev, productType, sqFt);
    }

    public String convertDate(Date date) {
        String str1 = Integer.toString((date.getMonth() + 100)).substring(1);
        String str2 = Integer.toString((date.getDay() + 100)).substring(1);
        String str3 = Integer.toString(date.getYear());
        String output = str1 + str2 + str3;
        return output;
    }

}
