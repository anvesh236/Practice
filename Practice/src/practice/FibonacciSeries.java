package practice;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int num =10;
		int a, b=0, c=1;
		for (int i=1; i<=num; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
		}
		
	}

}
