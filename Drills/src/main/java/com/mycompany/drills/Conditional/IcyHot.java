/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Conditional;

/**
 *
 * @author Jesse
 */
// Given two temperatures, return true if one is less
//than 0 and the other is greater than 100. 
//
//icyHot(120, -1) -> true
//icyHot(-1, 120) -> true
//icyHot(2, 120) -> false
public class IcyHot {

    public boolean icyHot(int temp1, int temp2) {
       return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }

}
