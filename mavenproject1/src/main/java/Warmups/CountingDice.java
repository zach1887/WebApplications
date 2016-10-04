/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmups;

import java.util.Random;
import java.text.DecimalFormat;

/**
 *
 * @author apprentice
 */
public class CountingDice {

    public static void main(String[] args) {

        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("#.00");

        int NUM_SIDES = 20;
        int[] ctSum = new int[2 * NUM_SIDES - 1];
        int sumRolls;
        double propRoll;
        for (int i = 1; i <= 50; i++) {
            sumRolls = rand.nextInt(NUM_SIDES) + rand.nextInt(NUM_SIDES) + 2;

            for (int j = 2; j <= 2 * NUM_SIDES; j++) {
                if (sumRolls == j) {
                    ctSum[j - 2]++;

                }
            }

        }
        for (int k = 2; k <= 2 * NUM_SIDES; k++) {
            propRoll = ctSum[k - 2] / 50.0;
            System.out.println("Sum: " + k + " Count:" + ctSum[k - 2] + "  Proportion:  " + propRoll);
        }
        for (int l = 2; l <= 2 * NUM_SIDES; l++) {
            if (ctSum[l-2] == 0){
            System.out.println(l + "\t ");
        }
            else if (ctSum[l - 2] != 0) {
                System.out.print(l + "\t");
                for (int m = 0; m < ctSum[l - 2]; m++) {
                    System.out.print("X");
                }
                System.out.println("");
            }
        }

    }

}
