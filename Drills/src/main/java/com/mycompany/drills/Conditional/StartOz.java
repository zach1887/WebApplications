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
//Given a String, return a String made of the first 2 chars (if present), 
//however include first char only if it is 'o' and include the second only 
//if it is 'z', so "ozymandias" yields "oz". 
//
//startOz("ozymandias") -> "oz"
//startOz("bzoo") -> "z"
//startOz("oxx") -> "o"
public class StartOz {

    public String startOz(String str) {
        if (str.substring(0, 2).equals("oz")) {
            return "oz";
        }
        if (str.substring(0, 1).equals("o")) {
            return "o";
        }
        if (str.substring(1, 2).equals("z")) {
            return "z";  
        }
        return "";
    }
}
