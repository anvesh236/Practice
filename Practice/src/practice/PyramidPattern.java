package practice;

public class PyramidPattern {

	public static void main(String[] args)
	{
		int n = 5;

		char ch = '*';

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n - i; j++) // it is used to give spaces.

			{
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) // it is used to print stars.

			{
				System.out.print(ch);
			}
			System.out.println();

		}	

	}

}
