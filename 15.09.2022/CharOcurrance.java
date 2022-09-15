//Write a program to find the first and the last occurence of the letter 'o'  in "Hello, World".
package string.com;

public class CharOcurrance {
	public static void main(String[]args) {
		String s="Hello,World";
		int count=0;
		boolean flag=false;
		
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='o') {
			flag=true;
			count=count+1;
		}
	
	
	}
	
	if(flag==true) {
		System.out.println("Character is found");
	}else {
		System.out.println("Character is not found");
	}
	
	System.out.println(count);

	

}
	}

