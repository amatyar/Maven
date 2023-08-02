package Boston;
import java.util.Scanner;
/*
It starts by creating a new Scanner object that reads input from the console.
The program prompts the user to enter a string by displaying a message “Enter the String:”.
The user inputs a string, which is read by the Scanner object and stored in a String variable called “str”.
The program then prints the input string back to the user by displaying a message “Show String:” followed by the input string.
The program converts the input string to a character array using the toCharArray() method.
It then initializes four variables – “count”, “i”, “upper” and “lower”. “count” is not used in the program, but is left in the code for some reason. “i” is used as a loop variable. “upper” and “lower” are counters for the number of uppercase and lowercase letters in the string respectively.
The program then enters a for loop that loops through each character in the string.
For each character, it checks if it is an uppercase letter by comparing it with the ASCII codes for uppercase letters (‘A’ to ‘Z’). If the character is an uppercase letter, it increments the “upper” variable.
Similarly, if the character is a lowercase letter, it increments the “lower” variable.
Finally, the program prints out the original input string, the number of uppercase letters, and the number of lowercase letters.
*/
public class UpperLowerCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("\nShow String:"+str);
        char[] ch=str.toCharArray();
        int count, i, upper = 0, lower = 0;
        for(i=0;i<str.length();i++){
            if(ch[i]>='A'&&ch[i]<='Z')
                upper++;
            if(ch[i]>='a'&&ch[i]<='z')
                lower++;
        }
        System.out.print("\nUpper case Letters:"+upper);
        System.out.println("\nLower case Letters:"+lower);
	}
}


