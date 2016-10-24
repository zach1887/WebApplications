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

//Given an int array, return a new array with double the length 
//where its last element is the same as the original array, and 
//all the other elements are 0. The original array will be length 
//1 or more. Note: by default, a new int array contains all 0's. 
//
//keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
//keepLast({1, 2}) -> {0, 0, 0, 2}
//keepLast({3}) -> {0, 3}


public class KeepLast {
    public int[] keepLast(int[] numbers) {
    int n = numbers.length;
    int [] newNumbers = new int[2*n];
    newNumbers[2*n - 1] = numbers[n-1];
    return newNumbers;
    
}
}
