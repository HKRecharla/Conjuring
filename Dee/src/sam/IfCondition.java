package sam;
/**
@author Harikrishna Recharla SDET II
@date 05-Nov-2017 2:13:41 PM
*/
public class IfCondition {

	static String name  ="Hari";
	
	public static void getname(){
		if (name=="Hari") {
			System.out.println(name);
		}else {
			System.out.println("Not Equal");
		}	
	}
	
	
	public static void joinSchool(int age){
		if (age<=3) {
			System.out.println("Join in Pre school");
		}else if (age>3 || age==5) {
			System.out.println("join in LKG");
		}else if (age>=6) {
			System.out.println("joing in higher ");
		}
	}
	
	public static void schoolswitch(int age){
		switch (age) {
		case 2:
			System.out.println("join in preschool");
			break;
		case 6:
			System.out.println("jOin i lkg");
		default:
			System.out.println("No schools found");
			break;
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		schoolswitch(3);
	}
}
