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
//Given a non-empty String and an int N, return the String made starting 
//with char 0, and then every Nth char of the String. So if N is 3, 
//use char 0, 3, 6, ... and so on. N is 1 or more. 
//
//everyNth("Miracle", 2) -> "Mrce"
//everyNth("abcdefg", 2) -> "aceg"
//everyNth("abcdefg", 3) -> "adg"
public class EveryNth {

    public String everyNth(String str, int n) {
      if (str.length() == 0 || n == 0) 
              return "";
        String output = "";
        for (int i = 0; i < str.length(); i = i + n) {
            output += str.substring(i,i+1);     
        }
        return output;
 
    }
}
