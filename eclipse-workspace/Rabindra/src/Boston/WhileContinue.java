package Boston;

public class WhileContinue {
	// Java Program to illustrate the use of continue statement with while loop
	public static void main(String[] args) {
		 // Program 1
		int i;
		for (i = 1; i <= 10; i++) {
			if(i == 3 || i == 7) {
				
				continue;
			}
			System.out.println(i);
		}
			
		System.out.println("----------------End -------------------");
		// Program 2 while loop
		i = 10;
		while(i >= 2) {
			if( i == 4 || i == 9 || i == 7) {
				i --;
				continue;
			}
			System.out.println(i);
			i--;
		}
		System.out.println("----------------End -------------------");
		// Program 3 do while loop
		i = 1;
		do {
			if(i == 4 || i ==7) {
				i +=2;
				continue;
			}
			System.out.println(i);
			i += 2;
		}while(i <= 9);
		
		System.out.println("----------------End -------------------");
		// Program 4 Nested loop
		for (i = 1; i<=4 ; i ++) {
			for (int j = 2; j <= 4; j++){
				if(i ==2 && j == 3 || i == 3 && j == 3) {
					continue;
				}
			System.out.println(i + "*" + j);
		} 
			}
		
		System.out.println("----------------End -------------------");
		// Program 5
	}

}
