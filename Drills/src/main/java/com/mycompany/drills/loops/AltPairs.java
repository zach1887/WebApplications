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
//
//Given a String, return a String made of the chars 
//at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 
//
//altPairs("kitten") -> "kien"
//altPairs("Chocolate") -> "Chole"
//altPairs("CodingHorror") -> "Congrr"
public class AltPairs {

    public String altPairs(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String output = "";
        int n = str.length();

        for (int i = 0; i < n / 4; i++) {
            output = output + str.substring(4 * i, 4 * i + 2);
        }

        if (str.length() % 4 == 1) {
            output = output + str.substring(n - 1);
        } else if (str.length() % 4 == 2) {
            output = output + str.substring(n - 2);
        } else if (str.length() % 4 == 3) {
            output = output + str.substring(n - 3, n - 1);
        }

        return output;
    }
}
