package string;

import java.util.Scanner;

import javax.naming.AuthenticationException;

public class Exception {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s,t;
		try {
			System.out.println("Enter the password ");
			s=sc.nextLine();
			if(!s.equals("786rt")) {
				throw new AuthenticationException("Incorrect password");
				else
					System.out.println("Welcome");
			}
		}catch(Stringpassword e) {
			System.out.println(e);
		}catch(IOException es) {}
			
			
		}
	}


