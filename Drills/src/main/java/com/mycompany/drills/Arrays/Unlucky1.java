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
//
//We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
//Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array. 
//
//unlucky1({1, 3, 4, 5}) -> true
//unlucky1({2, 1, 3, 4, 5}) -> true
//unlucky1({1, 1, 1}) -> false
public class Unlucky1 {

    public boolean unlucky1(int[] numbers) {
    int n = numbers.length;
        if (n < 2) {
            return false;
        }

        if (numbers[0] == 1 && numbers[1] == 3)
            return true;

        if (n > 2 && numbers[1] == 1 && numbers[2] == 3) 
            return true;
  
        if ((numbers.length > 3) && 
                ((numbers[n - 3] == 1 && numbers[n- 2] == 3) 
                || (numbers[n - 2] == 1 && numbers[n - 1] == 3))) 
                return true;
        
        return false;

    }
}
