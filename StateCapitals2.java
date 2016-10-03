/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Section2Lab3;

import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author Jesse
 */
public class StateCapitals2 {

    public static void main(String[] args) {

        CapitalInfo al = new CapitalInfo("Montgomery", 205000, 155.4);
        CapitalInfo ak = new CapitalInfo("Juneau", 31000, 2716.7);
        CapitalInfo az = new CapitalInfo("Phoenix", 1445000, 474.9);
        CapitalInfo ar = new CapitalInfo("Little Rock", 193000, 116.2);
        CapitalInfo ca = new CapitalInfo("Sacramento", 466000, 97.2);
        CapitalInfo co = new CapitalInfo("Denver", 600000, 153.4);
        CapitalInfo ct = new CapitalInfo("Hartford", 124000, 17.3);
        CapitalInfo de = new CapitalInfo("Dover", 36000, 22.4);
        CapitalInfo fl = new CapitalInfo("Tallahassee", 181000, 95.7);
        CapitalInfo ga = new CapitalInfo("Atlanta", 420000, 131.7);  // 10 states
        CapitalInfo hi = new CapitalInfo("Honolulu", 337000, 85.7);
        CapitalInfo id = new CapitalInfo("Springfield", 205000, 63.8);
        CapitalInfo il = new CapitalInfo("Springfield", 116000, 54.0);
        CapitalInfo in = new CapitalInfo("Indianapolis", 829000, 361.5);
        CapitalInfo ia = new CapitalInfo("Des Moines", 203000, 75.8);
        CapitalInfo ks = new CapitalInfo("Topeka", 127000, 56.0);
        CapitalInfo ky = new CapitalInfo("Frankfort", 25000, 14.7);
        CapitalInfo la = new CapitalInfo("Baton Rouge", 229000, 76.8);
        CapitalInfo me = new CapitalInfo("Augusta", 19000, 55.4);
        CapitalInfo md = new CapitalInfo("Annapolis", 38000, 6.7);  // 20 states 
        CapitalInfo ma = new CapitalInfo("Massachusetts", 617000, 48.4);
        CapitalInfo mi = new CapitalInfo("Lansing", 1140000, 35.0);
        CapitalInfo mn = new CapitalInfo("St Paul", 285000, 52.8);
        CapitalInfo ms = new CapitalInfo("Jackson", 173000, 104.9);
        CapitalInfo mo = new CapitalInfo("Jefferson City", 43000, 27.3);
        CapitalInfo mt = new CapitalInfo("Helena", 28000, 14.0);
        CapitalInfo ne = new CapitalInfo("Lincoln", 3258000, 74.6);
        CapitalInfo nv = new CapitalInfo("Carson City", 55000, 143.4);
        CapitalInfo nh = new CapitalInfo("Concord", 42000, 64.3);
        CapitalInfo nj = new CapitalInfo("Trenton", 84000, 6.7);  // 30 states  
        CapitalInfo nm = new CapitalInfo("Santa Fe", 75000, 37.3);
        CapitalInfo ny = new CapitalInfo("Albany", 97000, 21.4);
        CapitalInfo nc = new CapitalInfo("Raleigh", 403000, 114.6);
        CapitalInfo nd = new CapitalInfo("Bismarck", 61000, 26.9);
        CapitalInfo oh = new CapitalInfo("Columbus", 822000, 210.3);
        CapitalInfo ok = new CapitalInfo("Oklahoma City", 580000, 607.0);
        CapitalInfo or = new CapitalInfo("Salem", 154000, 45.7);
        CapitalInfo pa = new CapitalInfo("Harrisburg", 49000, 8.1);
        CapitalInfo ri = new CapitalInfo("Providence", 178000, 18.5);
        CapitalInfo sc = new CapitalInfo("Columbia", 131000, 125.2); //40 states
        CapitalInfo sd = new CapitalInfo("Pierre", 13000, 13.0);
        CapitalInfo tn = new CapitalInfo("Nashville", 635000, 473.3);
        CapitalInfo tx = new CapitalInfo("Austin", 790000, 251.5);
        CapitalInfo ut = new CapitalInfo("Salt Lake City", 186000, 109.1);
        CapitalInfo vt = new CapitalInfo("Montpelier", 7000, 10.2);
        CapitalInfo va = new CapitalInfo("Richmond", 204000, 60.1);
        CapitalInfo wa = new CapitalInfo("Olympia", 46000, 16.7);
        CapitalInfo wv = new CapitalInfo("Charleston", 51000, 31.6);
        CapitalInfo wi = new CapitalInfo("Madison", 233000, 68.7);
        CapitalInfo wy = new CapitalInfo("Cheyenne", 59000, 21.1);

        HashMap<String, CapitalInfo> capitals = new HashMap<>();
        capitals.put("Alabama", al);
        capitals.put("Alaska", ak);
        capitals.put("Arizona", az);
        capitals.put("Arkansas", ar);
        capitals.put("California", ca);
        capitals.put("Colorado", co);
        capitals.put("Connecticut", ct);
        capitals.put("Delaware", de);
        capitals.put("Florida", fl);
        capitals.put("Georgia", ga); //10 states
        capitals.put("Hawaii", hi);
        capitals.put("Idaho", id);
        capitals.put("Illinois", il);
        capitals.put("Indiana", in);
        capitals.put("Iowa", ia);
        capitals.put("Kansas", ks);
        capitals.put("Kentucky", ky);
        capitals.put("Louisiana", la);
        capitals.put("Maine", me);
        capitals.put("Maryland", md); //20 states
        capitals.put("Massachusetts", ma);
        capitals.put("Michigan", mi);
        capitals.put("Minnesota", mn);
        capitals.put("Missisippi", ms);
        capitals.put("Missouri", mo);
        capitals.put("Montana", mt);
        capitals.put("Nebraska", ne);
        capitals.put("Nevada", nv);
        capitals.put("New Hampshire", nh);
        capitals.put("New Jersey", nj); // 30 states
        capitals.put("New Mexico", nm);
        capitals.put("New York", ny);
        capitals.put("North Carolina", nc);
        capitals.put("North Dakota", nd);
        capitals.put("Ohio", oh);
        capitals.put("Oklahoma", ok);
        capitals.put("Oregon", or);
        capitals.put("Pennsylvania", pa);
        capitals.put("Rhode Island", ri);
        capitals.put("South Carolina", sc); // 40 states
        capitals.put("South Dakota", sd);
        capitals.put("Tennessee", tn);
        capitals.put("Texas", tx);
        capitals.put("Utah", ut);
        capitals.put("Vermont", vt);
        capitals.put("Virginia", va);
        capitals.put("Washington", wa);
        capitals.put("West Virginia", wv);
        capitals.put("Wisconsin", wi);
        capitals.put("Wyoming", wy);

        Set<String> stateNames = capitals.keySet();

        for (String state : stateNames) {
            System.out.print(state + " - ");
            System.out.print(capitals.get(state).capitalName + " | ");
            System.out.print("Pop: " + capitals.get(state).populationSize + " | ");
            System.out.println("Area: " + capitals.get(state).capitalArea);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Select a lower limit for population of sate capitals:  ");
        int lowerLimit = scan.nextInt();

        for (String state : stateNames) {
            if (capitals.get(state).populationSize >= lowerLimit) {
                System.out.print(state + " - ");
                System.out.print(capitals.get(state).capitalName + " | ");
                System.out.print("Pop: " + capitals.get(state).populationSize + " | ");
                System.out.println("Area: " + capitals.get(state).capitalArea);
            }
        }
    }
}
