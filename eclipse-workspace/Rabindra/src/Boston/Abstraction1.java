package Boston;

public class Abstraction1 
{

	public static void main(String[] args) 
	{
		Rectangle rt = new Rectangle();
		rt.getArea();
		rt.getPerimeter();
		rt.getNumberOfSides();

	}

}
interface Polygon
{	//properties 
	final int side = 3, length = 4, breadth = 5;
	//method without body	
	public void getNumberOfSides();
	public void getArea();	
}
interface Polygon1
{	//method without body			
	public void getPerimeter();	
}
class Rectangle implements Polygon, Polygon1
{
	@Override
	public void getNumberOfSides() 
	{
		System.out.println("There are 4 sides in a rectangle");		
	}
	@Override
	public void getArea() 
	{
		System.out.println("The area is :\t"+ length * breadth);		
	}
	@Override
	public void getPerimeter() 
	{
		System.out.println("The perimeter is :\t" + 2 *(length + breadth));
	}
	
}