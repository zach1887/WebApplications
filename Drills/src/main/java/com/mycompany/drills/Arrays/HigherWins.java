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
//Given an array of ints, figure out which is larger between the first 
//and last elements in the array, and set all the other elements to be 
//that value. Return the changed array. 
//
//higherWins({1, 2, 3}) -> {3, 3, 3}
//higherWins({11, 5, 9}) -> {11, 11, 11}
//higherWins({2, 11, 3}) -> {3, 3, 3}
public class HigherWins {

    public int[] higherWins(int[] numbers) {

        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int maxFirstAndLast = first;
        if (last > first) {
            maxFirstAndLast = last;
        }
        int[] output = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            output[i] = maxFirstAndLast;
        }
        return output;

    }
}
