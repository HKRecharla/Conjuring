package sam;

public class ThreeSampleProgram 
{
public static void main(String args[])
{
	//Multiple of two number
	float f = 23, Mul;
	int i = 20;
	Mul = f*i;
	System.out.println("Multiplication of two number is " + Mul);
	
	//Subtraction of two number
	float fs = 234, sub;
	int is = 22;
	sub = fs-is;
	System.out.println("Subtraction of two number is " + sub);
	
	//Divide of two number
	float fd = 40, div;
	int id = 20;
	div = fd/id;
	System.out.println("Divide of two number is " + div);
	
	//Get char in string
	String S = "Arvind";
	char c = S.charAt(3);
	System.out.println("value of char in string is" + c);
	
	//Get position in String
	String SP = "Arvind";
	int position = SP.indexOf('v');
	System.out.println("position of char in string is "  + position);
	
	
	
}
}
