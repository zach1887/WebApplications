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
//Given an array of ints, return true if it contains a 2, 7, 1 
//pattern -- a value, followed by the value plus 5, followed
//by the value minus 1.
//
//pattern51({1, 2, 7, 1}) -> true
//pattern51({1, 2, 8, 1}) -> false
//pattern51({2, 7, 1}) -> true

public class Pattern51 {
    public boolean pattern51(int[] numbers) {
        int firstNum;
   if (numbers.length <= 2) return false;
        for (int i = 0; i < numbers.length - 2; i++) {
            firstNum = numbers[i];
            if(numbers[i+1] == firstNum + 5 && numbers[i+2]== firstNum - 1)
                return true;
        }
        return false;
}
}
