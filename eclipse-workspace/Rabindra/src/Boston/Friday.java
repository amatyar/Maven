package Boston;

import java.util.Arrays;

public class Friday {

	public static void main(String[] args)
	{
		int [][] number= 
			{
					{1,6,3} ,
					{8,16,13},
					{11,66,33}
				
			};
		for(int i =0; i < number.length; i++)
		{
			int [] num = number[i];
			for(int j =0; j < num.length; j++)
			{
				System.out.println(num[j]);
			}
			System.out.println(Arrays.toString(num));
		}
		
	}

}
