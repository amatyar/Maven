package Boston;

public class exam {

	public static void main(String[] args) {
		
		Fruit frt = new Fruit(48,"Rabindra Amatya");
		
		System.out.println(frt.Name + " "+frt.number);
	}

}
class Fruit{
	int number ;
	String Name;
	public Fruit(int n, String s)
	{
		this.Name= s;//"Rabindra  Amatya";
		this.number = n;//48;
	}
	
}