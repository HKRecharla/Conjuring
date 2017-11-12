package sam;

import java.util.ArrayList;

public class SeventhSampleProgram 
{
public static void main(String args[]){
	//for loop
	for(int i = 1; i<=10; i++){
		System.out.println(i*i);
	}
	
	//for each
	ArrayList<String> list=new ArrayList<String>();  
	   list.add("abc");  
	   list.add("abab");  
	   list.add("sssds");  
	  
	   for(String s:list){  
	     System.out.println(s);  
	   }  
	   
	   //swtich case
	   int month = 2;
	   String monthString;
       switch (month) {
           case 1:  monthString = "January";
                    break;
           case 2:  monthString = "February";
                    break;
           case 3:  monthString = "March";
                    break;
           case 4:  monthString = "April";
                    break;
           case 5:  monthString = "May";
                    break;
           case 6:  monthString = "June";
                    break;
           case 7:  monthString = "July";
           default: monthString = "Invalid String";
       }
       System.out.println(monthString);
}
}
