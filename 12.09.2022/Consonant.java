package string;

public class Consonant {public static void main(String[]args)
	{
	String s="Hello,have a good day";
	for (int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{System.out.print(s.charAt(i));
	}else {continue;}
	}
	}
}

