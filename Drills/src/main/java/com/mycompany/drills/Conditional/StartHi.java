/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

/**
 *
 * @author Jesse
 */
//
//Given a String, return true if the String
//starts with "hi" and false otherwise. 
//
//startHi("hi there") -> true
//startHi("hi") -> true
//startHi("high up") -> false
public class StartHi {

    public boolean startHi(String str) {
        if (str.length() <= 1) return false;
        if (str.length() == 2) return str.equals("hi");
        return (str.substring(0,3).equals("hi "));
    }
}
