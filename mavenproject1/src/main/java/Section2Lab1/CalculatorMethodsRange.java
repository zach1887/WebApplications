/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CalculatorMethodsRange {

    public static boolean is_out_of_range(double x, int min, int max) {
        boolean outOfRange;
        if (x < min || x > max) {
            outOfRange = true;
        } else {
            outOfRange = false;
        }
        return outOfRange;
    }

    public static boolean is_out_of_range(int x, int min, int max) {
        boolean outOfRange;
        if (x < min || x > max) {
            outOfRange = true;
        } else {
            outOfRange = false;
        }
        return outOfRange;
    }
    public static boolean is_out_of_range(float x, int min, int max) {
        boolean outOfRange;
        if (x < min || x > max) {
            outOfRange = true;
        } else {
            outOfRange = false;
        }
        return outOfRange;
    }
}
