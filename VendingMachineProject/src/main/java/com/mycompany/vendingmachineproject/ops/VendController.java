/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject.ops;

import com.mycompany.vendingmachineproject.dao.MyDao;
import com.mycompany.vendingmachineproject.dto.VendObject;
import com.mycompany.vendingmachineproject.ui.ConsoleIO;
import java.io.IOException;

/**
 *
 * @author Jesse
 */
public class VendController {

    MyDao dao = new MyDao();
    ConsoleIO console = new ConsoleIO();
  int ctSn = dao.displayQuantities()[0];
  int ctRs = dao.displayQuantities()[1];
  int ctTw = dao.displayQuantities()[2];
  int ctCr = dao.displayQuantities()[3];
  int ctGm = dao.displayQuantities()[4];

    public void run() throws IOException {

        //       boolean keepRunning = true;
        int candyChoice = 0;
        int candyPrice;
        int countTrans = 0;
        int ctSn, ctRs, ctTw, ctCr, ctGm;
        dao.loadFromFile();
        int startMoney = startMenu();
        int currentMoney = startMoney;
        if (startMoney == 0) {
            console.print("Have a nice day!");
        } else {
            while (candyChoice != 6) {
                candyChoice = display_candy_menu(currentMoney);
            }
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
            console.print("Your change is " + currentMoney + " cents.");
//            console.print("This will be dispensed as " + coinMatrix());
            dao.saveToFile();

            // loadfile with Quantity Info
        }
    }

    public int startMenu() {

        console.print("Thanks for stopping in at the Vending Machine.");
        console.print("Current available options are below.");

        if (ctSn > 0) {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t Qty: " + ctSn);
        } else {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t SOLD OUT");
        }


        if (ctRs > 0) {
            console.print("Reeses \t \t" + "Price: " + dao.displayPrices()[1]  + " \t Qty: " + ctRs);
        } else {
            console.print("Reeses \t \t" + "Price: " + dao.displayPrices()[1]  + " \t SOLD OUT");
        }


        if (ctTw > 0) {
            console.print("Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t Qty: " + ctTw);
        } else {
            console.print("Twix \t \t" + "Price: " + dao.displayPrices()[2] + " \t SOLD OUT");
        }

        if (ctCr > 0) {
            console.print("Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t Qty: " + ctCr);
        } else {
            console.print("Certs \t \t" + "Price: " + dao.displayPrices()[3] + " \t SOLD OUT");
        }


        if (ctGm > 0) {
            console.print("Gum \t \t" + "Price: " +  dao.displayPrices()[4] + " \t Qty: " + ctGm);
        } else {
            console.print("Gum \t \t" + "Price: " +  dao.displayPrices()[4] + " \t SOLD OUT");
        }

        int moneyIn = console.readInt("Enter in any amount of money (in cents, from 1 - 500, or 0 to quit:");
        return moneyIn;

    }

    public int display_candy_menu(int moneyIn) {
        console.print("You have entered an amount of " + moneyIn + " .");


        if (ctSn > 0) {
            console.print("(1) Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t Qty: " + ctSn);
        } else {
            console.print("Snickers \t" + "Price: " + dao.displayPrices()[0] + " \t SOLD OUT");
        }


        if (ctRs > 0) {
            console.print("(2)Reeses \t" + "Price: " + dao.displayPrices()[1] + " \t Qty: " + ctRs);
        } else {
            console.print("Reeses \t" + "Price: " + dao.displayPrices()[1]+ " \t SOLD OUT");
        }


        if (ctTw > 0) {
            console.print("(3)Twix \t" + "Price: " + dao.displayPrices()[2] + " \t Qty: " + ctTw);
        } else {
            console.print("Twix \t" + "Price: " + dao.displayPrices()[2]+ " \t SOLD OUT");
        }

 
        if (ctCr > 0) {
            console.print("(4) Certs \t" + "Price: " + dao.displayPrices()[3] + " \t Qty: " + ctCr);
        } else {
            console.print("Certs \t" + "Price: " + dao.displayPrices()[3] + " \t SOLD OUT");
        }

        if (ctGm > 0) {
            console.print("(5)Gum \t" + "Price: " + dao.displayPrices()[4] + " \t Qty: " + ctGm);
        } else {
            console.print("Gum \t" + "Price: " + dao.displayPrices()[4] + " \t SOLD OUT");
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
    
    private int[] coinMatrix (int coinChange) {
        int [] coins = {0,0,0,0};
       
        coins [3] = (coinChange - coinChange % 25)/25;
        int ch = (coinChange - 25*coins[3]);
        coins [2] = (ch - (ch % 10)) /10;
        int ch2 = ch - 10*coins[2];
        coins[1] = (ch2 - (ch %5))/5;
        coins[0] = ch2 % 5;
        
        return coins;
        
    }

}
