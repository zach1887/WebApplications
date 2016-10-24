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
//Given a String, return a version without the first 2 chars. Except 
//keep the first char if it is 'a' and keep the second char if it is 'b'. 
//The String may be any length.
//
//tweakFront("Hello") -> "llo"
//tweakFront("away") -> "aay"
//tweakFront("abed") -> "abed"
public class TweakFromFront {

    public String tweakFront(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1 && !str.equals("a")) {
            return "";
        }
        if (str.equals("a")) {
            return str;
        }
        if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
            return str;
        }
        if (!str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
            return ("b" + str.substring(2));
        }
        if (str.substring(0, 1).equals("a") && !str.substring(1, 2).equals("b")) {
            return ("a" + str.substring(2));
        }
            return str.substring(2);


    }
}
