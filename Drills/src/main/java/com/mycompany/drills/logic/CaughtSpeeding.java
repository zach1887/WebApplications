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
//You are driving a little too fast, and a police officer stops you. Write code 
//to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 
//2=big ticket. If speed is 60 or less, the result is 0. If speed is between 
//61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
//Unless it is your birthday -- on that day, your speed can be 5 higher in all cases. 
//
//caughtSpeeding(60, false) â†’ 0
//caughtSpeeding(65, false) â†’ 1
//caughtSpeeding(65, true) â†’ 0

public class CaughtSpeeding {
  public int caughtSpeeding(int speed, boolean isBirthday) {
      if(speed > 85) 
          return 2;
      if (speed >80 && !isBirthday)
          return 2;
      if (speed >65)
          return 1;
      if (speed > 60 && !isBirthday)
          return 1;
      return 0;
}
  
}
