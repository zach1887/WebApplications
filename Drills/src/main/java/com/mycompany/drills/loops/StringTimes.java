/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

//Given a String and a non-negative int n, return a larger String that is n copies of the original String. 
//
//stringTimes("Hi", 2) -> "HiHi"
//stringTimes("Hi", 3) -> "HiHiHi"
//stringTimes("Hi", 1) -> "Hi"
public class StringTimes {
    
    public String stringTimes(String str, int n) {
        String output = "";

        if (n == 0) {
            return output;
        }

        for (int i = 1; i <= n; i++) {
            output = output + str;
        }

        return output;

    }

}
