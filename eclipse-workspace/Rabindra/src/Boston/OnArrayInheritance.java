package Boston;

public class OnArrayInheritance 
{

	public static void main(String[] args) 
	{
		
		 //String[] Dg =  {"Doju", "Brown", "3"};
				
				Dog dg = new Dog("Bony", "Brown", "9009"); 		
			
			
			dg.moving();
	}
}
class Animals
{
	String name;	
	String age;
	
	public Animals(String nm, String ag)
	{
		this.name  = nm;		
		this.age = ag;
	}
	
	public void moving()
	{
		System.out.println("Run, swim, walk");
	}
}
class Dog extends Animals
{
	String color;
	public Dog(String nm, String cl, String ag) 
	{
		super(nm, ag);
		this.color = cl;		
	}
	
	public void moving()
	{
		System.out.println("this dog is:"+ this.name +","+this.color+","+this.age);
	}
}