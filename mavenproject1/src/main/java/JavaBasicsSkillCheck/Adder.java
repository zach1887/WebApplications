/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasicsSkillCheck;

/**
 *
 * @author apprentice
 */
public class Adder {
    public static void main(String[] args) {
        int numOne, numTwo, sumTwoValues;
       
        System.out.println("The sum of 1 and 1 is " + add(1,1));
        System.out.println("The sum of 2 and 3 is " + add(2,3));
        System.out.println("The sum of 5 and 8 is " + add(5,8));
        System.out.println("The sum of 95 and 42 is " + add(95,42));
        
        
    }
    
    public static int add(int x, int y){
    int sum;
    sum = x + y;
    return sum;
    
}
}
