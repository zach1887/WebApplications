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
//Given an int array, return true if 
//the array contains 2 twice, or 3 twice. 
//
//double23({2, 2, 3}) -> true
//double23({3, 4, 5, 3}) -> true
//double23({2, 3, 2, 2}) -> false
public class Double23 {

    public boolean double23(int[] numbers) {
        if (numbers.length <2) return false;
        int numTwo = 0;
        int numThree = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 2) numTwo++;
            else if (numbers[i] == 3) numThree++;
        }
        return (numTwo == 2 || numThree == 2);
    }
}
