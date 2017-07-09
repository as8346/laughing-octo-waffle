import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any charachter :");
		char n=sc.next.charAt(0);
		
	    if(n>='a'&&n<='z'||n>='A'&&n<='Z')
		{	System.out.println("It is an alphabet");
		}
		else 
		{
			System.out.print("Not an alphabet");
		}
			
	}
}