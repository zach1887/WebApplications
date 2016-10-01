/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.FileIO;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesse
 */
public class VowelCapitalization {

    public static void main(String[] args) {
        ConsoleIO console = new ConsoleIO();

        String fileRequested = console.readString("Which file would you like to mangle?");
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(fileRequested)));

            while (sc.hasNextLine()) {
                String a = sc.nextLine().replaceAll("a", "A");
                String b = a.replaceAll("e", "E");
                String c = b.replaceAll("i", "I");
                String d = c.replaceAll("o", "O");
                String e = d.replaceAll("u", "U");

                console.print(e);
            }
        } catch (FileNotFoundException ex) {
            console.print("We could not find any files with that name.");
        }

    }

}
