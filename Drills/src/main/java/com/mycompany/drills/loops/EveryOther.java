/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

/**
 *
 * @author Jesse
 */
//Given a String, return a new String made of every other char 
//starting with the first, so "Hello" yields "Hlo". 
//
//everyOther("Hello") -> "Hlo"
//everyOther("Hi") -> "H"
//everyOther("Heeololeo") -> "Hello"
public class EveryOther {

    public String everyOther(String str) {
        String output = "";
        for (int i = 0; i <= (str.length()-1) / 2; i++) {
            output = output + str.charAt(i * 2);
        }
        return output;
    }
}
