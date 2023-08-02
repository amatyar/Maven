/**Inheritance types
 * single 1+2
 * multi-level 1+2+3
 * Hierarchical 1+2+3+4
 * Multiple 
 * Hybrid
 */
package Boston;

/**
 * @author Rabindra
 *
 */
public class Inheritances 
{
	public static void main(String[] args) 
	{
		Person p = new Person("Rabindra", "Amatya");
		p.FullName();
		Student s = new Student("Rabindra", "Amatya", 1564);
		s.FullNameID();
		QA_Student sq= new QA_Student("Rabindra", "Amatya", 1564, "Automation and Mannul");
		sq.DisplayField();
		Employee em= new Employee("Rabindra", "Amatya", "Part time");
		em.EmployeeID();
	}

}
// 1
class Person
	{
	//Properties
	String FirstName , LastName;
	//Constructor
	public Person() {
	}
	
	public Person(String fn, String ln) 
	{
		this.FirstName = fn;
		this.LastName = ln;
	}
		//Method
		public void FullName()
		{
			System.out.println("Full name of the Person:\t"+this.FirstName+" "+this.LastName);
		}
	}
//2
class Student extends Person
	{
	int Identification;
	public Student(String fn, String ln, int ID) 
	{
		super(fn, ln);
		this.Identification = ID;
	}
	//Method
		public void FullNameID()
		{
			super.FullName();
			System.out.println("ID number: \t"+ this.Identification);
		}
	}
//3
class QA_Student extends Student 
	{
	String Field;
	public QA_Student(String fn, String ln, int ID, String fd ) 
	{
		super(fn, ln, ID);
		this.Field = fd;
	}	
	//method
		public void DisplayField()
		{
			System.out.println("your field is:\t"+this.Field);
			super.FullNameID();
		}
	}
// 4
class Employee extends Person
	{
      String EmpID;
	public Employee(String fn, String ln, String Eid) 
		{
		super(fn, ln);
		this.EmpID= Eid;		
		}
	//method
		public void EmployeeID()
		{
			System.out.println("Employee ID:\t"+this.EmpID);
			super.FullName();
		}
	
	}
