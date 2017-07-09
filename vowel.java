import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		{
			System.out.println("It is a vowel");
		}
		else 
		{
			System.out.print("It is a consonant");
		}
			
	}
}