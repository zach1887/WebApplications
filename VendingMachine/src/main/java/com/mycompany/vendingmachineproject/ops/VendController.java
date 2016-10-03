/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject.ops;

import com.mycompany.vendingmachineproject.dao.MyDao;
//import com.mycompany.vendingmachineproject.dto.VendObject;
import com.mycompany.vendingmachineproject.ui.ConsoleIO;
import java.io.IOException;

/**
 *
 * @author Jesse
 */
public class VendController {

    MyDao dao = new MyDao();
    ConsoleIO console = new ConsoleIO();

    public void run() throws IOException {

        //       boolean keepRunning = true;
        dao.loadFromFile();

        int candyChoice = 0;
        int candyPrice;
        int countTrans = 0;
//        int ctSn, ctRs, ctTw, ctCr, ctGm;
        dao.loadFromFile();
        int startMoney = startMenu();
        int currentMoney = startMoney;
        if (startMoney == 0) {
            console.print("Have a nice day!");
        } else {
            while (candyChoice != 6) {
                candyChoice = display_candy_menu(currentMoney);

                candyPrice = dao.checkCandyPrice(candyChoice);
                if (startMoney >= candyPrice) {
                    countTrans++;
                    currentMoney -= candyPrice;
                    vendItem(candyChoice);
                } else {
                    console.print("You do not have enough money to purchase that item.");
                    console.print("You have entered " + startMoney + " .");
                    candyChoice = display_candy_menu(startMoney);
                }
            }
            console.print("Your change is " + currentMoney + " cents.");
            int[] coinReturn = coinMatrix(currentMoney);
            console.print("This will be dispensed as " + coinReturn[3] + " quarters, "
                    + coinReturn[2] + " dimes, " + coinReturn[1] + " nickels, and "
                    + coinReturn[0] + " pennies.");

            dao.saveToFile();

            // loadfile with Quantity Info
        }
    }

    public int startMenu() {

        console.print("Thanks for stopping in at the Vending Machine.");
        console.print("Current available options are below.");

        if (dao.displayQuantities()[0] > 0) {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t Qty: "
                    + dao.displayQuantities()[0]);
        } else {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[1] > 0) {
            console.print("Reeses \t \t" + "Price: " + dao.displayPrices()[1] + " \t Qty: "
                    + dao.displayQuantities()[1]);
        } else {
            console.print("Reeses \t \t" + "Price: " + dao.displayPrices()[1] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[2] > 0) {
            console.print("Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t Qty: "
                    + dao.displayQuantities()[2]);
        } else {
            console.print("Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[3] > 0) {
            console.print("Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t Qty: " + dao.displayQuantities()[3]);
        } else {
            console.print("Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[4] > 0) {
            console.print("Gum \t \t \t" + "Price: " + dao.displayPrices()[4] + " \t Qty: " + dao.displayQuantities()[4]);
        } else {
            console.print("Gum \t \t \t" + "Price: " + dao.displayPrices()[4] + " \t SOLD OUT");
        }

        int moneyIn = console.readInt("Enter in any amount of money (in cents, from 1 - 500, or 0 to quit:");
        return moneyIn;

    }

    public int display_candy_menu(int moneyIn) {
        console.print("You have entered an amount of " + moneyIn + " .");

        if (dao.displayQuantities()[0] > 0) {
            console.print("(1) Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t Qty: "
                    + dao.displayQuantities()[0]);
        } else {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[1] > 0) {
            console.print("(2) Reeses \t \t" + "Price: " + dao.displayPrices()[1] + " \t Qty: "
                    + dao.displayQuantities()[1]);
        } else {
            console.print("Reeses \t \t" + "Price: " + dao.displayPrices()[1] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[2] > 0) {
            console.print("(3) Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t Qty: "
                    + dao.displayQuantities()[2]);
        } else {
            console.print("Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[3] > 0) {
            console.print("(4) Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t Qty: " + dao.displayQuantities()[3]);
        } else {
            console.print("Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t SOLD OUT");
        }

        if (dao.displayQuantities()[4] > 0) {
            console.print("(5) Gum \t \t \t" + "Price: " + dao.displayPrices()[4] + " \t Qty: " + dao.displayQuantities()[4]);
        } else {
            console.print("Gum \t \t \t" + "Price: " + dao.displayPrices()[4] + " \t SOLD OUT");
        }
        console.print("Current available options are below.");

        console.print("(6) Cancel transaction and return change.");
        int candy_choice = console.readInt("Your selection: ", 1, 6);
        return candy_choice;
    }
    // load file

    //vend item MSG void
    //ven item update total int  
    //update soldOUT if needed
    //save file;    
    private void vendItem(int candyChoice) {
        dao.updateQuantity(candyChoice);
    }

    private int[] coinMatrix(int coinChange) {
        int[] coins = {0, 0, 0, 0};

        coins[3] = (coinChange - coinChange % 25) / 25;
        int ch = (coinChange - 25 * coins[3]);
        coins[2] = (ch - (ch % 10)) / 10;
        int ch2 = ch - 10 * coins[2];
        coins[1] = (ch2 - (ch % 5)) / 5;
        coins[0] = ch2 % 5;

        return coins;

    }

}
