package com.exercise7arrays.app;

public class Arrays2D
{

	public static void main(String[] args)
	{
		// constant declaration
		final int rows=10;
		final int cols=10;
		int cont=0;
		//array 2D
		int[][] matrix = new int[rows][cols];
		
		for (int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix[i][j]=cont;
				cont++;
			}
		}
		for (int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
			
			
	
			
		

	}

}
