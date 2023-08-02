package Boston;

import java.util.Arrays;

public class OnArrayOverLoading 
{
	public static void main(String[] args) 
	{
		int[] iarr = {4,5,9,3,8,1};
		String[] sarr= {"Hello", "Boston", "Cambridge","Alston","Northeastern"};
		Character[] carr= {'H', 'E','L','L','O'};
		Double[] darr= {11.23,23.65,36.54,3359.56,25.47 };
		
		OverloadingMethod om = new OverloadingMethod();
		om.ArrayOn(iarr);
		om.ArrayOn(sarr);
		om.ArrayOn(carr);
		om.ArrayOn(darr);

	}
}
class OverloadingMethod
{
	public void ArrayOn(int arr[])
	{
		System.out.println("The interger array is here:");
		// all array is on for each loop
		for(int i : arr) 
		{
			//System.out.println(i);
		}
		System.out.println(Arrays.toString(arr));
	}		
	
	public void ArrayOn(String arr[])
	{
		System.out.println("The String array is here:");
		for(String i : arr)
		{
			
		}System.out.println(Arrays.toString(arr));
	}
	public void ArrayOn(Character arr[])
	{
		System.out.println("The Character array is here:");
		for(Character i : arr)
		{
			
		}System.out.println(Arrays.toString(arr));
	}
	public void ArrayOn(Double arr[])
	{
		System.out.println("The double array is here:");
		for(double i: arr) 
		{
			
		}System.out.println(Arrays.toString(arr));
	}
	
}