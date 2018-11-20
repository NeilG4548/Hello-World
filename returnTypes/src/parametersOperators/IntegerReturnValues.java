package parametersOperators;

//Create a method that accepts two integers as parameters, then returns an integer
//that is a sum of the two integers given, then call this method from your main method
//and output the returned result.

public class IntegerReturnValues{

	public static boolean isSumGreaterThanTen(int a, int b) {
		return(a + b) > 10; 
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		System.out.println(isSumGreaterThanTen(a, b));

	}

}
