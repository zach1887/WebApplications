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
public class Counter {
    public static void main(String[] args) {
    toTen();
    toN(3);
    toN(8);
    toN(200);
    }
    
    public static void  toTen() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
        }
    }
    public static void  toN( int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
        }
    }
    
}
