package Boston;

public class basic4 {

	public static void main(String[] args) {
		//while loop
		/*
		 * while (condition){
		 * statements
		 * increment / decrement
		 * }
		 */

		int x = 2;
		while (x < 6) {
			System.out.println(x);
			//x++;
			x = x+2;
		}
		
		
		// with continue
		
		int y = 1;
		while (y <= 6)
		{
			if (y==4) {
				y++;
				continue;
			}
			System.out.println(y);
			y++;
		}
		// with break
		System.out.println("%%%%%%%%%");
				int y1 = 1;
				while (y1 <= 6)
				{
					System.out.println(y1);
					if (y1 == 4) {
						
						break;
					}
					
					y1++;
				}
	}

}
