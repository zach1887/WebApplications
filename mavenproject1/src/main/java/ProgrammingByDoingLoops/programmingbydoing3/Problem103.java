/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingbydoing3;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Problem103 {

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("01 01 2000 => " + weekday(1,1,2000));
		System.out.println("02 28 2000 => " + weekday(2,28,2000));
		System.out.println("02 29 2000 => " + weekday(2,29,2000));
		System.out.println("03 01 2000 => " + weekday(3,1,2000));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
                int daysSince1900;
                int numLeapYears = 0;
                String weekday = ""; 
                
                for (int i = 1900; i <= yyyy; i++) {
                if (Problem103.is_leap(i) == true)
                        numLeapYears++;
            }
                
           if (yyyy == 1900 && ((mm == 1 || mm == 2))) numLeapYears = 0;
           else if ((yyyy % 4 ==0) && (mm == 1 || mm == 2)) numLeapYears--;
             daysSince1900 = (yyyy-1900)*365 + numLeapYears + MonthShift.month_shift(mm) + dd; 
  
                               
               int remainder = (daysSince1900 % 7);
         
               switch (remainder) {
                   case 1:  weekday = "Monday"; break;  // Jan 1, 1900 was a Monday
                   case 2:  weekday = "Tuesday"; break;
                   case 3:  weekday = "Wednesday"; break;
                   case 4:  weekday = "Thursday"; break;
                   case 5:  weekday = "Friday"; break;
                   case 6:  weekday = "Saturday"; break;
                   case 0:  weekday = "Sunday"; break;
                   default: break;
               }       
       
		date = (weekday + "," + monthname.month_name(mm) + "," + dd + "," + yyyy) ;
                return date;
        }



	// paste your functions from MonthName, WeekdayName, and MonthOffset here
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}    
}
