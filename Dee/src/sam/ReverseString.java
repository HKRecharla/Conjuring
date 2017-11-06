package sam;

public class ReverseString {
	
	public static void main(String args[])
	{
		String reverse, word;
		
	
	// using String function
	 word = "WakeUp";
	 reverse = new StringBuilder(word).reverse().toString();
     System.out.println("\nString before reverse: "+ word);
      System.out.println("String after reverse: "+reverse);
	
	
    
	// without using string function
	 String str = "Hello Java"; 

	 for (int i = str.length() - 1; i >= 0; i--) { 
	 System.out.print(str.charAt(i)); 
	} 
	
}}
   