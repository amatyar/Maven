package Boston;

public class test222 
{

	public static void main(String[] args)
	{
		Demo2 mt = new Demo2();
		double y =mt.myMath(2.2, 3.3);
		System.out.println(y);
		int tt = mt.myMath(5, 7);
		System.out.println(tt);
		

	}

}

class Demo2
{
   public double myMath(double num1, double num2) 
   {
	   
	   return num1 + num2;
   }
   public int myMath(int val1, int val2) 
   {
	   
	   return val1 - val2;
   }
}