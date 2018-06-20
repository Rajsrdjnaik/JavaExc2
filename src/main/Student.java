package main;

public class Student {

	int avg,min,max,count;
	int sum =0;
	
	public double funct(int[] g)
	{
		for(int i=0;i<g.length;i++)
		{
			sum+= g[i];
		}
		avg = sum/g.length;
		System.out.println(avg);
		return avg;
	}
	
	public int funct1(int[] g)
	{
		min = g[0];
		for(int i=0;i<g.length;i++)
		{
			if(min>g[i])
				min = g[i]; 
		}
		return min;
	}
	public int funct2(int[] g)
	{
		max = g[0];
		for(int i=0;i<g.length;i++)
		{
			if(max<g[i])
				max = g[i]; 
		}
		return max;
	}
	
}


