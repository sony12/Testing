
public class Arrays {

	

	public static void main(String[] args) {
		
		String username="XXXX";
		String password="YYYY";		
		String email   ="erdd.effe@gmail.com";		
		String zipcode ="2345";	
		String city="AAA";
		
		
		//Arrays
		// array is a memory location where we can store many values
		//read the data from xls and put it inside the array
		// no.of arrays that string or integer holds should be given
		//example :- int i[]=new int[4];int array cannot hold string(or)char array;
		//           char c[]=new char[4]; char array cannot hold integer(or)String array;
		//           String str[]=new String[5]; String array cannot hold integer(or)char array;
		
		
		
		String str[]=new String[5];
	    str[0]="XXXX";
		str[1]="YYYY";
		str[2]="erdd.effe@gmail.com";
		str[3]="2345";
		str[4]="AAA";
		
		
		int i[]= new int[4];
		
		i[0]=888;
		i[1]=823;
		i[2]=864;
		i[3]=822;
		
		
		
		char c[]=new char[3];
		
		c[0]= 'e';
		c[1]='r';
		c[2]= 'o';
		
		
		//length of array
		System.out.println(str.length);
		System.out.println(i.length);
		System.out.println(c.length);
		
		for(int x=0;x<str.length;x++){
			System.out.println(str[x]);
	}
		for(int y=0; y<i.length;y++){ // if you want to print in reverse for(int y=i.length-1;y>=0;y--);
			System.out.println(i[y]);
		}
		for(int z=0;z<c.length;z++){
					System.out.println(c[z]);
				}
		}
}


