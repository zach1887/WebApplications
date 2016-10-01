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

/**
 *
 * @author Jesse
 */
public class DisplayingAFile {

    public static void main(String[] args) throws IOException {
        ConsoleIO console = new ConsoleIO();

        String newfile = console.readString("Open which file:  ");

        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(newfile)));

            while (sc.hasNext()) {
                console.print(sc.next());
            }

        } catch (FileNotFoundException e) {
            console.print("We could not locate any file with that name.");
        }

    }
}
