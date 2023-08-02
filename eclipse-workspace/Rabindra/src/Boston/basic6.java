package Boston;

public class basic6 {

	public static void main(String[] args) {
		int [] number1 = {23,34,45,56,67};
		System.out.println(number1[2]);
		System.out.println("********************");
		for(int i = 0; i < number1.length; i ++) {
			System.out.println(number1[i]);
		}
		System.out.println("*******Reverse *************");
		for(int i = number1.length-1; i > 0; i --) {
			System.out.println(number1[i]);
		}
		System.out.println("*****Reverse***************");
		for(int i = number1.length -1; i >= 0; i--) {
			System.out.println(number1[i]);
		}
		System.out.println("*****While***************");
		int x = 0;
		while(x < number1.length) {
			System.out.println(number1[x]);
			x= x + 1; //x++
		}
		System.out.println("*****While***************");
		
		int y= number1.length -1;
		while(y >= 0) {
			System.out.println(number1[y]);
			y = y - 1;
		}
		System.out.println("*****for each***************");
		
		// for each loop 
		for(int a : number1)// for(int i = 0; i < number1.length; i++)
		{
			System.out.println(a);
		}
	
	}

}
