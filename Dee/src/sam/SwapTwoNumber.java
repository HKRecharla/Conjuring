package sam;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String agrs[]){
		
		System.out.println("Enter Two Number");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int temp;
		
		System.out.println("Number before Swap :"  + num1 + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Number after Swapping : " + num1 + num2);
		
		
		
		
	}

}
