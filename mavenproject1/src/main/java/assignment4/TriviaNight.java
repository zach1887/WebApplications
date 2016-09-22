/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class TriviaNight {
    public static void main(String[] args) {
        int answer1, answer2, answer3, answer4; 
        int numCorrect = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT!  Let's play!");
        System.out.println("");
        System.out.println("FIRST QUESTION");
        System.out.println("Who won the first Super Bowl?");
        System.out.println("1) Chicago Bears \t 2) New York Giants") ;
        System.out.println("3) Green Bay Packers \t 3) Los Angeles Rams") ;
        System.out.println("");
        System.out.print("YOUR ANSWER:");
        answer1 = sc.nextInt();
            if (answer1 < 1 || answer1 > 4){
            System.out.println("Invalid answer.  Try again, quickly.");
            System.out.print("YOUR ANSWER:");
            answer1 = sc.nextInt(); }
            if (answer1 == 3) {numCorrect++;}
        System.out.println("SECOND QUESTION");
        System.out.println("Who lost the first Super Bowl?");
        System.out.println("1) Pittsburgh Steelers \t 2) Oakland Raiders") ;
        System.out.println("3) Buffalo Bills \t 3) Kansas City Chiefs") ;
        System.out.println("");
        System.out.print("YOUR ANSWER:");
        answer1 = sc.nextInt();
            if (answer1 < 1 || answer1 > 4){
            System.out.println("Invalid answer.  Try again, quickly.");
            System.out.print("YOUR ANSWER:");
            answer1 = sc.nextInt(); }
            if (answer1 == 4) {numCorrect++;}
       System.out.println("THIRD QUESTION");
        System.out.println("Who won the second Super Bowl?");
        System.out.println("1) Chicago Bears \t 2) New York Giants") ;
        System.out.println("3) Green Bay Packers \t 3) Los Angeles Rams") ;
        System.out.println("");
        System.out.print("YOUR ANSWER:");
        answer1 = sc.nextInt();
            if (answer1 < 1 || answer1 > 4){
            System.out.println("Invalid answer.  Try again, quickly.");
            System.out.print("YOUR ANSWER:");
            answer1 = sc.nextInt(); }
            if (answer1 == 3) {numCorrect++;}         
        System.out.println("FOURTH (AND FINAL) QUESTION");
        System.out.println("Who lost the second Super Bowl?");
        System.out.println("1) Pittsburgh Steelers \t 2) Oakland Raiders") ;
        System.out.println("3) Buffalo Bills \t 3) Kansas City Chiefs") ;
        System.out.println("");
        System.out.print("YOUR ANSWER:");
        answer1 = sc.nextInt();
            if (answer1 < 1 || answer1 > 4){
            System.out.println("Invalid answer.  Try again, quickly.");
            System.out.print("YOUR ANSWER:");
            answer1 = sc.nextInt(); }
            if (answer1 == 2) {numCorrect++;}           
    
    
    if (numCorrect == 4) System.out.println("Congratulations, you got " + numCorrect + " correct.");
    else if (numCorrect > 0) System.out.println("You got " + numCorrect + " correct.");
    else  System.out.println("You got " + numCorrect + "correct.  Not a football fan, huh?");  
    }
}