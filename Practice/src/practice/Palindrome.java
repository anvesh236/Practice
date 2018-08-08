package practice;

public class Palindrome {

	public static void main(String[] args)
	{
		int num = 555;
		int a =num;
		int reverse =0;
		while(num>0)
		{
			int lastdigit = num%10;
			reverse = reverse*10+lastdigit;
			num = num/10;
		}
		System.out.println(reverse);
		System.out.println(num);
		System.out.println(a);
		if (reverse ==a)
		{
			System.out.println("given no is a Palindrome number");
		}else
		{
			System.out.println("given no is not a Palindrome");
		}

	}

}
