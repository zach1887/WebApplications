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

//Given an "out" String length 4, such as "<<>>", and a word, 
//a new String where the word is in the middle of the out String, e.g. "<<word>>".
//
//Hint: SubStrings are your friend here 
//
//insertWord("<<>>", "Yay") -> "<<Yay>>"
//insertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
//insertWord("[[]]", "word") -> "[[word]]"


public class InsertWord {
 
    public String insertWord(String container, String word) {
        
        if (container.length() !=4)
            return "";
        String output = container.substring(0, 2) + word + container.substring(2,4);
        
        return output;

}
}
