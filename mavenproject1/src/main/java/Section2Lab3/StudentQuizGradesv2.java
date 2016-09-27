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
import java.util.ArrayList;

/**
 *
 * @author Jesse
 */
public class StudentQuizGradesv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userChoice, numScores, newScore;
        int k;
        double quiztotal;
        String studentName, newName, dropName, dropVerification;
        ConsoleIO console = new ConsoleIO();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String prompt = "Please enter a number from 1 to 7:";
 

        ArrayList<Integer> anneD = new ArrayList<>();
        anneD.add(19);
        anneD.add(20);
        anneD.add(12);
        anneD.add(15);
        anneD.add(18);
        ArrayList<Integer> bobT = new ArrayList<>();
        bobT.add(18);
        bobT.add(17);
        bobT.add(16);
        bobT.add(11);
        bobT.add(19);
        ArrayList<Integer> colinO = new ArrayList<>();
        colinO.add(15);
        colinO.add(16);
        colinO.add(8);
        colinO.add(17);
        colinO.add(14);
        ArrayList<Integer> deandraF = new ArrayList<>();
        deandraF.add(19);
        deandraF.add(20);
        deandraF.add(12);
        deandraF.add(15);
        deandraF.add(18);
        ArrayList<Integer> evelynS = new ArrayList<>();
        evelynS.add(20);
        evelynS.add(20);
        evelynS.add(18);
        evelynS.add(18);
        evelynS.add(19);
        ArrayList<Integer> frankA = new ArrayList<>();
        frankA.add(20);
        frankA.add(20);
        frankA.add(18);
        frankA.add(18);
        frankA.add(19);

//        quizScores anneD = new QuizScores(19, 20, 12, 15, 18);
//        quizScores bobT = new QuizScores(18, 17, 16, 11, 19);
//        quizScores colinO = new QuizScores(15, 16, 8, 17, 14);
//        QuizScores deandraF = new QuizScores(19, 20, 12, 15, 18);
//        QuizScores evelynS = new QuizScores(20, 20, 18, 18, 19);
//        QuizScores frankA = new QuizScores(17, 19, 11, 20, 14);
        HashMap<String, ArrayList<Integer>> quizGrades = new HashMap<>();

        quizGrades.put("Anne Davis", anneD);
        quizGrades.put("Bob Thompson", bobT);
        quizGrades.put("Colin O'Shea", colinO);
        quizGrades.put("Deandra Franklin", deandraF);
        quizGrades.put("Evelyn Stewart", evelynS);
        quizGrades.put("Frank Anderson", frankA);

        Set<String> studentNames = quizGrades.keySet();

        console.display_menu();
        userChoice = ConsoleIO.getNum(prompt);

        while (userChoice !=7){
            switch (userChoice) {
                case 1: {  // list all students
                    for (String student : studentNames) {
                        System.out.println(student);
                    }
                    console.display_menu();
                    userChoice = ConsoleIO.getNum(prompt);
                    break;
                }
                case 2: {  // search for one students score
                    System.out.print("Enter the full name of the student:");
                    studentName = sc.nextLine();

                    if (quizGrades.containsKey(studentName)) {
                        System.out.println(studentName);
                        quiztotal = 0.0;
                        numScores = quizGrades.get(studentName).size();
                        for (int i = 0; i < numScores; i++) {
                            System.out.println("Quiz " + (i + 1) + " score is " + quizGrades.get(studentName).get(i));
                            quiztotal += quizGrades.get(studentName).get(i);

                        }

                        System.out.println("Quiz Average for " + studentName + " is " + df.format(quiztotal / numScores));

                    } else {
                        System.out.println("We could not find + " + studentName);
                    }
                    console.display_menu();
                    userChoice = ConsoleIO.getNum(prompt);
                    break;

                }
                case 3: {  // output all grades
                    for (String student : studentNames) {
                        System.out.println(student);
                        quiztotal = 0.0;
                        numScores = quizGrades.get(student).size();
                        for (int i = 0; i < numScores; i++) {
                            System.out.println("Quiz " + (i + 1) + " score is " + quizGrades.get(student).get(i));
                            quiztotal += quizGrades.get(student).get(i);

                        }

                        System.out.println("Quiz Average for " + student + " is " + df.format(quiztotal / numScores));

                    }
                    console.display_menu();
                    userChoice = ConsoleIO.getNum(prompt);
                    break;

                }
                case 4: {  // list all Quiz Averages
                    System.out.println("Unavailable.");
                    console.display_menu();
                    userChoice = ConsoleIO.getNum(prompt);

                    break;

                }
                case 5: {  // add a student to the class
                    System.out.println("Enter the full name of the student:  ");
                    newName = sc.nextLine();
                    while (newName.equals("") || newName.isEmpty()) {
                        System.out.println("This is really, really, BAD!!!!");
                        System.out.println("Enter the full name of the student:  ");
                        newName = sc.nextLine();
                    }

                    if (quizGrades.containsKey(newName)) {
                        System.out.println("This student is already in the system.");
                        console.display_menu();
                        userChoice = ConsoleIO.getNum(prompt);
                        break;
                    } else {
                        k = 1;
                        ArrayList<Integer> temp = new ArrayList<>();
                        newScore = ConsoleIO.getNum("Enter a score for Quiz  " + k + " (0-20) or 99 to quit:");
                        while (newScore != 99) {
                            while (newScore < 0 || newScore > 20) {
                                System.out.println("Invalid score.");
                                newScore = ConsoleIO.getNum("Enter a score for Quiz  " + k + " (0-20) or 99 to quit:");
                            }
                            temp.add(newScore);
                            k++;
                            newScore = ConsoleIO.getNum("Enter a score for Quiz  " + k + " (0-20) or 99 to quit:");
                        }
                        quizGrades.put(newName, temp);
                        console.display_menu();
                        userChoice = ConsoleIO.getNum(prompt);
                        break;
                }
                }

                case 6: { // remove a student from the class
                    System.out.println("Enter the name of the student you would like to remove:");
                    dropName = sc.nextLine();
                    if (!quizGrades.containsKey(dropName)) {
                        System.out.println("There is no student with the name of " + dropName + " in this course.");
                        console.display_menu();
                        userChoice = ConsoleIO.getNum(prompt);
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
                            console.display_menu();
                            userChoice = ConsoleIO.getNum(prompt);
                            break;
                        } else if ((dropVerification.equals("y"))) {
                            quizGrades.remove(dropName);
                            System.out.println("The student " + dropName + " has been removed.");
//                            System.out.println(dropName + quizGrades.containsKey(dropName));
                            console.display_menu();
                            userChoice = ConsoleIO.getNum(prompt);
                            break;
                        }
                    }

                }

                default: {
                    System.out.println("Invalid selection, you MORON!!!!");
                    console.display_menu();
                    userChoice = ConsoleIO.getNum(prompt);
                    break;

                }
            }

        }
        System.out.println("You have exited the system.");

    }
}
