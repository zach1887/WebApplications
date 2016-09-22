/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingbydoing3;

/**
 *
 * @author apprentice
 */
public class MonthShift {
       public static int month_shift (int x) {
        int shift; 
        
        switch (x) {
            case 1: shift = 0; break;
            case 2: shift = 31; break;
            case 3: shift = 59; break;
            case 4: shift = 90; break;
            case 5: shift = 120; break;
            case 6: shift = 151; break;
            case 7: shift = 181; break;
            case 8: shift = 212; break;
            case 9: shift = 243; break;
            case 10: shift = 273; break;
            case 11: shift = 304; break;
            case 12: shift = 334; break;

            default: shift = 999; break;
        }
        return shift;
        }
} 

