package Boston;
//static/static Binding /Early/compile-Time/overloading Polymorphism
//Dynamic/ Dynamic Binding/runtime/ overriding Polymorphism
public class Polimorphsym 
{  

	public static void main(String[] args) 
	{
		Plan pl = new Plan();
		pl.minValue(-6, -5);
		pl.minValue(22.083, 23.8891);
		
		PlanB plb= new PlanB();
		plb.minValue(9, 8);
		plb.minValue(3.55,35.26);
	}

}
class Plan
{	
	public int minValue(int var1, int var2) 
	{
		int min;		
		if(var1 < var2) 
		{
			min = var1;
			System.out.println("your minmum value:\t" + min);
		}		
		else
		{
			min = var2;
			System.out.println("your minmum value:\t" + min);
		}		
		return min;
	}
	public  double minValue(double dvar1, double dvar2) 
	{
		double min = 0;		
		if(dvar1 < dvar2) 
		{
			min = dvar1;
			System.out.println("your minmum value:\t" + min);
		}		
		else
		{
			min = dvar2;
			System.out.println("your minmum value:\t" + min);
		}		
		return min;
	}
}
class PlanB extends Plan
{
	public int minValue(int var1, int var2) 
	{
		int sum ;		
//		if(var1 < 0 && var2 < 0) 
//		{
			sum = var1 + var2;
			System.out.println("your sum value:\t" + sum);
//		}		
//		else
//		{
//			sum = 0;
//			System.out.println("your sum value:\t" + sum);
//		}		
		return  sum;
	}
	public  double minValue(double dvar1, double dvar2) 
	{
		double sum;		
//		if(dvar1 < 0 && dvar2 < 0) 
//		{
		sum = dvar1 + dvar2;
			System.out.println("your sum value:\t" + sum);
//		}		
//		else
//		{
//			sum = 0;
//			System.out.println("your sum value:\t" + sum);
//		}		
		return sum;
	}
}