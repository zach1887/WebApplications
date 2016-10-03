/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachineproject;

import com.mycompany.vendingmachineproject.ops.VendController;
import java.io.IOException;

/**
 *
 * @author Jesse
 */
public class VendingApp {

    public static void main(String[] args) throws IOException {

        VendController vendc = new VendController();
        vendc.run();

    }
}
