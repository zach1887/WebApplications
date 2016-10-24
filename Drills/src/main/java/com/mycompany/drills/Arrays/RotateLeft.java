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
//    Given an array of ints, return an array with the elements 
//            "rotated left" so {1, 2, 3} yields {2, 3, 1}. 
//
//rotateLeft({1, 2, 3}) -> {2, 3, 1}
//rotateLeft({5, 11, 9}) -> {11, 9, 5}
//rotateLeft({7, 0, 0}) -> {0, 0, 7}
public class RotateLeft {

    public int[] rotateLeft(int[] numbers) {
        int n = numbers.length; 
        if (n == 1) {
            return numbers;
        }
        int [] newNumbers = new int[n];
        newNumbers[n-1] = numbers[0];
        for (int i = 0; i < n-1; i++) {
            newNumbers[i] = numbers[i+1];
        }
        return newNumbers;
            
        }
}
