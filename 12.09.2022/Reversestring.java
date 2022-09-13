// WAP to input a string and reverse it without using any inbuilt method.

package string;

public class Reversestring {
	public static void main(String[]args) {
		String s="Riya";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
