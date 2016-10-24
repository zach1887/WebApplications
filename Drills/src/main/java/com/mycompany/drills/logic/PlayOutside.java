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
//The children in Cleveland spend most of the day playing outside. In particular, 
//they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, 
//then the upper limit is 100 instead of 90. Given an int temperature and a 
//boolean isSummer, return true if the children play and false otherwise. 

//playOutside(70, false) â†’ true
//playOutside(95, false) â†’ false
//playOutside(95, true) â†’ true
//
//public boolean playOutside(int temp, boolean isSummer) {
//  
//}

public class PlayOutside {
 
    public boolean playOutside(int temp, boolean isSummer) {
        
        if (temp >= 60 && temp <=90 && !isSummer)
            return true;
        if (temp >= 60 && temp <=100 && isSummer)
            return true;
        return false;
        
  
}
}
