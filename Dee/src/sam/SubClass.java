package sam;

public class SubClass extends SuperClass {
	    public void qaws() {
		 
		      super.xyz();
		      System.out.println("Hello from SubClass");
		       return;
		    }
		    public static void main(String[] args) {
		       SubClass obj = new SubClass();
		       obj.qaws();
		   }


}
