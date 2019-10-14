package com.exercise7arrays.app;
import java.util.Random;
public class randonnumbers {

	public static void main(String[] args)
	{
		final int elements_array = 100;
		
		
		// arrays declaration
		byte[] miArray1 = new byte[elements_array];
		byte evenvalues=0;
		byte oddvalues=0;
		byte zerovalues=0;
		byte positivevalues=0;
		byte negativevalues=0;
		//variables declaration 
		double generatednumber=0;
		int generatednumberint=0;
		byte generatednumberbyte=0;
		//array pseudo random numbers
		// way 1 by means of random class
		Random randomnumbers = new Random(System.nanoTime());
		
		
		for (int i=0; i<elements_array;i++)
		{
			generatednumber = randomnumbers.nextDouble();
			System.out.println(generatednumber);
		}

		for (int i=0; i<elements_array;i++)
		{
			generatednumberint = randomnumbers.nextInt(51)+50;
			System.out.println(generatednumberint);
		}
		
		// way 2 by means of math class

		for (int i=0; i<elements_array;i++)
		{
			generatednumber = Math.random()*100;
			generatednumberint = (int) generatednumber; 
			System.out.println (generatednumberint);
		}
		// pass 1 initialize

		for (int i=0; i<miArray1.length;i++)
		{
		generatednumberint = randomnumbers.nextInt();
			//System.out.println(generatednumberint);
		miArray1[i] = generatednumberbyte;
		}
	     //pass 2 process
		for (int i=0; i<elements_array; i++)
		{
			if (miArray1[i]==0)
			{  
				zerovalues++;
			}
			else if (miArray1[i]%2==0)
			{
				evenvalues++;
			}
			else if (miArray1[i]%2==1)
			{
				oddvalues+=1;
			}
			else if (miArray1[i]>0)
			{
				positivevalues+=1;
			}
			else if (miArray1[i]<0)
			{
				negativevalues+=1;
			}
		}
		
		
		//pass 3 visualization
		System.out.println("zero quantity: "+zerovalues);
		System.out.println("odd values"+oddvalues);
		System.out.println("even values"+evenvalues);
		System.out.println("positive values"+positivevalues);
		System.out.println("negative values"+negativevalues);
		

	}

	
}
