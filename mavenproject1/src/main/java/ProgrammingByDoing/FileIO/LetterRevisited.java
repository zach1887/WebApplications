/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.FileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author Jesse
 */
public class LetterRevisited {
    public static void main(String[] args) throws IOException {
        
        PrintWriter writer = new PrintWriter(new FileWriter("letter.txt"));
        writer.println("+------------------------------------------------------_+");
        writer.println("|                                                   ### |");
        writer.println("|                                                   ### |");
        writer.println("|                                                   ### |");
        writer.println("|                                                       |");
        writer.println("|                          Bill Gates                   |");
        writer.println("|                          1 Microsoft Way              |");
        writer.println("|                          Redmond, WA 98052            |");
        writer.println("|                                                       |");
        writer.println("+-------------------------------------------------------|");
   
    writer.flush();
    writer.close();
    } 
    
}
