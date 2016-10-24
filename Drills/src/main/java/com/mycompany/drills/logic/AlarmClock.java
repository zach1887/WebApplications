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

//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
//and a booleanean indicating if we are on vacation, return a String 
//of the form "7:00" indicating when the alarm clock should ring. 
//Weekdays, the alarm should be "7:00" and on the weekend it should be 
//"10:00". Unless we are on vacation -- then on weekdays it should be "10:00" 
//and weekends it should be "off". 
//
//alarmClock(1, false) â†’ "7:00"
//alarmClock(5, false) â†’ "7:00"
//alarmClock(0, false) â†’ "10:00"


public class AlarmClock {
   public String alarmClock(int day, boolean vacation) {
     if (day >=1 && day <= 5) { 
         if (!vacation) return "7:00";
         return "10:00";
     }
     if (!vacation) return "10:00";
     return "off";
} 
}
