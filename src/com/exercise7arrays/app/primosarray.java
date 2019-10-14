package com.exercise7arrays.app;
import java.util.Random;
public class primosarray {

	public static void main(String[] args)
	{
		// constant declaration
		final int elements_array=100;
		
		//variable declaration
		byte primenumbers=0;
		boolean isprime=true;
		
		//array declaration
		byte[] vector = new byte[elements_array];
		
		// object declaration
		Random randomnumbers = new Random(System.nanoTime());
		
		
		for (int i=0; i<elements_array; i++)
		{
			vector[i] = (byte) randomnumbers.nextInt(101);
		}
		
		for (int i=0; i<elements_array; i++)
		{
			for (int j=2; j<vector[i]; j++)
			{
				isprime=true;
				if(vector[i]%j==0)
				{
					isprime=false;
					break;
					}
			}
			if (isprime)
			{
				primenumbers++;
			}
				System.out.println(vector[i]);
		}

	}

}
