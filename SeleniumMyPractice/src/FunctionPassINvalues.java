
public class FunctionPassINvalues {

	public static void main(String[] args) {
		
     selenium(4,6,8);
      selenium(90,56,78);//arguments
      selenium("hello",45,78);
	}
	//void is a return type
public static void selenium(int a,int b,int c){
	
	int sum=a+b+c;
	System.out.println(sum);
	
	int temp=100;//local variable
	
}
public static void selenium(String a,int b,int c){
	
System.out.println(a);
	System.out.println(b+c);
}
}
