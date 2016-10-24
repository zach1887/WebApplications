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
//Return true if the given String contains between 1 and 3 'e' chars. 
//
//gotE("Hello") -> true
//gotE("Heelle") -> true
//gotE("Heelele") -> false

public class EEEEEE {

public boolean gotE(String str) {
    int count = 0;
    if (str.length() == 0) return false;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'e') count++;
    }
    return (count == 1 || count == 2 || count == 3);
}    
}
