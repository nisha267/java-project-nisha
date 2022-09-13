package string;

import java.util.Scanner;

public class Removeeven {public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the text");
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++) {
		if(!(i%2==0)) {continue;
			
		}else {System.out.print(s.charAt(i));
	}
}

}}
