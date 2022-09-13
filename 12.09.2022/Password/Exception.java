package password.com;



import java.util.Scanner;

import javax.naming.AuthenticationException;

public class Exception {
	


	public static void main(String[]args)throws AuthenticationFailureException {
		String s="Eden67";
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the password ");
			String p=sc.next();
			try {if(p.equals(s)) {
				System.out.println("welcome");}
			else {throw new AuthenticationFailureException("Incorrect password");}}
			
				catch(AuthenticatonFailureException e) {System.out.println(e.getMessage());
			
			
		}
	}

}



