/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drills.Strings;

/**
 *
 * @author Jesse //
 */
//Given a String, return a String length 1 from its front, 
//unless front is false, in which case return a String l
//ength 1 from its back. The String will be non-empty. 
//
//takeOne("Hello", true) -> "H"
//takeOne("Hello", false) -> "o"
//takeOne("oh", true) -> "o"
public class TakeOne {

    public String takeOne(String str, boolean fromFront) {
      if (str.isEmpty()) return null;
      if(fromFront) 
          return str.substring(0,1);
      return str.substring(str.length()-1);
    }
}
