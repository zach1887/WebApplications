/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jesse
 */
public class WinLoseorDraw {
    
    public static char[][] create_blank_board () {
            char newboard [][] = new char[3][3];
                for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newboard[i][j] = ' ';
            }
        }
                return newboard;    
    }
    public static boolean[][] filled_spaces() {  // probably does not do anything since default values are false
            boolean filled[][] = new boolean[3][3];
                for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                filled[i][j] = false;
            }
        }
               return filled;    
    }
    
    
    public static int[] validate_first_choice () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play tic-tac toe!");
        System.out.println("Select a location for X, for example 0 0 would be the upper left corner.");
        System.out.println("No parentheses or non-numeric characters, please.");
        System.out.print("Your choice for X:  ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        int choice[] = new int[2];
        while (int1 < 0 || int1 > 2
                || int2 < 0 || int2 > 2) {
            System.out.println("Your selection is invalid.");
            System.out.println("Your choice:  ");
            int1 = sc.nextInt();
            int2 = sc.nextInt();
        }
        choice[0] = int1;
        choice[1] = int2;
        return choice;

    
}
    
    public static int[] validate_other_Xchoices(boolean[][] truthmatrix) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Your choice for X:  ");
                int int1 = sc.nextInt();
                int int2 = sc.nextInt();
                int choice[] = new int [2];
                while (int1 < 0 || int1 > 2
                        || int2 < 0 || int2 > 2
                        || truthmatrix[int1][int2] == true) {
                    System.out.println("Your selection is invalid.");
                    System.out.println("Your choice:  ");
                    int1 = sc.nextInt();
                    int2 = sc.nextInt();
                }
                choice[0] = int1;
                choice[1] = int2;
                return choice;
    }
    
        
    public static int[] validate_Ochoices(boolean[][] truthmatrix) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Your choice for O:  ");
                int int1 = sc.nextInt();
                int int2 = sc.nextInt();
                int choice[] = new int [2];
                while (int1 < 0 || int1 > 2
                        || int2 < 0 || int2 > 2
                        || truthmatrix[int1][int2] == true) {
                    System.out.println("Your selection is invalid.");
                    System.out.println("Your choice:  ");
                    int1 = sc.nextInt();
                    int2 = sc.nextInt();
                }
                choice[0] = int1;
                choice[1] = int2;
                return choice;        
    }
    
    public static String evaluate_board(char a, char b, char c, 
                                         char d, char e, char f,
                                         char g, char h, char i) {
        String Outcome;
        if ((a == 'X' && a == b && b == c)
            || (a == 'X' && a == d && d == g)
            || (a == 'X' && a == e && e == i)
            || (b == 'X' && b == e && e == h)
            || (c == 'X' && c == f && f == i)    
            || (c == 'X' && c == e && e == g)    
            || (d == 'X' && d == e && e == f)    
            || (g == 'X' && g == h && h == i))
            Outcome = "win";
        else if ((a == 'O' && a == b && b == c)
            || (a == 'O' && a == d && d == g)
            || (a == 'O' && a == e && e == i)
            || (b == 'O' && b == e && e == h)
            || (c == 'O' && c == f && f == i)    
            || (c == 'O' && c == e && e == g)    
            || (d == 'O' && d == e && e == f)    
            || (g == 'O' && g == h && h == i))
            Outcome = "loss";
        else Outcome = "draw";

        return Outcome;
}
    public static void print_board(char a, char b, char c, 
                                  char d, char e, char f,
                                  char g, char h, char i)  { 
        
    System.out.println("_" + " " + "_" + " " + "_" + " ");
    System.out.println(a + " " + b + " " + c );
    System.out.println(d + " " + e + " " + f);
    System.out.println(g + " " + h + " " + i);
        

    }
}
