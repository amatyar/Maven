package Boston;

public class basic3 {

	public static void main(String[] args) {
		// switch statement
		String city = "Bosto";
		switch(city) 
		{
		case "New York":
		case "Queens":
			System.out.println("NY");
			break;
		case "Boston":
		case "Allston":
		case "Quincy":
			System.out.println("MA");
			break;
			default:
				System.out.println("Please check your city name. ");
		}
		
		/* for loop
		 * for(initialization; condition for check; increment/ decrement)
		 */
		for (int i = 0; i < 3 ; i++) {
			System.out.println(i);
			System.out.println("Hi");
		}
		// for reverse
		for( int i = 9; i >=5; i--) {
			System.out.println(i);
			System.out.println("Hi");
		}
		
		// for loop with break
		for( int i = 9; i >=5; i--) {
			
			System.out.println(i);
			//System.out.println("Hi");
			if( i == 7) {
				break;
			}
			//System.out.println(i);
		}
		// for loop with continue
				for( int i = 9; i >=5; i--) 
				{
					
					
					//System.out.println("Hi");
					if( i == 7) {
						continue;
					}
					System.out.println(i);
				}
				
				
	}

}
