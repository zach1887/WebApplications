/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Arrays;

/**
 *
 * @author Jesse
 */
//Return an int array length n containing the first n digits of pi.
//
//makePi(3) -> {3, 1, 4}
public class MakePi {

    public int[] makePi(int n) {
        int[] output = new int[n];
        double remainder;
        output[0] = (int) Math.PI;
        remainder = Math.PI - output[0];
        for (int i = 1; i < n; i++) {
            output[i] = (int) (remainder*Math.pow(10, i));
            remainder -= output[i]*Math.pow(10,-i);
        }
        return output;
    }
}
