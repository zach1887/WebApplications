/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class LuckySevens {
    public static void main(String[] args) {
        int rolls = 0; 
        int maxRolls = 0;  // this value may stay 0 if the initial value is never exceeded.
        int startingAmt;
        int s;  //placeholder for the sum of the two dice each roll
        LuckySevenMethods lsm = new LuckySevenMethods();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many dollars you have?  Whole numbers, please.");
        startingAmt = lsm.validate_starting_amt();
      
        int maxAmt = startingAmt;
        int runAmt = startingAmt;
        
       do { 
           rolls++;
     
           runAmt += lsm.result_play_once();
           int temp1 = maxAmt;
           maxAmt = lsm.max_amt_update(runAmt, temp1);
           int temp2 = maxRolls;
           maxRolls = lsm.max_rolls_update(runAmt, temp1, temp2, rolls);
       }
            while (runAmt >=1);
        
        System.out.println("");
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("");
        System.out.println("You should have quit after " + maxRolls + " rolls "
                             + "when you had $" + maxAmt + ".");
    }
}
