/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

/**
 *
 * @author Jesse
 */
//Given a String, if the first or last chars are 'x', 
//return the String without those 'x' chars, and 
//otherwise return the String unchanged. 
//
//stripX("xHix") -> "Hi"
//stripX("xHi") -> "Hi"
//stripX("Hxix") -> "Hxi"
public class StripX {

    public String stripX(String str) {
        if (str.length() == 0) {
            return "";
        }
        int n = str.length();
        if (str.substring(0, 1).equals("x") && str.substring(n - 1, n).equals("x")) {
            return str.substring(1, n - 1);
        }
        if (str.substring(0, 1).equals("x")) {
            return str.substring(1);
        }
        if (str.substring(n - 1, n).equals("x")) {
            return str.substring(0, n - 1);
        }
        return str;
    }
}
