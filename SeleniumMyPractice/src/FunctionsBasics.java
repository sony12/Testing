
public class FunctionsBasics {

	public static void main(String[] args) { //main is a function
		// functions are independent small unit of execution
	myname();
	myname();// you can call function as many times you want
		System.out.println("In main function");
	testname();
	printname();
	}
	
	public static void myname(){  // myname is an my own function name
	System.out.println("In my name function");
	}
	
	public static void testname(){
		System.out.println("in testname function");
	}
	
	public static void printname(){
		System.out.println("in print name function");
	}
	
}