package sam;

import java.util.Scanner;

public class FactorialRecursion 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	 
	int factorial = fact(num);
	System.out.println("Factorial Entered number is " + factorial);
}

static int fact(int n)
{
	int output;
	if(n == 1)
	{
		return 1;
		}
	output = fact(n-1) * n;
	return output;
	
}





}
