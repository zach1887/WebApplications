/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.inheritanceandinterface.product;

/**
 *
 * @author Jesse
 */
public class FirstRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DressShirt fancy = new DressShirt("Fancy", 42.00, 101, 10);
        Pants casual = new Pants("Casual", 28.00, 100, 5);
        SuitCoat blueBlazer = new SuitCoat("Blue Blazer", 140.00, 100, 1);
        Accessory redTie = new Accessory("Red Tie", 33.00, 100, 10);

        Inventory firstRun = new Inventory();

        firstRun.addToInventory(fancy);
        firstRun.addToInventory(casual);
        firstRun.addToInventory(blueBlazer);
        firstRun.addToInventory(redTie);

        String[] firstList = firstRun.listAllInventory();

        for (int i = 0; i < firstList.length; i++) {
            System.out.println(firstList[i]);

        }
        firstRun.DropFromInventory(redTie);

        String[] secondList = firstRun.listAllInventory();
        for (String secondList1 : secondList) {
            System.out.println(secondList1);
        }
        // TODO code application logic here
    }

}
