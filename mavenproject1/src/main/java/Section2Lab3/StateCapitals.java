/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab3;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author Jesse
 */
public class StateCapitals {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");
        capitals.put("California", "Sacramento");
        capitals.put("Colorado", "Denver");
        capitals.put("Connecticut", "Hartford");
        capitals.put("Delaware", "Dover");
        capitals.put("Florida", "Tallahassee");
        capitals.put("Georgia", "Atlanta"); //10 states
        capitals.put("Hawaii", "Honolulu");
        capitals.put("Idaho", "Boise");
        capitals.put("Illinois", "Springfield");
        capitals.put("Indiana", "Indianapolis");
        capitals.put("Iowa", "Des Moines");
        capitals.put("Kansas", "Topeka");
        capitals.put("Kentucky", "Frankfort");
        capitals.put("Louisiana", "Baton Rouge");
        capitals.put("Maine", "Augusta");
        capitals.put("Maryland", "Annapolis"); //20 states
        capitals.put("Massachusetts", "Boston");
        capitals.put("Michigan", "Lansing");
        capitals.put("Minnesota", "St Paul");
        capitals.put("Missisippi", "Jackson");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Montana", "Helena");
        capitals.put("Nebraska", "Lincoln");
        capitals.put("Nevada", "Carson City");
        capitals.put("New Hampshire", "Concord");
        capitals.put("New Jersey", "Trenton"); // 30 states
        capitals.put("New Mexico", "Santa Fe");
        capitals.put("New York", "Albany");
        capitals.put("North Carolina", "Raleigh");
        capitals.put("North Dakota", "Bismarck");
        capitals.put("Ohio","Columbus");
        capitals.put("Oklahoma","Oklahoma City");
        capitals.put("Oregon","Salem");
        capitals.put("Pennsylvania","Harrisburg");
        capitals.put("Rhode Island","Providence");
        capitals.put("South Carolina","Columbia"); // 40 states
        capitals.put("South Dakota","Pierre");
        capitals.put("Tennessee","Nashville");
        capitals.put("Texas","Austin");
        capitals.put("Utah","Salt Lake City");
        capitals.put("Vermont","Montpelier");
        capitals.put("Virginia","Richmond");
        capitals.put("Washington","Olympia");
        capitals.put("West Virginia","Charleston");
        capitals.put("Wisconsin","Madison");
        capitals.put("Wyoming","Cheyenne");
        
//        System.out.println(capitals.containsKey("Washington"));
//        System.out.println(capitals.containsValue("Albany"));
        
        Set<String> stateNames = capitals.keySet();
        
        for (String state : stateNames) {
            System.out.println(state);
        }
        for (String state : stateNames) {
            System.out.println(capitals.get(state));
        }
        for (String state : stateNames) {
            System.out.print(state + "  ");
            System.out.println(capitals.get(state));
        }
        
        
    }
}
