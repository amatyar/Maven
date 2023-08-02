package Boston;

public class basic {

	public static void main(String[] args) {
		// from basic for begin
		System.out.println("Hello the java world");
		//Arithmetic operator +,-,*,/,%
		// define data type int, char, string
		int x= 3, y= 4;
		System.out.println(x + y);
		
		here();// calling function 
		there(9,2);
		 int addition = care(8,3);
		 System.out.println(addition + 5);
		 System.out.println(addition * 0.01);

	}
	// creating function without parameter
	public static void here()
	{
		System.out.println(5 + 9);
	}
	
	// creating function with parameter without return type
	public static void there(int a, int b) {
		System.out.println(a-b);
	}
	
	// creating function with parameter with return type
	public static int care(int p, int q) {
		System.out.println(p+q);
		return p + q;
	}

}
