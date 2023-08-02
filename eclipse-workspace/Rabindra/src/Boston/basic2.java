package Boston;

public class basic2 {

	public static void main(String[] args) {
		//Conditional statements
		/*
		 * if statement
		 * if / else statement
		 * if / else if / if statement
		 */

		//if statement
		int number = 31;
		if(number > 0 && number < 10) 
		{
			System.out.println("you are between 0 and 10");
		}
		if(number > 30 && number < 40) {
			System.out.println("you are between 30 and40");
		}
		if (number > 40 && number < 60)
		{
			System.out.println("you are between 40 and 60");
		}
		if (number > 20) {
			System.out.println("you are greater than 20");		
		}
		
		//if and else
		if (number > 0 && number < 20)
		{
			System.out.println("you are between 0 and 20");
		}
		else
		{
			System.out.println(" you are above 20");
		}
		
		// if , else if and else
		if (number > 0 && number < 20) {
			System.out.println("you are below 20");
		}
		else if(number >20 && number <60) {
			System.out.println("you are between 20 to 60");
		}
		else
		{
			System.out.println("you are above 60");
		}
		
	}

}
