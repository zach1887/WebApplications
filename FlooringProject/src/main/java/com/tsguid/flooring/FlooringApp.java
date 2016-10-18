/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguid.flooring;

import com.tsguild.flooring.ops.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.text.ParseException;

/**
 * 
 *
 * @author apprentice
 */
public class FlooringApp {

    public static void main(String[] args) throws IOException, ParseException {

        ApplicationContext springFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Controller cont = springFactory.getBean("controller", Controller.class);

        cont.run();
    }

}
