/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Arrays;

/**
 *
 * @author Jesse
 */
public class WinLoseorDraw {
    
    public static String evaluate_board(char a, char b, char c, 
                                         char d, char e, char f,
                                         char g, char h, char i) {
        int result = 0;
        String Outcome;
        if ((a == 'X' && a == b && b == c)
            || (a == 'X' && a == d && d == g)
            || (a == 'X' && a == e && e == i)
            || (b == 'X' && b == e && e == h)
            || (c == 'X' && c == f && f == i)    
            || (c == 'X' && c == e && e == g)    
            || (d == 'X' && d == e && e == f)    
            || (g == 'X' && g == h && h == i))
            result +=10;
        else if ((a == 'O' && a == b && b == c)
            || (a == 'O' && a == d && d == g)
            || (a == 'O' && a == e && e == i)
            || (b == 'O' && b == e && e == h)
            || (c == 'O' && c == f && f == i)    
            || (c == 'O' && c == e && e == g)    
            || (d == 'O' && d == e && e == f)    
            || (g == 'O' && g == h && h == i))
            result +=1;
        if (result == 11) Outcome = "Both players got tic-tac-toe?";
        else if (result == 10) Outcome = "Nice work. X won!";
        else if (result == 1) Outcome = "Really, the O's won?  That's not very common.";
        else Outcome = "Draw... the most likely outcome.";
        return Outcome;
}
}
