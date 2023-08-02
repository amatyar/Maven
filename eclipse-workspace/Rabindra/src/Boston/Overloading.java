package Boston;

public class Overloading 
{

	public static void main(String[] args) 
	{
		math mt= new math();
		mt.add(5, 6, 3);
		mt.add(3.33, 2.52, 2.66);
	}

}
class math
{
	
	
	public void add(int a,int b,int c) 
	{
		System.out.println(a + b + c);
	}
	public void add(double e,double f, double g) 
	{
		System.out.println(e+ f+ g);
	}
}
