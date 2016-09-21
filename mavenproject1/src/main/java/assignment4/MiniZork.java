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
public class MiniZork {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("You are the coach of a football team.");
        System.out.println("Your team has a second-and-goal from the five");
        System.out.print("Do you call a run (run) or a pass(pass)?");
        String action = userInput.nextLine();
       
        if (action.equals("run")){
            System.out.println("The run goes for two yards.  It is now third and 3.");
            System.out.print("Do you call a run (run) or a pass (pass)?"); 
            action = userInput.nextLine();
            
            if(action.equals("run")){
                System.out.println("The runner is stuffed.  It is now fourth and 3.");
                System.out.print("Will you (go) for it or kick a field goal(fg)?");
                action = userInput.nextLine();
                
                if(action.equals("go"))
                System.out.println("Touchdown!  You kick the PAT and are now up 7-0.");
                else if (action.equals("fg"))
                System.out.println("The kick is good.  Your team is up 3-0.");}
                
            else if(action.equals("pass")){
                System.out.println("Touchdown!");
                System.out.print("Will you (go) for two or kick a PAT (kick)?");
                action = userInput.nextLine();
                
                if(action.equals("go"))
                System.out.println("The conversion attempt fails.  You are now up 6-0.");
                else if (action.equals("kick"))
                System.out.println("The kick is good.  Your team is up 7-0.");}
                                        }
//
//    }
        else if (action.equals("pass")){
            System.out.println("The pass is incomplete.  It is now third and 5.");
            System.out.println("Do you call a run(run) or a pass?(pass)"); 
            action = userInput.nextLine();
            
            if(action.equals("run")){
                System.out.println("Touchdown!");
                System.out.print("Will you (go) for two or kick a PAT(kick)?");
                action = userInput.nextLine();
                
                if(action.equals("go"))
                System.out.println("The conversion is good.  You are now up 8-0.");
                else if (action.equals("kick"))
                System.out.println("The kick is good.  Your team is up 7-0.");}
                
            else if(action.equals("pass")){
                System.out.println("The pass is incomplete.  It is now fourth and 5.");
                System.out.print("Will you go for it(go) or kick a field goal (fg)?");
                action = userInput.nextLine();
                
                if(action.equals("go"))
                System.out.println("The pass is incomplete.  You turn the ball over on downs.");
                else if (action.equals("fg"))
                System.out.println("The kick is good.  Your team is up 3-0.");}

                                     }
            }
            
        }

