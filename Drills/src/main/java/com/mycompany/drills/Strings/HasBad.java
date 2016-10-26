/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

/**
 *
 * @author Jesse
 */
//
//Given a String, return true if "bad" appears starting at 
//index 0 or 1 in the String, such as with "badxxx" or "xbadxx" 
//but not "xxbadxx". The String may be any length, including 0.
//
//hasBad("badxx") -> true
//hasBad("xbadxx") -> true
//hasBad("xxbadxx") -> false
public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.length() == 3) {
            return ("bad").equals(str.substring(0, 3));
        }
        return (("bad").equals(str.substring(0, 3)) || ("bad").equals(str.substring(1, 4)));
    }
}
