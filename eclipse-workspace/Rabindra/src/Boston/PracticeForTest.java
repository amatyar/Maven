package Boston;
/**
 * @author Rabindra
 *
 */
public class PracticeForTest {

	public static void main(String[] args) 
	{ 
		Practice1 pr= new Practice1();		
		pr.cal();
		System.out.println("***************");
		pr.calcu(8,15);
		System.out.println("***************");
		int sum = pr.calcul(7, 9, 88);
		System.out.println(sum);
		pr.calculex(sum, 100);
		System.out.println("***************");
		Comparison com = new Comparison();
		com.comp();
		System.out.println("***************");
		Logical lo = new Logical();
		lo.log();
		//System.out.println("***************");
		Conditional con = new Conditional();
		con.ifStatement();
		System.out.println("***************");
		con.ifelseStatement();
		System.out.println("***************");
		con.if_comparison();
		System.out.println("***************");
		con.ifelseComparison();
		System.out.println("***************");
		con.ifelseLogic();
		System.out.println("***************");
		con.ifelseifelseLogic();
		System.out.println("***************");
		switchCase sw= new switchCase();
		sw.program1();
		System.out.println("***************");
		sw.program2();
		System.out.println("***************");
		sw.program3();
	}

}
