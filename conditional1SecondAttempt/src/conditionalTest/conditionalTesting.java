package conditionalTest;

public class conditionalTesting {

	
	public static int conditional(int num1, int num2, boolean bool) {
		if (bool == true)
			return num1 + num2;
		else 
			
		return num1 * num2; 
		}
	public static void main(String[] args) {
		System.out.println(conditional(8,9, false));
	
		
		
	}
	
}
