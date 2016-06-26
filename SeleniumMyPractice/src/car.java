
public class car {
	String model;            // both wheels and price are static
	int price;
	 static int wheels; //STATIC
	
	public static void main(String[] args) {
		//creating object of a class
		new car();
		car c1=new car();
		c1.model ="benz";
		c1.price =23567;
		c1.wheels=4;
		c1.start();
		c1.accelerate();
		
		
		car c2=new car();
		c2.model ="bmw";
		c2.price =28567;
		c2.wheels=4;
		c2.start();
		c2.accelerate();

		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
		//static
		System.out.println(wheels);
		System.out.println(car.wheels);
		
		c1.wheels=8;   // if it is not static also here we can print by pointing objects as
		System.out.println(c1.wheels);
		
		c2.wheels=6;
		System.out.println(c2.wheels);
		
		
		fillgas(100);
		car.fillgas(16);
		c1.fillgas(58);
		c2.fillgas(45);
	}
	
	public car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
     public void  start(){       //non static
	     System.out.println(model+"starting");	
	
	
	}
	public void accelerate(){      //non static 
		System.out.println(model +"accelerating");
	}
		
		public static void fillgas(int quantity){
			
		}
		
}

