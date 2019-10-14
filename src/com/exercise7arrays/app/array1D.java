package com.exercise7arrays.app;

public class array1D {

	public static void main(String[] args)
	{
		//constant declaration 
		final int elements_Array = 10;
		// Arrays declaration 
		// 1st way
		int[] intArray = new int[elements_Array];
		char[] charArray = new char[elements_Array];
		boolean[] boolArray = new boolean[elements_Array];
		double[] dblArray = new double[elements_Array];
		String[] strArray = new String[elements_Array];
		
		int[] intArray2 = {10, 20, 30, 40, 50, 60};
		char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
		boolean[] boolArray2 = {true, false, true, false, true};
		double[] dblArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"first", "second", "third", "fourth"};
		
		for (int i=0; i<intArray2.length;i++)
		{
			System.out.println(intArray2[i]);
		}
		for (int i=0; i<charArray2.length;i++)
		{
			System.out.println(boolArray2[i]);
		}
		
		
		for (int i=0; i<boolArray2.length;i++)
		{
			System.out.println(boolArray2[i]);
		}
		for (int i=0; i<dblArray2.length;i++)
		{
			System.out.println(dblArray2[i]);
		}
		for (int i=0; i<strArray2.length;i++)
		{
			System.out.println(strArray2[i]);
		}

	}

}
