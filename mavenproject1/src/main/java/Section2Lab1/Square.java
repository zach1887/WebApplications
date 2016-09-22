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
public class Square {
    public int sideLength, lowerLeftCornerX, lowerLeftCornerY;
    private int angleOfIncidence;
    private String colorOfSquare;
    
 //constructorA with two inputs
  public Square(int angleOfIncidence, String colorOfSquare) {
  this.angleOfIncidence = angleOfIncidence;
  this.colorOfSquare = colorOfSquare;
} 
  //constructorB with three inputs
  public Square(int sideLength, int angleOfIncidence, String colorOfSquare) {
  this.sideLength = sideLength;
  this.angleOfIncidence = angleOfIncidence;
  this.colorOfSquare = colorOfSquare;
} 
 //accessors - getter   
 public int getangleOfIncidence(){
     return this.angleOfIncidence;
 }

 public String getcolorOfSquare(){
     return this.colorOfSquare;
 }
 
 //mutators - setter
  public void setangleOfIncidence(int angle){
     this.angleOfIncidence = angle;
 }
  
}
