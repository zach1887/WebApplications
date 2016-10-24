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
//Given a String, return a new String where "not " has been added 
//to the front. However, if the String already begins with "not", 
//return the String unchanged.
//
//Hint: Look up how to use "SubString" in c#
//
//notString("candy") -> "not candy"
//notString("x") -> "not x"
//notString("not bad") -> "not bad"
public class NotString {

    public String notString(String s) {
        if (s.length() <= 2) {
            return "not " + s;
        }
        if (!s.substring(0, 3).equals("not")) {
            return "not " + s;
        } else {
            return s;
        }
    }

}
