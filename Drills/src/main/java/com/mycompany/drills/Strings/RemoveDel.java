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
public class RemoveDel {

//  Given a String, if the String "del" appears starting at index 1, 
//  return a String where that "del" has been deleted. Otherwise, return the 
//          String unchanged. 
//
//removeDel("adelbc") -> "abc"
//removeDel("adelHello") -> "aHello"
//removeDel("adedbc") -> "adedbc"
    public String removeDel(String str) {
        String newString = str;
        if (str.length() < 4)
                return newString;
        else if (str.substring(1, 4).equals("del")) {
            newString = str.substring(0,1) + str.substring(4);
        }
        return newString;
    }

}

