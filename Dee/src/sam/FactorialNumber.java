package sam;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String args[])
	{
		int fact = 1, n,i;
		Scanner in = new Scanner(System.in);
		 
	      n = in.nextInt();
	    for(i = 1; i<= n; i++)
	      {
	      fact = fact*i;
	      System.out.println(fact);
	   
	      }
	   System.out.println(fact);   
	}

}
