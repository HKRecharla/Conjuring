package sam;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String agrs[])
	{
		
		    int c=0,a,temp;  
		   // int n=153;//It is the number to check armstrong  
		    Scanner sc = new Scanner(System.in);
		   int n= sc.nextInt();
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");   
		   }  
	

}
