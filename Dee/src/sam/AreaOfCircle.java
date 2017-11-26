package sam;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String agrs[])
	{
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	
	int A;
	
	A = (int) (3.14 * (r*r));
	System.out.println("Area of circle" + A);
	}
	
	

}
