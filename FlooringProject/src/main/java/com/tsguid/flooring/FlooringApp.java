/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguid.flooring;

import com.tsguild.flooring.ops.Controller;

import java.io.IOException;
import java.text.ParseException;


/**2
 * 
 *
 * @author apprentice
 */
public class FlooringApp {

    public static void main(String[] args) throws IOException, ParseException {
        Controller cont = new Controller();

        cont.run();
    }

}
