package sam;

public class ParamterizedConstructor 
{
	int empId;  
	   String empName;  
		    
	   //parameterized constructor with two parameters
	   ParamterizedConstructor(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	   void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  
		   
	   public static void main(String args[]){  
		   ParamterizedConstructor obj1 = new ParamterizedConstructor(10245,"Chaitanya");  
		   ParamterizedConstructor obj2 = new ParamterizedConstructor(92232,"Negan");  
		obj1.info();  
		obj2.info();  
	   }  
}
