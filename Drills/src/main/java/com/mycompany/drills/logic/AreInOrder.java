/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.logic;

/**
 *
 * @author Jesse
 */
public class AreInOrder {

//    Given three ints, a b c, return true if b is greater than a, and c is 
//    greater than b. However, with the exception that if "bOk" is true, 
//    b does not need to be greater than a. 
//
//areInOrder(1, 2, 4, false) â†’ true
//areInOrder(1, 2, 1, false) â†’ false
//areInOrder(1, 1, 2, true) â†’ true
    public boolean areInOrder(int a, int b, int c, boolean bOk) {

        if (bOk) {
            if (a <= b && b <= c) {
                return true;
            } else {
                return false;
            }
        } else if (a < b && b < c) {
            return true;
        } else {
            return false;
        }

    }

}
