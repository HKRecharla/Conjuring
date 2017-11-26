package sam;

import java.util.Scanner;

public class ReverseNumber 
{ public static void main(String agrs[]){
	
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	
	int reversed = 0;
	
	while(num != 0){
		
		int value = num % 10;
		reversed = reversed *10 + value;
		num =num/10;
		System.out.println( reversed);
	}
	System.out.println("Reveresed number" + reversed);
}

}
