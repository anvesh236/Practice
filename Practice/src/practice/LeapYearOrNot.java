package practice;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args)
	{
	
		int year = 2016;
		//if year is divisible by 4, it is a leap year
		if(year%4==0 && year%100!=0)
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not leap year");
		}
	}

}
