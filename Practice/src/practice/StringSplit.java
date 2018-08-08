package practice;

public class StringSplit {

	public static void main(String[] args)
	{
		String name = "anvesh";
		String substg = name.substring(0, 3);             // Substring
		System.out.println(substg);
		String [] a = name.split("v");
		for(String b:a)
		{
			System.out.println(b);
		}

	}

}
