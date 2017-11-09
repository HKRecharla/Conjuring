package sam;

import java.util.Scanner;

public class FourthDaySampleProgram {
	
	public static void main(String agrs[])
	{
		//lengtth of string
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		int  len = str.length();
		System.out.println( "length of string "+len );
		
		//substring from given string
		System.out.println(str.substring(2, 5));
		
		//First char of String
		System.out.println(str.charAt(0));
		
		//Last char of string
		System.out.println(str.charAt(str.length() - 1));
		
		//size of int
		 System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
		
		
		
		
	}


}
