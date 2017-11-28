package sam;

import java.util.Scanner;

public class DuplicateCharactersInString 
{
	public static void main(String agrs[])
	{
		System.out.println("Enter string");
		
		Scanner Sc = new Scanner (System.in);
		String Str = Sc.next();
		char[] inp = Str.toCharArray();
		
		for(int i = 0 ; i< Str.length(); i++){
			for(int j = i+1; j< Str.length();j++){
				if(inp[i] == inp[j]){
					System.out.print( inp[j]);
				}
				
			}
			
			
		}
		
	}

}
