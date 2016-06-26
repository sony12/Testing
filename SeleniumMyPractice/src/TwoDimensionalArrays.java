
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		
		                    //[rows];[coloum]
		String x[] []= new String[4] [5];
		
	     // first row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		
		  // second row
				x[1][0]="A1";
				x[1][1]="B1";
				x[1][2]="C1";
				x[1][3]="D1";
				x[1][4]="E1";
				
				 // third row
				x[2][0]="A2";
				x[2][1]="B2";
				x[2][2]="C2";
				x[2][3]="D2";
				x[2][4]="E2";

				 // forth row
				x[3][0]="A3";
				x[3][1]="B3";
				x[3][2]="C3";
				x[3][3]="D3";
				x[3][4]="E3";

				//print rows
				System.out.println("rows are"+ x.length);
				//print coloumns
				System.out.println("col are"+ x[1].length);//x[0] col must be written like this

				int rows=x.length;
				int cols=x[0].length;
				
				
        // for printing all the rows and cols wite for loop
				
				for(int rowNum=0;rowNum<x.length;rowNum++){
					
					for(int colNum=0;colNum<cols;colNum++){
						System.out.println(x[rowNum][colNum]);
						
					}
					
				}
	}

}
