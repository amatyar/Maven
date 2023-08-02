package Boston;

public class NewTest 
{

	public static void main(String[] args) 
	{
		// object create
		
		newTset2 pt = new newTset2();
		pt.name="John";
		pt.type= 'B';
		System.out.println(pt.name+"," + pt.type );
		newTset2 RT = new newTset2();
		RT.name= " Ronny";
		RT.type='M';
		System.out.println(RT.name+ " "+ RT.type);
		RT.DisplayType();

	}

}

