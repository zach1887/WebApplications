/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baseballproject;

import com.mycompany.baseballproject.ops.controller;
import java.io.IOException;

/**
 *
 * @author Jesse
 */
public class BaseBallApp {

    public static void main(String[] args) throws IOException {
        controller contr = new controller();
        contr.run();

    }
}
