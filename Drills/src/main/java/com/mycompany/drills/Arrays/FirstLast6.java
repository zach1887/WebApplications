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
//Given an array of ints, return true if 6 appears as either 
//the first or last element in the array. The array will be length
//1 or more. 
//
//firstLast6({1, 2, 6}) -> true
//firstLast6({6, 1, 2, 3}) -> true
//firstLast6({13, 6, 1, 2, 3}) -> false
public class FirstLast6 {

    public boolean firstLast6(int[] numbers) {
        if (numbers.length == 0) {
            return false;
        }
        return (numbers[0] == 6 || numbers[numbers.length - 1] == 6);
    }

}
