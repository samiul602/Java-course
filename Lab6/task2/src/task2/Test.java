package task2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		int a[][]=new int[3][3],i,j,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				System.out.print("a["+i+"]["+j+"] ");
				a[i][j]=scan.nextInt();
			}
				
		}
		System.out.println(" The matrix is ");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++) 
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
	
		}
		System.out.println("Sum of main Diagonal="+sum);

	}

}
