package sam;

public class FifthSampleProgram 
{
public static void main(String agrs[])
{
	//replace char in string
	String s1="java";  
	String replaceString=s1.replace('a','e'); 
	System.out.println(replaceString); 
	
	//replace all string 
	String s="arvindinternetlimited";  
	String replaceallString=s.replaceAll("i","e");//replaces all occurrences of "a" to "e"  
	System.out.println(replaceallString); 
	
	//int to string
	int number = 782;
	String numberAsString = Integer.toString(number);
	System.out.println(numberAsString);
	
	//string to int
	String si = "10";
	int result = Integer.parseInt(si);
	System.out.println(result);
	
	
	//float to string
	float f=12.3F;
	String sf=String.valueOf(f);  
	System.out.println(sf);  
	
	
	
}
}
