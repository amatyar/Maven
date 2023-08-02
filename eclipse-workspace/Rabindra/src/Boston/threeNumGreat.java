package Boston;
import java.util.Scanner; //Importing the Scanner class in program
public class threeNumGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaring the required variables for the program.
int x, y, z, greatest, flag;  
//x = it will hold the first number.
//y = it will hold the second number.
//z = it will hold the third number
 
//object of the Scanner class  
Scanner sc = new Scanner(System.in);  
//reading input from the user  
//Taking the first input number
System.out.println("Enter the first number:");  
x = sc.nextInt();  
//Taking the second input number
System.out.println("Enter the second number:");  
y = sc.nextInt();  
//Taking the third input number
System.out.println("Enter the third number:");  
z = sc.nextInt();  
//comparing x and y and storing the greatest number in a flag variable  
flag=x>y?x:y;  
//comparing the flag variable with z and storing the result in the variable  
greatest=z>flag?z:flag;  
//prints the greatest number  
System.out.println("The greatest number is: "+greatest);  
	}

}

