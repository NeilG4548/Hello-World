package iteration;

//Create a for loop that will call and output the result of your method from Conditionals
//2 10 times, using the current iteration as one of the parameters you pass to it.
public class iteration {

	public static void main(String [] args) {
		int count = 0;
		addition (10,6, true, count);
		
	}
	public static void addition (int num1, int num2, boolean bool, int count) {
		
	for (count = 0; count < 10; count++) 
	
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

