package main;
public class Factorial {
	
	public int func ( long maxRange )
	{
		long num = 1;
		int i = 1;
		
		while( num < maxRange )
		{
			System.out.println("The Factorial of " + i + " = " + num);
			num = num * (i+1);
			i++;
		}
		System.out.println("The Factorial of " + i + " is out of range.");
		return i;
	}
	

}