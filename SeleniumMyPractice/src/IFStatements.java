
public class IFStatements {

	public static void main(String[] args) {
		
		 if(true){
			   System.out.println("iam the one");
		   }
		   int l=34;
		   int m=45;
		   if(m>l){
		   System.out.println("m is greater " +m);// if (l>m) it doesnt show up anything becoz it is false
		   }else{
			   System.out.println("l is the greater"+l);
		   }
		   
	//nested IF Statements
		   
		   int a1=500;
		   int b1=600;
		   int c1=700;
		   
		   if(a1>b1&a1>c1){
			   System.out.println("a1 is the greatest "+a1);
			   
			   
		   }else if(b1>c1){
			   System.out.println("b1 is the greatest"+b1);
			   
			   
		   }else{
			   System.out.println("c1 is the greatest"+c1);
		   }

	}

}
