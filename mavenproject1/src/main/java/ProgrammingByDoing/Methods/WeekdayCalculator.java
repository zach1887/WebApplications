/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingByDoing.Methods;

/**
 *
 * @author Jesse
 */
import java.util.Scanner;

public class WeekdayCalculator
{
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
		System.out.println(" 02 28 2000 => " + weekday(2,28,2000));
		System.out.println(" 02 29 2000 => " + weekday(2,29,2000));
		System.out.println(" 03  01 2000 => " + weekday(3,1,2000));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.println("No dates before 1900, please!");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();
                boolean invalidMonth, invalidDay, invalidYear;  
                invalidMonth = (mm < 1 || mm > 12);
                
                if((mm == 1 || mm ==3 || mm == 5 || mm == 7 || mm ==8 || mm == 10 || mm == 12) 
                        && (dd <0 || dd > 31)) invalidDay = true;
                else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11)
                        && (dd <0 || dd > 30)) invalidDay = true;
                else if (mm == 2 && is_leap(yyyy) && (dd < 0 || dd > 29))
                    invalidDay = true;
                else if  (mm == 2 && !is_leap(yyyy) && (dd < 0 || dd > 28)) 
                    invalidDay = true;
                else invalidDay = false;
                
                invalidYear = (yyyy < 1900 || yyyy > 2100);
                
                while (invalidMonth || invalidDay || invalidYear) {
                System.out.println("The date you entered is invalid:");
                System.out.print("Birth date (mm dd yyyy): ");
		mm = keyboard.nextInt();
		dd = keyboard.nextInt();
		yyyy = keyboard.nextInt();
               invalidMonth = (mm < 1 || mm > 12);
               if((mm == 1 || mm ==3 || mm == 5 || mm == 7 || mm ==8 || mm == 10 || mm == 12) 
                        && (dd <0 || dd > 31)) invalidDay = true;
                else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11)
                        && (dd <0 || dd > 30)) invalidDay = true;
                else if (mm == 2 && is_leap(yyyy) && (dd < 0 || dd > 29))
                    invalidDay = true;
                else if  (mm == 2 && !is_leap(yyyy) && (dd < 0 || dd > 28)) 
                    invalidDay = true;
                else invalidDay = false;
                
                invalidYear = (yyyy < 1900 || yyyy > 2100);
                }

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm, dd, yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int daysSince1900, shiftFromMonday;
                int numLeapDays = 0;
                String dayName;
                
                for (int i = 1900; i <= yyyy; i++) {
                    if (is_leap(i)) numLeapDays++;
            }
                
                if (is_leap(yyyy) && (mm == 1 || mm == 2)) numLeapDays--;
                
                daysSince1900 = 365*(yyyy - 1900) + MonthShift.month_shift(mm)
                                  + numLeapDays + dd - 1;
                
                shiftFromMonday = daysSince1900 % 7;
                
                switch (shiftFromMonday) {
                    case 0: dayName = "Monday"; break;
                    case 1: dayName = "Tuesday"; break;
                    case 2: dayName = "Wednesday"; break;
                    case 3: dayName = "Thursday"; break;
                    case 4: dayName = "Friday"; break;
                    case 5: dayName = "Saturday"; break;
                    case 6: dayName = "Sunday"; break;
                    default: dayName = "error"; break;
                }
                
		String date = "";


		date = dayName + "," + MonthName.month_name(mm) + ", " 
                         + dd + ", " + yyyy;

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
