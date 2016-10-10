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
//Given a String, return a new String where the first and last chars have been exchanged. 
//
//frontBack("code") -> "eodc"
//frontBack("a") -> "a"
//frontBack("ab") -> "ba"
public class FrontBack {

    public String frontBack(String str) {
        if (str.length() == 0) {
            return "";
        }
        String output = "";
        for (int i = str.length() - 1; i >=0; i--) {
            output = output + str.substring(i,i+1);
        }
        return output;

    }

}
