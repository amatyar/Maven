package Boston;
import java.io.*;
public class WhileBreak {
	
	public static void main(String[] args)
	{
		// Program 1 to show use of break statement
		int i;
		
		for(i = 2; i <= 22; i +=2)
		{
			if( i == 8)
			{
				break;
			}
			System.out.print(i + "  ");
		}
		System.out.println("\n---------------------------\n\n");
		// Program 2 to show use of break statement with while loop
		i = 15;
		while(i >= 5) {
			if(i ==10) {
				//i--;
				break;
			}
			System.out.print(i + "  ");
			i --;
		}
		
		System.out.println("\n---------------------------\n\n");
		// Program 3 to show use of break statement with do while loop
		 i = 0;
		 do 
		 { if(i == 14)
		 {
			
			 break;
		 }
			 System.out.print(  i+"  ");
			 i +=2;
		 }
		 while(i <25);
		 
		 System.out.println("\n---------------------------\n\n");
			// Program 4 to show use of break inside label block
		 
		 i = 10;
		 
		 Whil: 
		 {
			 System.out.println("Block your code here");
			 if (i == 10)
			 {
				 break Whil;
			 }
			 System.out.println(" you can run your code. No block for you");
		 }
	}

}
