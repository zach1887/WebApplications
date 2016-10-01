/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.FileIO;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class SumThreeNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new BufferedReader (new FileReader ("ThreeNums.txt")));
        ConsoleIO console = new ConsoleIO();
        int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        console.print(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
        
    }
    
}
