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
        
      listMenu();
      
//            console.print("Your change is " + currentMoney + " cents.");
//            int[] coinReturn = coinMatrix(currentMoney);
//            console.print("This will be dispensed as " + coinReturn[3] + " quarters, "
//                    + coinReturn[2] + " dimes, " + coinReturn[1] + " nickels, and "
//                    + coinReturn[0] + " pennies.");
//
//            dao.saveToFile();

            // loadfile with Quantity Info
        }
  

//    public int startMenu() {
//
//        console.print("Thanks for stopping in at the Vending Machine.");
//        console.print("Current available options are below.");
//        
//       
//        return moneyIn;
//
//    }
//
//
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

    private void listMenu() {
       Collection<VendObject> = dao.getallCandy();
    }

}
