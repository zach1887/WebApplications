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
//
//Return true if the given String begins with "*ix", 
//the '*' can be anything, so "pix", "9ix" .. all count. 
//
//ixStart("mix snacks") -> true
//ixStart("pix snacks") -> true
//ixStart("piz snacks") -> false
public class IxStart {

    public boolean ixStart(String str) {
        if (str.length()<3)
            return false;        
       if(str.substring(1,3).equals("ix")) 
           return true;
       return false;
    }
}
