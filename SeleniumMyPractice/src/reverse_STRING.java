
public class reverse_STRING {

	public static void main(String[] args) {
	String testString="time,value,keys";
	char c[]=testString.toCharArray();
	//String S[]=testString.split(",");// you can reverse the string by "," ;  o/p:kays,value,time
	//int arraySize=c.length;
	
	for(int k=c.length-1;k>=0;k--){
		System.out.println(c[k]);
		//if (c[k]==','){  // o/p :without camas " ,"
			
		//}
		//else{
			//System.out.println(c[k]);
		//}
	}
	

	}

}
