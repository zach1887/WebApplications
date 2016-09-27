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

    static Scanner sc = new Scanner(System.in);

    public void display_menu() {
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

    }

//        public static int getNum(String prompt) {
//
//        boolean invalidInput = true;
//        int num = -1;
//        do {
//
//            System.out.println(prompt);
//            String userInput = sc.nextLine();
//            try {
//                num = Integer.parseInt(userInput);
//                invalidInput = false;
//            } catch (NumberFormatException e) {
//                System.out.println("Incorrect input.  Please try again:");
//            }
//
//        } while (invalidInput);
//
//        return num;
//
//    }
    public static int getNum(String prompt) {
        boolean invalidInput = true;
        int num = -1;

        do {

            System.out.print(prompt);
            String userInput = sc.nextLine();
            try {
                num = Integer.parseInt(userInput);
                invalidInput = false;
            } catch (NumberFormatException e) {
                System.out.println("That selection is invalid.  Please try again.");
            }
        } while (invalidInput);

        return num;
    }

}
