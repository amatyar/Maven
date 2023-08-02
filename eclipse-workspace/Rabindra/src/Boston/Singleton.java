package Boston;
// Lazy initialization
public class Singleton 
{

	public static void main(String[] args) 
	{
		singlar sn;
		sn = singlar.getInstance();
		sn.getbcu();
		System.out.println(sn.Name);

	}

}
class singlar{
	
	private static singlar bcu;
	String Name;
	
	private singlar()
	{
		Name = " Welcome to Boston credit union";
	}
	public static singlar getInstance()
	{
		if (bcu == null) 
		{
			bcu = new singlar();
		}		
		return bcu;
	}
	public void getbcu() 
	{
		System.out.println("Welcome to Boston credit union");
		
	}
}