/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class BirthStones {
    public static void main(String[] args) {
        int birthMonthNumber;
        String birthMonth, birthStone;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("What month's birthstone would you like to know?");
        System.out.print("Enter in a value from 1 to 12 that corresponds to the month.");
        birthMonthNumber = sc.nextInt();
        
        if (birthMonthNumber ==1) {
        birthMonth = "January"; birthStone = "Garnet";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==2) {
        birthMonth = "February"; birthStone = "Amethyst";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==3) {
        birthMonth = "March"; birthStone = "Aquamarine";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==4) {
        birthMonth = "April"; birthStone = "Diamond";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==5) {
        birthMonth = "May"; birthStone = "Emerald";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==6) {
        birthMonth = "June"; birthStone = "Pearl";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==7) {
        birthMonth = "July"; birthStone = "Ruby";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==8) {
        birthMonth = "August"; birthStone = "Periodot";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==9) {
        birthMonth = "September"; birthStone = "Sapphire";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==10) {
        birthMonth = "October"; birthStone = "Opal";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==11) {
        birthMonth = "November"; birthStone = "Opal";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else if (birthMonthNumber ==12) {
        birthMonth = "December"; birthStone = "Turquoise";
        System.out.println(birthMonth + "'s birthstone is " + birthStone + ".");
        } else System.out.println("There seems to be mistake, " + birthMonthNumber
                                   + " doesn't match a month.");
            
        
        
        
    }
   
}
