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
//Given an array of ints, return the sum of all the elements. 
//
//sum({1, 2, 3}) -> 6
//sum({5, 11, 2}) -> 18
//sum({7, 0, 0}) -> 7
//
//public int sum(int[] numbers) {
public class Sum {

    public int sum(int[] numbers) {
        int output = 0;
        for (int i = 0; i < numbers.length; i++) {
            output +=numbers[i]; 
        }
        return output;

    }
}
