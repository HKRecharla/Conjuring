package sam;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String args[])
	{
		int i;
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		
		if(i/2 == 0)
		{
			System.out.println("Number is even");
				
		}else if(i/2 != 0)
		{
			System.out.println("Number is Odd");
			
		}else{
			System.out.println("Number is invalid");
		}
		
		
	}
}
