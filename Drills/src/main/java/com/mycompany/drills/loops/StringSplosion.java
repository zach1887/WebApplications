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
//Given a non-empty String like "Code" return a String 
//like "CCoCodCode".  (first char, first two, first 3, etc)
//
//stringSplosion("Code") -> "CCoCodCode"
//stringSplosion("abc") -> "aababc"
//stringSplosion("ab") -> "aab"
public class StringSplosion {

    public String stringSplosion(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.substring(0, i+1);
        }
        return output;
    }
}
