package sam;

public class FirstSampleProgram {
	
	public static void main(String args[])
	{
		//Print name
		System.out.println("Harry");
		
		// Print current date, time and datetime
		System.out.println(java.time.LocalDate.now()); //current date
		System.out.println(java.time.LocalTime.now());   //current time
		System.out.println(java.time.LocalDateTime.now());  //current date and time
		
		//Print String
		String s = "Java";
		System.out.println(s);	
		
		//Print Interger Value
		int i = 5;
		System.out.println(i);
				
		//Print Double value
		double d = 2.40;
		System.out.println(d);
	}

}
