package string;

import java.util.Scanner;

public class StringMain {public static void main(String[]args)throws StringMismatchException{
	Scanner sc=new Scanner(System.in);
	String s="Ram%44";
	System.out.println(s);
	System.out.println("Enter the String same as above");
	String i=sc.nextLine();
	try {
		if(s.equalsIgnoreCase(i))
		{System.out.println("Matched");}
	else {
		throw new  StringMismatchException("not matched");}
	}catch(StringMismatchException e) {System.out.println(e.getMessage());
}
}
