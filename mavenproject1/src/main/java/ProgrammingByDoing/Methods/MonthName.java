/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Methods;

/**
 *
 * @author Jesse
 */
public class MonthName {
    public static String month_name (int x) {
        String month;
        switch (x) {
            case 1:  month = "January"; break;
            case 2:  month = "Febrary"; break;
            case 3:  month = "March"; break;
            case 4:  month = "April"; break;
            case 5:  month = "May"; break;
            case 6:  month = "June"; break;
            case 7:  month = "July"; break;
            case 8:  month = "August"; break;
            case 9:  month = "September"; break;
            case 10:  month = "October"; break;
            case 11:  month = "November"; break;
            case 12:  month = "December"; break;
            default: month= "error"; break;
            
        }
         return month;       
        
        
}
}
