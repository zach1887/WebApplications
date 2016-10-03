/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.lab3;
/**
 *
 * @author apprentice
 */
public class QuizGradeMethods {
    
    ConsoleIO console = new ConsoleIO();
    
    public int display_menu(){
        console.print("Student Quiz Grades Menu:");
        console.print("(1) List all students.");
        console.print("(2) Search by student name.");
        console.print("(3) List all student grades..");
        console.print("(4) Display quiz averages.");
        console.print("(5) Add student to class roster.");
        console.print("(6) Remove student from roster.");
        console.print("(7) Exit System.");
        int userChoice = console.readInt("Your selection:  ",1,7);
        return userChoice;
        
    }
    
}
