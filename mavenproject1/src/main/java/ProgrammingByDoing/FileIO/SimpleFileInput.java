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
public class SimpleFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new BufferedReader (new FileReader("name.txt")));
        ConsoleIO console = new ConsoleIO();
        String firstName = sc.next();
        String lastName = sc.next();
        
        console.print("Using my psychic powers and the information we have stored"
                + " I have determined that your name is " + firstName + " " + lastName +".");
        
        sc.close();
    }
    
}
