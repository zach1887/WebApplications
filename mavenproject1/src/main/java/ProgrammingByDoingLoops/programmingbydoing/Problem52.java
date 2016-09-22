/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.programmingbydoing;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class Problem52 {
 	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;
                final int MAX_TRIES = 8;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != pin && tries < MAX_TRIES )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}

		if ( entry == pin )
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if ( tries >= 3 )
			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
	}   
}
