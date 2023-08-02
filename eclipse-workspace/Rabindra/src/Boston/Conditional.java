package Boston;

/**
 * @author Rabindra
 * Conditional statement
 * 
 */
public class Conditional {
	
	public static void ifStatement()
	{
		//we are using only if statement in this function for logical
		 int num = 100;  //input Value
		
		if(num > 0 && num <= 10)
		{
			System.out.println("5% discount for your purchase.");
		}
		if (num >10 && num <= 25) 
		{
			System.out.println("10% discount for your purchase.");
		}
		if(num >25 && num <=50)
		{
			System.out.println("Get one item free on your purchase.");
		}
		if(num > 50) {
			System.out.println("you receive 2 items free on your purchase.");
		}
	}
	
	public static void ifelseStatement()
	{
		// we are using if/ else if / else statement in this function logical
		int num_a= 30; //user input value here
		
		if(num_a > 0 && num_a <= 10)
		{
			System.out.println("5% discount for your purchase.");
		}
		else if (num_a >10 && num_a <= 25) 
		{
			System.out.println("10% discount for your purchase.");
		}
		else if(num_a > 45)
		{
			System.out.println("Get one item free on your purchase.");
		}
		else {
			System.out.println("you receive 2 items free on your purchase.");
		}
		
	}
	public static void if_comparison() {
		// we are using if statement for comparison 
		
		int price = 75; //input value
		
		if(price >10) 
		{
			System.out.println("Less price than market.");
		}
		if(price>25) {
			System.out.println("good price than market.");
		}
		if(price > 50) {
			System.out.println("best price than market.");
		}
		if(price>100)
		{
			System.out.println("Great price then market.");
		}
	}
	
	public static void ifelseComparison() 
	{
		// we are using if else statement for comparison
		
		int price = 80; //input value
		if(price > 100) 
		{
			System.out.println("Good price");
		}
		else if(price >90)	
		{
		System.out.println("fair price");
		}
		else 
		{
			System.out.println(" bad price");
		}

	}
	public static void ifelseLogic()
	{
		int a = 20 , b= 40;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else 
		{
			System.out.println(" b is greater than a");
		}
	}
	public static void ifelseifelseLogic() {
		int a =9, b= 7, c=55;
		if (a<b && a<c) {
			System.out.println("a is smallest value");
		}
		else if(b<a && b<c) {
			System.out.println(" b is smallest value");
			
		}
		else 
		{
			System.out.println("c is smallest value");
		}
	}
	
}
