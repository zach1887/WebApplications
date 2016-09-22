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
public class IsItTrue {
    public static void main(String[] args) {
        System.out.println("True and True yields " + howTrue(true, true) + ".");
        System.out.println("True and False yields " + howTrue(true, false)+ ".");
        System.out.println("False and True yields " + howTrue(false, true)+ ".");
        System.out.println("False and False yields " + howTrue(false, false)+ ".");
        
    }
    

public static String howTrue(boolean x, boolean y) {
String output;
if (x == true && y == true)
      output = "BOTH";
else if (x == false && y == false)
      output = "NEITHER";
else output = "EXACTLY ONE";
return output;
        
}

}
