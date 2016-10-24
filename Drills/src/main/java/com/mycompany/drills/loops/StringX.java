/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.loops;

/**
 *
 * @author Jesse
 */
//Given a String, return a version where all the "x" have 
//been removed. Except an "x" at the very start or end 
//should not be removed. 
//
//stringX("xxHxix") -> "xHix"
//stringX("abxxxcd") -> "abcd"
//stringX("xabxxxcdx") -> "xabcdx"
public class StringX {

    public String stringX(String str) {
     if (str.length() == 0) return "";
     if (str.length() <= 2) return str;
     
     String middle = "";
        for (int i = 1; i < str.length() -1 ; i++) {
            if (str.charAt(i) != 'x') 
                   middle = middle + str.substring(i,i+1);
        }
        return (str.substring(0,1) + middle + str.substring(str.length()-1));
    }
}
