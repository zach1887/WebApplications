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
//Given an array of ints, return true if .. 1, 2, 3, .. 
//appears in the array somewhere. 
//
//array123({1, 1, 2, 3, 1}) -> true
//array123({1, 1, 2, 4, 1}) -> false
//array123({1, 1, 2, 1, 2, 3}) -> true
public class Array123 {

    public boolean array123(int[] numbers) {

        if (numbers.length <= 2) {
            return false;
        }
        int[] sequence = {1, 2, 3};

        for (int i = 0; i < numbers.length - 2; i++) {
            if (numbers[i] == 1 && numbers[i + 1] == 2
                    && numbers[i + 2] == 3) {
                return true;
            }
        }
        return false;

    }
}
