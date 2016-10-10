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

//The parameter weekday is true if it is a weekday, and the parameter vacation 
//is true if we are on vacation. We sleep in if it is not a weekday or 
//we're on vacation. Return true if we sleep in. 
//
//canSleepIn(false, false) -> true
//canSleepIn(true, false) -> false
//canSleepIn(false, true) -> true


public class SleepingIn {
  
    public boolean canSleepIn(boolean isWeekday, boolean isVacation) {
        
        if(isWeekday && !isVacation )
            return false;
        else return true;
        
    }
}
