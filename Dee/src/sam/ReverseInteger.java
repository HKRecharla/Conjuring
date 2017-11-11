package sam;

import java.util.Scanner;

public class ReverseInteger 
{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int si = sc.nextInt();
	/*StringBuffer a=new StringBuffer(String.valueOf(si));
System.out.println(a.reverse());*/
	String s=String.valueOf(si);
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i));
	}
	
	

	}
	
	
	}
 

