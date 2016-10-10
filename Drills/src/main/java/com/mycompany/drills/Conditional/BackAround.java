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
//Given a String, take the last char and return a new String with the last 
//char added at the front and back, so "cat" yields "tcatt". The original 
//String will be length 1 or more. 
//
//backAround("cat") -> "tcatt"
//backAround("Hello") -> "oHelloo"
//backAround("a") -> "aaa"
public class BackAround {

    public String backAround(String str) {
        if (str.length() == 0) {
            return "";
        }
        int end = str.length() -1;
        String endChar = str.substring(end);
          return endChar + str + endChar;
    }
}
