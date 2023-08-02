package Boston;
import java.util.Arrays;


public class ClassStart 
{

	public static void main(String[] args) 
	{
		//process(4,9);
		Processor ity= new Processor(); 
		ity.process(7,9);
		MathProcessor typ = new MathProcessor();
		typ.process(55,98);
		MathProcessor you = new MathProcessor();
		//int [] ints= new int[3];
		you.ints[0]=3;
		 you.ints[1]=2;
		 you.ints[2]=55;
		 System.out.println(Arrays.toString(you.ints));
	}

}
 

 class Processor {
	 
	 int [] ints= new int[3];
		
	 
//String [] Object= {"Hi", "Hello"};
	public void process(int i, int j) {
		System.out.printf("Processing two integers:%d, %d", i, j);
	}

	public void process(int[] ints) {
		System.out.println("Adding integer array:" + Arrays.toString(ints));
	}

	public void process(Object[] objs) {
		//System.out.println("Adding integer array:" + Arrays.toString(objs));
	}
}

class MathProcessor extends Processor {

	@Override
	public void process(int i, int j) {
		System.out.println("Sum of integers is " + (i + j));
	}

	@Override
	public void process(int[] ints) {
		int sum = 0;
		for (int i : ints) {
			sum += i;
		}
		System.out.println("Sum of integer array elements is " + sum);
	}

}