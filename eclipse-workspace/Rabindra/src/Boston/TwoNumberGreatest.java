package Boston;

public class TwoNumberGreatest {

	public static void main(String[] args) {
		int x = 101, y = 101;
		
		if( x > y)
		{
			System.out.println("x is greatest number than y: " + x );
		} 
		else if (x < y)
		{
			System.out.println("Y is greatest number than x: " + y);
		} 
		else
		{
			System.out.println("Both is equal: " + x + " = " + y);
		}
		
		
		
		SecondGreatest gr = new SecondGreatest();
		gr.great();

	}

}
