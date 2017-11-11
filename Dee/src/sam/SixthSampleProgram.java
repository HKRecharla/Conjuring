package sam;
import java.math.*;
import java.util.Scanner;


public class SixthSampleProgram
{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	
	//Generate Random Number
	System.out.println(Math.random()*10);
    
	//Convert Int to Float
	int i = 456;
	float b = (float)i;
	System.out.println(b);
	
	//convert double to int
	double d = 9.5;
	int id = (int)d;
	System.out.println(id);
	
	//Using If Condition(check whether number is even or odd)
	int sf = sc.nextInt();
	if(sf%2 ==  0)
	{
		System.out.println("even number");
	}
	
	
	//Using If Else Condition
	int sfe = sc.nextInt();
	if (sfe%2 == 0)
	{
		System.out.println("even number");
	}else
	{
		System.out.println("odd number");
	}
	

}

}
