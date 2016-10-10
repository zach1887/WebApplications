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

//Return true if the given non-negative number is a 
//multiple of 3 or a multiple of 5. Use the % "mod" operator
//
//multiple3or5(3) -> true
//multiple3or5(10) -> true
//multiple3or5(8) -> false

public class Multiple3or5 {
 
    public boolean multiple3or5(int number) {
        
        return (number % 5 == 0 || number % 3 == 0);

}
}
