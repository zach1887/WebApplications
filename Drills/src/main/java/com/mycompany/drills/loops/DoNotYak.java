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
//Suppose the String "yak" is unlucky. Given a String, return a
//version where all the "yak" are removed, but the "a" can be any 
//char. The "yak" Strings will not overlap. 
//
//doNotYak("yakpak") -> "pak"
//doNotYak("pakyak") -> "pak"
//doNotYak("yak123ya") -> "123ya"
public class DoNotYak {

    public String doNotYak(String str) {
        if (str.length() < 3) {
            return str;
        }
        int n = str.length();
        String output = "";

        for (int i = 0; i < n; i++) {
            if (i <= (n - 3) && str.substring(i, i + 3).equals("yak")) {
                i = i + 2;
            } else {
                output = output + str.substring(i, i + 1);
            }
        }
            return output;
        }
    }
