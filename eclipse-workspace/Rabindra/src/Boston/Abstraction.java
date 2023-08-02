package Boston;
public class Abstraction 
{
	public static void main(String[] args) 
	{
		circle cl = new circle("Circle", 2.50);		
		System.out.println(cl.display());
		System.out.println("Next case ===>\n");
		Square sq = new Square("Square", 7.5);
		System.out.println(sq.display());
	}
}
abstract class Mathematics
{
	//properties
	String ShapeName;
	//abstract method
	abstract double CalculateArea();
	public abstract String display();	
	// constructor
	public Mathematics(String sn)
	{
		System.out.println("Inside the constructor of Mathematics");
		this.ShapeName = sn;
	}
	// non- abstract method
	public String getShapeName()
	{
		return ShapeName;
	}	
}
class circle extends Mathematics
{
	double radius;
	public circle(String sn, double rd) 
	{		
		super(sn);
		System.out.println("Inside the constructor of circle class");
		this.radius=rd;
	}
	//Implementing the method
	@Override
	double CalculateArea() {
		
		return Math.pow(radius, 2) * Math.PI;
	}
	@Override
	public String display() {
		
		return "Shape name is:\t"+super.ShapeName +"\tArea is:\t"+CalculateArea();
	}
	
}
class Square extends Mathematics
{
	double side;
	public Square(String sn, double sd) {
		super(sn);
		System.out.println("Inside the constructor of Square class");
		this.side = sd;
	}
	//Implementing the method
	@Override
	double CalculateArea() {
		
		return side * side;
	}

	@Override
	public String display() {
		
		return "Shape name is:\t"+super.ShapeName +"\tArea is:\t"+CalculateArea();
	}
	
}