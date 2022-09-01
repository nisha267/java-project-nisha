package en.java;

import java.util.Scanner;

public class ArrStr {
	public static void main(String[]args)
	{ 
	Scanner sc=new Scanner(System.in);
	String[]names=new String[5];
	
	for(int i=0;i<5;i++) {System.out.println("Enter the name of students "+i);
	names[i]=sc.next();
	}
	
	System.out.println("The names of the students ");
	for(int i=0;i<5;i++){ 
		System.out.println(names[i]);
	}}}
	
