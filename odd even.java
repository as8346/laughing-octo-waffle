import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else 
		{
			System.out.print("Number is odd");
		}
			
	}
}