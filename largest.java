import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int o=sc.nextInt();
		System.out.println("Enter 3rd number:");
		int p=sc.nextInt();
		int large;
		large=n;
		if(o>large)
		{	
			large=o;
			System.out.println("The largest number is:"+o);
		}
		else if(p>large) 
		{
			large=p;
			System.out.println("The largest number is:"+p);
		
		}
		else
		{
			System.out.println("The largest number is:"+n);	
		}
	}
}