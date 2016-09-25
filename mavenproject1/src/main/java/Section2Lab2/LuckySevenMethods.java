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
public class LuckySevenMethods {

    public static int validate_starting_amt() {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        while (start < 1 || start > 1e6) {

            if (start < 1) {
                System.out.println("You gotta have money to play.  Try again.");
                System.out.print("How many dollars you have?  Whole numbers, please.");
                start = sc.nextInt();
            }
            if (start > 1e6) //selection of one million is arbitrary
            {
                System.out.println("Number is too large.  Try again.");
                System.out.print("How many dollars you have?  Whole numbers, please.");
                start = sc.nextInt();
            }
        }
        return start;
    }

    public static int result_play_once() {
        int s;
        int outcome;
        Random rand = new Random();

        s = rand.nextInt(6) + rand.nextInt(6) + 2;
        if (s == 7) {
            outcome = 4;
        } else {
            outcome = -1;
        }
        return outcome;

    }

    public static int max_amt_update(int runAmt, int maxAmt) {

        if (runAmt > maxAmt) {
            return runAmt;
        } else {
            return maxAmt;
        }

    }

    public static int max_rolls_update(int runAmt, int prevMax, int maxRolls,
            int rolls) {

        if (runAmt > prevMax) {
            return rolls;
        } else {
            return maxRolls;
        }

    }
}
