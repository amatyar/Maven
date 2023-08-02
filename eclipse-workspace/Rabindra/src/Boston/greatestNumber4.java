package Boston;
import java.util.Scanner;

public class greatestNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x ,y , max;
 Scanner sc =new Scanner(System.in);
 System.out.println("please enter first number: ");
 x = sc.nextInt();
 
 
 System.out.println("please enter second number: ");
 y = sc.nextInt();
 
 if(x > y)
	 {
		 System.out.println(" your first number is greater" + x);
	 }
	 else
	 {
		 System.out.println(" Your second number is greate " + y);
 
	}
 }

}
