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

//Your cell phone rings. Return true if you should answer it. Normally you answer, 
//except in the morning you only answer if it is your mom calling. In all cases, 
//if you are asleep, you do not answer. 
//
//answerCell(false, false, false) â†’ true
//answerCell(false, false, true) â†’ false
//answerCell(true, false, false) â†’ false  
public class AnswerCell {

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    
    if (isAsleep || (isMorning && !isMom)) 
        return false;
    else return true;
  
}

}