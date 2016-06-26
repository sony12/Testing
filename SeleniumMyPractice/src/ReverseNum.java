
public class ReverseNum {

	public static void main(String[] args) {
		int i=112;
		int last;
		int reversedNum = 0;
		while(i!=0)
		{
			
			last=i%10;
		
				reversedNum = reversedNum *10+last;
			
			i=i/10;
		
	}
	System.out.println(reversedNum);
}
}