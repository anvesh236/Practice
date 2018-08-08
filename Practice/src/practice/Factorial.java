package practice;

public class Factorial {

	public static void main(String[] args)
	{
		int num = 10;
		int a =num;
		for(int i=1; i<a; i++)
		{
			num = num*i;       //5*1,5*2,10*3,30*4
		}
           System.out.println("Factorial of given no is:"+num);
	}

}
