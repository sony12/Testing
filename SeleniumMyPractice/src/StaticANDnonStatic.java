
public class StaticANDnonStatic {
	// global variables - used across all functions -conditions
	
	
 String name;     // non static global variable
 static int age;  //static global variables
 
 // Static functions can only access static stuff like name(); can be accessed nameone(); is not
 
 
	public static void main(String[] args) {
		name();
		
		age=100;
		}
	
	public static void name(){  //static function
	int i=100; //local variables - is not a static nor non-static
}

    public void nameone(){ //non static function
	int j=-400;// local variables
	name();
	nameone();
	age=100;
	name="xyz";
	
}
}


