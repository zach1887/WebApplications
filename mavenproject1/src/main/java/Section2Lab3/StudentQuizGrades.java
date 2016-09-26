/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab3;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Jesse
 */
public class StudentQuizGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userChoice, numScores;
        int newScore1, newScore2, newScore3, newScore4, newScore5;
        double q1, q2, q3, q4, q5, total;
        String studentName, newName, dropName, dropVerification;
        ConsoleIO console = new ConsoleIO();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        QuizScores anneD = new QuizScores(19, 20, 12, 15, 18);
        QuizScores bobT = new QuizScores(18, 17, 16, 11, 19);
        QuizScores colinO = new QuizScores(15, 16, 8, 17, 14);
        QuizScores deandraF = new QuizScores(19, 20, 12, 15, 18);
        QuizScores evelynS = new QuizScores(20, 20, 18, 18, 19);
        QuizScores frankA = new QuizScores(17, 19, 11, 20, 14);
        
        HashMap<String, QuizScores> quizGrades = new HashMap<>();
        
        quizGrades.put("Anne Davis", anneD);
        quizGrades.put("Bob Thompson", bobT);
        quizGrades.put("Colin O'Shea", colinO);
        quizGrades.put("Deandra Franklin", deandraF);
        quizGrades.put("Evelyn Stewart", evelynS);
        quizGrades.put("Frank Anderson", frankA);
        
        Set<String> studentNames = quizGrades.keySet();
        
        userChoice = console.display_validate_menu();
        
        while (userChoice >= 1 && userChoice <= 6) {
            switch (userChoice) {
                case 1: {  // list all students
                    for (String student : studentNames) {
                        System.out.println(student);
                    }
                    userChoice = console.display_validate_menu();
                    break;
                }
                case 2: {  // search for one students score
                    System.out.print("Enter the full name of the student:");
                    studentName = sc.nextLine();
                    
                    if (quizGrades.containsKey(studentName)) {
                        System.out.println(studentName);
                        q1 = quizGrades.get(studentName).getQuiz1Score();
                        q2 = quizGrades.get(studentName).getQuiz2Score();
                        q3 = quizGrades.get(studentName).getQuiz3Score();
                        q4 = quizGrades.get(studentName).getQuiz4Score();
                        q5 = quizGrades.get(studentName).getQuiz5Score();
                     
                        System.out.println("Quiz 1 = " + q1);
                        System.out.println("Quiz 2 = " + q2);
                        System.out.println("Quiz 3 = " + q3);
                        System.out.println("Quiz 4 = " + q4);
                        System.out.println("Quiz 5 = " + q5);
                        System.out.println("Quiz Average = " + df.format((q1 + q2 + q3 + q4 + q5)/5));
                        
                    } else {
                        System.out.println("We could not find + " + studentName);
                    }
                    userChoice = console.display_validate_menu();
                    break;
                    
                }
                case 3: {  // output all grades
                    for (String student : studentNames) {
                        System.out.println(student);
                        q1 = quizGrades.get(student).getQuiz1Score();
                        q2 = quizGrades.get(student).getQuiz2Score();
                        q3 = quizGrades.get(student).getQuiz3Score();
                        q4 = quizGrades.get(student).getQuiz4Score();
                        q5 = quizGrades.get(student).getQuiz5Score();
                        
                        System.out.print("Quiz 1 = " + q1);
                        System.out.print("  Quiz 2 = " + q2);
                        System.out.print("  Quiz 3 = " + q3);
                        System.out.print("  Quiz 4 = " + q4);
                        System.out.println("  Quiz 5 = " + q5);
                        System.out.println("Quiz Average = " + df.format((q1 + q2 + q3 + q4 + q5)/5));
                        
                    }
                    userChoice = console.display_validate_menu();
                    break;
                    
                }
                case 4: {  // list all Quiz Averages
                    total = 0.0;
                    numScores = 0;
                    for (String student : studentNames) {
                        total += quizGrades.get(student).getQuiz1Score();
                        if (quizGrades.get(student).getQuiz1Score() > 0) {
                            numScores++;
                        }
                    }
                    System.out.println("Quiz 1 Average: " + df.format(total / numScores));
                    System.out.println("Quiz 1 Count: " + numScores);
                    total = 0.0;
                    numScores = 0;
                    for (String student : studentNames) {
                        total += quizGrades.get(student).getQuiz2Score();
                        if (quizGrades.get(student).getQuiz2Score() > 0) {
                            numScores++;
                        }
                    }
                    System.out.println("Quiz 2 Average: " + df.format(total / numScores));
                    System.out.println("Quiz 2 Count: " + numScores);
                    total = 0.0;
                    numScores = 0;
                    for (String student : studentNames) {
                        total += quizGrades.get(student).getQuiz3Score();
                        if (quizGrades.get(student).getQuiz3Score() > 0) {
                            numScores++;
                        }
                    }
                    System.out.println("Quiz 3 Average: " + df.format(total / numScores));
                    System.out.println("Quiz 3 Count: " + numScores);
                    total = 0.0;
                    numScores = 0;
                    for (String student : studentNames) {
                        total += quizGrades.get(student).getQuiz4Score();
                        if (quizGrades.get(student).getQuiz4Score() > 0) {
                            numScores++;
                        }
                    }
                    System.out.println("Quiz 4 Average: " + df.format(total / numScores));
                    System.out.println("Quiz 4 Count: " + numScores);
                    total = 0.0;
                    numScores = 0;
                    for (String student : studentNames) {
                        total += quizGrades.get(student).getQuiz5Score();
                        if (quizGrades.get(student).getQuiz5Score() > 0) {
                            numScores++;
                        }
                    }
                    System.out.println("Quiz 5 Average: " + df.format(total / numScores));
                    System.out.println("Quiz 5 Count: " + numScores);
                    userChoice = console.display_validate_menu();
                    break;
                    
                }
                case 5: {  // add a student to the class
                    System.out.println("Enter the full name of the student:  ");
                    newName = sc.nextLine();
                    if (quizGrades.containsKey(newName)) {
                        System.out.println("This student is already in the system.");
                        userChoice = console.display_validate_menu();
                        break;
                    }
//                    System.out.println("Enter the first name and first letter of last name:");
//                    newKey = sc.nextLine();

                    System.out.println("Enter a score for Quiz 1 (0-20): ");
                    newScore1 = sc.nextInt();
                    while (newScore1 < 0 || newScore1 > 20) {
                        System.out.println("Please enter a valid score for Quiz 1");
                        System.out.println("Enter a score for Quiz 1 (0-20): ");
                        newScore1 = sc.nextInt();
                    }
                    System.out.println("Enter a score for Quiz 2 (0-20): ");
                    newScore2 = sc.nextInt();
                    while (newScore2 < 0 || newScore2 > 20) {
                        System.out.println("Please enter a valid score for Quiz 2");
                        System.out.println("Enter a score for Quiz 2 (0-20): ");
                        newScore2 = sc.nextInt();
                    }
                    System.out.println("Enter a score for Quiz 3 (0-20): ");
                    newScore3 = sc.nextInt();
                    while (newScore3 < 0 || newScore3 > 20) {
                        System.out.println("Please enter a valid score for Quiz 3");
                        System.out.println("Enter a score for Quiz 3 (0-20): ");
                        newScore3 = sc.nextInt();
                    }
                    System.out.println("Enter a score for Quiz 4 ((0-20): ");
                    newScore4 = sc.nextInt();
                    while (newScore4 < 0 || newScore4 > 20) {
                        System.out.println("Please enter a valid score for Quiz 4");
                        System.out.println("Enter a score for Quiz 4 (0-20): ");
                        newScore4 = sc.nextInt();
                    }
                    
                    System.out.println("Enter a score for Quiz 5 (0-20");
                    newScore5 = sc.nextInt();
                    while (newScore5 < 0 || newScore5 > 20) {
                        System.out.println("Please enter a valid score for Quiz 5");
                        System.out.println("Enter a score for Quiz 5 (0-20): ");
                        newScore5 = sc.nextInt();
                    }
                    QuizScores newStudent = new QuizScores(newScore1, newScore2, newScore3,
                            newScore4, newScore5);
                    
                    quizGrades.put(newName, newStudent);
                    userChoice = console.display_validate_menu();
                    break;
                }
                case 6: { // remove a student from the class
                    System.out.println("Enter the name of the student you would like to remove:");
                    dropName = sc.nextLine();
                    if (!quizGrades.containsKey(dropName)) {
                        System.out.println("There is no student with the name of " + dropName + " in this course.");
                        userChoice = console.display_validate_menu();
                        break;
                    } else {
                        System.out.println("The student " + dropName + " is in this course.");
                        System.out.println("Are you sure you want to remove this student (y/n)?");
                        dropVerification = sc.nextLine();
                        while (!dropVerification.equals("y") && !dropVerification.equals("n")) {
                            System.out.println("Not a valid selection.");
                            System.out.println("Are you sure you want to remove this student (y/n)?");
                            dropVerification = sc.nextLine();
                        }
                        if (dropVerification.equals("n")) {
                            userChoice = console.display_validate_menu();
                            break;                            
                        } else if ((dropVerification.equals("y"))) {
                            quizGrades.remove(dropName);
                            System.out.println("The student " + dropName + " has been removed.");
                            System.out.println(dropName + quizGrades.containsKey(dropName));
                            userChoice = console.display_validate_menu();
                            break;
                        }
                    }
                
                }
        
    

default: {
                    userChoice = console.display_validate_menu();
                    break;
           
        }
            }
    }
        System.out.println("You have exited the system.");
}
    }
