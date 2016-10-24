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
//Given a String, return a new String where the last 3 chars 
//are now in upper case. If the String has less than 3 chars, 
//uppercase whatever is there. 
//
//endUp("Hello") -> "HeLLO"
//endUp("hi there") -> "hi thERE"
//endUp("hi") -> "HI"

public class EndUp {

    public String endUp(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() <= 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}

