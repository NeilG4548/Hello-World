package conditional2;

public class conditional2 {
	//Modify your method from the previous task to have another if statement that checks
	//if one of the numbers is 0, if this is true then return the other non-0 number.
	public static void main(String [] args) {
		addition (5,6, true);
		
	}
	public static void addition (int num1, int num2, boolean boo) {
		if(boo == true) {
			System.out.println(num1 + num2);
			
		} else { 
			System.out.println(num1 * num2);
		}
	
		if (num1 == 0) {
			System.out.println(num2);
		}else {
			System.out.println(num1);
	}
	
	}
}	


	