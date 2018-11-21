package arrays;

public class arrays {
	
	public static void main(String [] args) {
		int[] values = {77,1,87,3,11,5,23,7,86,9};
	
		addition (values[3],values[6], false);
		
	}
	public static void addition (int num1, int num2, boolean bool) {
		
		
		if(bool == true) 
		{
			System.out.println(num1 + num2);
		} 
		else 
		{ 
			System.out.println(num1 * num2);
		}
	
		
		if (num1 == 0) 
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num1);
		}	
	}


}
