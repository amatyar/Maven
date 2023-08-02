package Boston;

public class average 
{

	public static void main(String[] args) 
	{

// (x + y+ z)/3
		NoOfArg avg = new NoOfArg();
		int AV = avg.average(5, 7);
		System.out.println(AV);
		
		int AV1=avg.average(4, 6, 8);
		System.out.println(AV1);
		
		int AV2 = avg.average(1, 2, 3, 4);
		System.out.print(AV2);
	}

}
class NoOfArg {
    public int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public int average(int a, int b) {
        return (a + b) / 2;
    }

    public int average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }
}