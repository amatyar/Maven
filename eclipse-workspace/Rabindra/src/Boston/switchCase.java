package Boston;

/**
 * @author Rabindra
 * we are practicing switch cases 
 *
 */
public class switchCase {
	// switch cases with out break statement
	public static void program1()
	{
	String City = "Toykoy"; // input value here 
	
		switch(City) 
		{
				case "Toykoy":
					System.out.println("Japan");
				case "Allston":
					System.out.println("Masachussett");
				case "New York":
					System.out.println("Queens");
							
		default:
			System.out.println("invalid input");
		}
	}
	//switch cases with break statement
	
	public static void  program2() {
		
		String friut= "chicken";
		
		switch(friut) 
		{
		case "Mango":
			System.out.println("This is friut but not right one for you.");
			break;
		case "Banana":
			System.out.println("This is friut but not right one for you.");
			break;
		case "Apple":
			System.out.println("This is friut but right one for you.");
			break;
			default:
				System.out.println("Please try again because we do not have what you looking.");
		
		}
	}	
		//switch cases with multiple cases with break
		
		public static void program3() 
		{
		String meat= "chicken";
		
			switch(meat)
			{
			case "chicken":
			case "Mutton":
			case "Lamb":
				System.out.println("this is meat category.");
				break;
			case "Spanich":
			case "Potato":
			case "Sweet pea":
				System.out.println("this is Vegetable category.");
				break;
				
			case "rice":
			case "weath":
			case "chick pea":
			case "corn":
			case "brown rice":
				System.out.println("this is gain catageroy.");
				break;
				default:
					System.out.println("Please try again!");
				
			}
		
		}

}