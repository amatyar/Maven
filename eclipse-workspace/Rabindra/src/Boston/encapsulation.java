package Boston;

public class encapsulation 
{
	public static void main(String[] args) 
	{
		Credit cr = new Credit("Rabindra", "Facebook", 42, 1265.25);
		System.out.println("Name :\t"+cr.getName()+" Profile:\t"+cr.getProfile()+" Age:\t"+cr.getage()+" Salary:\t"+cr.getsalary());

	}
}
class Credit
{
	private String Name;
	private String Profile;
	private int age;
	private double salary;
	
	public Credit(String nm, String pf, int ag, double sal) 
	{
		this.Name    = nm;
		this.Profile = pf;
		this.age     = ag;
		this.salary  = sal;
	}
	//getter and setter
	public void setName(String Nm) 
	{
		this.Name = Nm;
	}
	public String getName()
	{
		return Name;
	}
	public void setProfile(String pf) 
	{
		this.Profile = pf;
	}
	public String getProfile()
	{
		return Profile;
	}
	public void setage(int ag) 
	{
		this.age = ag;
	}
	public int getage()
	{
		return age;
	}
	public void setsalary(double sal) 
	{
		this.salary = sal;
	}
	public double getsalary()
	{
		return salary;
	}
	
}