/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab3;

import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class ConsoleIO {

    public int display_validate_menu() {
        int userChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz score database retreival.");
        System.out.println("Select from the options below.");
        System.out.println("List all students (1).");
        System.out.println("List all scores for one student (2).");
        System.out.println("List all scores for all students (3).");
        System.out.println("List all quiz averages(4).");
        System.out.println("Administrative Options.");
        System.out.println("Add a student(5).");
        System.out.println("Remove a student(6).");
        System.out.println("Exit system (7).");
        System.out.print("Your selection:");
        userChoice = sc.nextInt();
        while (userChoice < 1 || userChoice > 7) {
            System.out.println("Your selection is invaliid");
            System.out.print("Your selection:");
            userChoice = sc.nextInt();
        }

        return userChoice;
    }
}
