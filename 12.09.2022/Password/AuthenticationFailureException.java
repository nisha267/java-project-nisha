//2. Write a program to accept a password from the user and throw 'Authentication Failure' exception if the password is incorrect.

package password.com;


public class AuthenticationFailureException extends Exception{
	public AuthenticationFailureException(String msg){
		super(msg);
	}

}



