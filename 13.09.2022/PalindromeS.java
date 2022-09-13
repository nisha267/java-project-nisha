import java.util.Scanner;

//WAP to input a string and check whether it is palindrome or not
public class PalindromeS {public static void main(String[]args) 
{
	Scanner sc=new Scanner(System.in);
	String a,b=" ";
	System.out.println("Enter a word to know if it is palindrome or not ");
	a=sc.nextLine();
	for(int i=a.length()-1;i>=0;i--) {b=b+a.charAt(i);}
	if(a.equalsIgnoreCase(b)) 
		System.out.println("The word is palindrome");
	else System.out.println("The word is not palindrome");

}}


