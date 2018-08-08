package practice;

public class StringReverse {

	public static void main(String[] args)
	{
	    String name = "anvesh",reverse ="";
	    int length = name.length();
	    for(int i=length-1;i>=0;i--)
	    {
	    	reverse = reverse+name.charAt(i);
	    }

	    System.out.println(reverse);
	}

}
