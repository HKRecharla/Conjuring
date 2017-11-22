import java.util.Scanner;

public class MaxThreeNumber 
{ 
	public static void main(String agrs[])
	{
		System.out.println("Enter three Numbers");
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
if(num1 > num2 && num1> num3)
{
	System.out.println("Num1 is maxium :" + num1);
	
}else if(num2 > num1 && num2 > num3)
{System.out.println("Num 2 is maxium : "+ num2);
}else if(num3> num1 && num3 > num2)
{ 
	System.out.println("Num 3 is max : " + num3);
}
else{
	System.out.println("Number is noy valid");
}
		
		
	}

}
