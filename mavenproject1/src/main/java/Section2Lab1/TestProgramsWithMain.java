/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab1;

/**
 *
 * @author apprentice
 */
public class TestProgramsWithMain {
    
    public static void main(String[] args) {
    // Constructor A is called
        Square sq = new Square(84, "blue");
        sq.sideLength= 10;
        sq.lowerLeftCornerX = 5;
        sq.lowerLeftCornerY = 6;
        
        System.out.println("My " + sq.getcolorOfSquare() + " square " 
                            + "starts at " + "(" + sq.lowerLeftCornerX + " ,"
                            + sq.lowerLeftCornerY + ")" + " and has a side length of " 
                            + sq.sideLength + "and tilted at an angle of " + sq.getangleOfIncidence() + " degrees.");
     //Constructor B is called   
        Square sq2 = new Square(12, 45,"red");
        
                System.out.println("My " + sq2.getcolorOfSquare() + " square " 
                            + "starts at " + "(" + sq2.lowerLeftCornerX + " ,"
                            + sq2.lowerLeftCornerY + ")" + " and has a side length of " 
                            + sq2.sideLength + "and tilted at an angle of " + sq2.getangleOfIncidence() + " degrees.");
        
    }
}
