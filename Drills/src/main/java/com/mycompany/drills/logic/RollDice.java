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
//
//Return the sum of two 6-sided dice rolls, each in the range 1..6. 
//However, if noDoubles is true, if the two dice show the same value, 
//increment one die to the next value, wrapping around to 1 if its value was 6. 
//
//rollDice(2, 3, true) â†’ 5
//rollDice(3, 3, true) â†’ 7
//rollDice(3, 3, false) â†’ 6
public class RollDice {

    public int rollDice(int die1, int die2, boolean noDoubles) {

        if (!noDoubles || die1 != die2) {
            return (die1 + die2);
        }

        if (die1 != 6) {
            return 2 * die1 + 1;
        }
        return 7;

    }
}
