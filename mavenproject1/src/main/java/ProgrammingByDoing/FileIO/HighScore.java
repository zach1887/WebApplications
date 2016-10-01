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

/**
 *
 * @author Jesse
 */
public class HighScore {
    public static void main(String[] args) throws IOException {
       
        ConsoleIO console = new ConsoleIO();
        console.print("You got a high score!");
        int highScore = console.readInt("Please enter your score(whole numbers only):  ");
        String userName = console.readString("Please enter your name:  ");
        
        PrintWriter writer = new PrintWriter(new FileWriter("score.txt"));
        
        writer.println(userName + "  " + highScore);
        writer.flush();
        writer.close();
        console.print("Your infomation has been saved in score.txt.");
        
        
    }
    
}
