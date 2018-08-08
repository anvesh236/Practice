package practice;

public class SumOfDigits {

	public static void main(String[] args)
	{
	
		int num =250;
		int sum =0;
		while(num!=0)
		{
			int lastdigit =num%10;
			sum= sum+lastdigit;
			num = num/10;
			
		}

		System.out.print("sum of its digits is"+sum);
	}

}
