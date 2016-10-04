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
import java.text.DecimalFormat;

/**
 *
 * @author Jesse
 */
public class VendController {

    MyDao dao = new MyDao();
    ConsoleIO console = new ConsoleIO();
    DecimalFormat df = new DecimalFormat("####.00");

    public void run() throws IOException {

        double candyPrice = 0.00;
        dao.loadFromFile();
        double startMoney = startMenu();
        console.print("You have entered $" + df.format(startMoney) + ".");
        double currentMoney = startMoney;

        int candyChoice = buyMenu();

        while (candyChoice != dao.getSize() + 1) {
            for (int k = 1; k <= dao.getSize(); k++) {
                if (candyChoice == k) {
                    if (dao.getCandyQty(k) == 0) {
                        console.print("That item is sold out.  Please make another selection.");
                    } else {
                        candyPrice = dao.getCandyPrice(k);
                        if (candyPrice > currentMoney) {
                            console.print("You do not have sufficient funds to purchase this item;");
                            candyChoice = buyMenu();
                        } else {
                            currentMoney -= candyPrice;
                            decreaseQty(candyChoice);
                            console.print("You now have $" + currentMoney + " remaining.");
                            candyChoice = buyMenu();
                        }
                    }
                }
            }
        }

                    if (currentMoney == 0) {
                        console.print("Thank you for your purchase.");
                    } else {
                        console.print("Your change is " + (int) (100*currentMoney) + " cents.");
                        int[] coinReturn = coinMatrix(currentMoney);
                        console.print("This will be dispensed as " + coinReturn[3] + " quarters, "
                                + coinReturn[2] + " dimes, " + coinReturn[1] + " nickels, and "
                                + coinReturn[0] + " pennies.");
                    }
                    dao.saveToFile();
                }
           
  
    
    

    

    

    public double startMenu() {

        console.print("Thanks for stopping in at the Vending Machine.");
        console.print("Current available options are below.");
        for (int i = 1; i <= dao.getSize(); i++) {
            console.print(dao.getCandyName(i) + "\t " + dao.getCandyQty(i) + "\t"
                    + dao.getCandyPrice(i));
        }
        double moneyIn = console.readDouble("Enter in an amount no greater than $5.00.");
        return moneyIn;
    }

//
    private int[] coinMatrix(double Change) {
        int coinChange = (int) (100*Change);
        int[] coins = {0, 0, 0, 0};

        coins[3] = (coinChange - coinChange % 25) / 25;
        int ch = (coinChange - 25 * coins[3]);
        coins[2] = (ch - (ch % 10)) / 10;
        int ch2 = ch - 10 * coins[2];
        coins[1] = (ch2 - (ch % 5)) / 5;
        coins[0] = ch2 % 5;

        return coins;
    }
        //

    private int buyMenu() {
        console.print("Current available options are below.");
        for (int i = 1; i <= dao.getSize(); i++) {
            console.print("(" + i + ")" + dao.getCandyName(i) + "\t " + dao.getCandyQty(i)
                    + "\t" + dao.getCandyPrice(i));
        }
        console.print("( " + (dao.getSize() + 1) + ") Return change and exit.");
        int choice = console.readInt("Your selection:  ", 1, dao.getSize() + 1);
        return choice;
    }

    //    private int[] coinMatrix(int coinChange) {
//        int[] coins = {0, 0, 0, 0};
//
//        coins[3] = (coinChange - coinChange % 25) / 25;
//        int ch = (coinChange - 25 * coins[3]);
//        coins[2] = (ch - (ch % 10)) / 10;
//        int ch2 = ch - 10 * coins[2];
//        coins[1] = (ch2 - (ch % 5)) / 5;
//        coins[0] = ch2 % 5;
//
//        return coins;
//
//    }
    private void decreaseQty(int candyChoice) {
        dao.DecreaseQty(candyChoice);
    }
}


