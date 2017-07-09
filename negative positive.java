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
		if(a>0)
		{
			System.out.println("The number is postive");
		}
		else if (a<0)
		{
			System.out.println("The  number is negative");
			
		}
		else
		{
			System.out.println("The number is zero");
		}
	}
}