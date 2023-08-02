package Boston;

public class Innerclass 
{

	public static void main(String[] args) 
	{
		Costco cs= new Costco(125, "GoldCard");
		Costco.Member cm = cs.new Member();	
		//cm.setMember();
		System.out.println(cm.getMember_Type());

	}

}
class Costco
{
	int ID;
	String Name;
	
	public Costco(int id, String nm) 
	{
		this.ID   = id;
		this.Name = nm;
	}
	private int getID()
	{
		return this.ID;
	}
	class Member
	{
		String Member_Type;
		 void setMember() 
		{
			if(Costco.this.Name.equals("GoldCard")) 
			{
				this.Member_Type="you get 10% discount";
			}
			else
			{
				this.Member_Type="you pay right price.";
			}
		}
		String getMember_Type() 
		{
			setMember();
			return this.Member_Type;
		}
	}
}