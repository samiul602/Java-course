import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size ");
		int r=scan.nextInt();
		int c=scan.nextInt();
		int a[][]=new int [r][c];
		int b[][]=new int [r][c];
		int sum[][]=new int [r][c];
		int i,j;
	    
		
		System.out.println("Enter first matrix elements ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
				System.out.print("a["+i+"]["+j+"] ");
				a[i][j]=scan.nextInt();
			}
				
		}
		System.out.println(" The matrix is ");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
		
		System.out.println("Enter second matrix elements ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
				System.out.print("b["+i+"]["+j+"] ");
				b[i][j]=scan.nextInt();
			}
				
		}
		System.out.println(" The matrix is ");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
		
		
		// add
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
				sum[i][j]=a[i][j]+b[i][j];
				
			}
				
		}
		System.out.println("Sum of two matrix ");
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++) 
			{
			System.out.print(sum[i][j]+" ");
				
			}
			
			System.out.println();	
		}
		
		
	 }
}
