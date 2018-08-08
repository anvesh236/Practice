package practice;

public class DiamondPattern {

	public static void main(String[] args) {

		int rows = 3;

		char ch = '2';
		

		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= rows - i; j++) // it is used to give spaces

			{
				System.out.print(" ");
			}

			for (int j = 1; j <= i*2- 1; j++) // it is used to print stars.

			{
				System.out.print(ch);
			}
			System.out.println();

		}
		for (int i = rows - 1; i > 0; i--) 
		{
			for (int j = 1; j <= rows - i; j++)

			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++)

			{
			
				System.out.print(ch);
			   
			   
			}
			
			System.out.println();
		}

	}

}
