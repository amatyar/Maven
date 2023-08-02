package Boston;

public class basic5 {

	public static void main(String[] args) {
		// String  is collection of character and store the value by index  
		//using charAt()
		 String myWord= "Today is nice day.";
		 System.out.println(myWord);
		 char abc= myWord.charAt(9);
		 System.out.println(abc);
		 int totalChar= myWord.length();
		 System.out.println(totalChar);
		 for(int i =0 ; i < totalChar; i++)
		 {
			 //System.out.println(i);
			 System.out.println(myWord.charAt(i));
		 }
		 
		 // for reverse
		 for(int i = myWord.length()-1; i >=0; i --)
		 {
			 System.out.println(myWord.charAt(i));
		 }
		 
		 //convert all string into upper cases
		 String upperCase = myWord.toUpperCase();
		 System.out.println(upperCase);
		 
		 // reverse the string
		 
		 String rev= "";
		 for(int i =0; i < myWord.length(); i++) {
			 rev= myWord.charAt(i)+rev;
		 }
		 System.out.println(rev);
		 
		 
		 // using substring
		 String s2 = myWord.substring(2, 16);
		 System.out.println(s2);
		 
		 
		 //startwith 
		 boolean s3= myWord.startsWith("To");
		 System.out.println(s3);
		 
		 //Replace word
		 String s4= myWord.replace("Today","Yesterday");
		 System.out.println(s4);
		 
		 String s5=myWord.replaceAll("i", "y");
		 System.out.println(s5);
		 
		 
		 //concat
		 
		 String words= " Happy Birthday to you";
		 String s6 = myWord.concat(words);
		 System.out.println(s6);
		 
		 String s7= words.trim();
		 System.out.println(s7.length());
		 System.out.println(s7);
		 }

}
