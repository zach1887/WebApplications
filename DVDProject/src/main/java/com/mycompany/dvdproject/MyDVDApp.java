/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdproject;

import com.mycompany.dvdproject.ops.DVDCommander;
import java.io.IOException;

/**
 *
 * @author Jesse
 */
public class MyDVDApp {


    public static void main(String[] args) throws IOException {

        DVDCommander DVDc = new DVDCommander();

        DVDc.run();

    }
}
