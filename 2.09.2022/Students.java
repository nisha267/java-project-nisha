/* Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/
package javaarray;

import java.util.Scanner;

public class Students {
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	int r,sub1,sub2,sub3,avarage=0;
	for(int i=0;i<=8;i++) {
		for(int j=i;j<=8;j++)
	{ System.out.println("Enter the roll no of the students");
	r=sc.nextInt();
	System.out.println("Enter the no which is got in first subject");
	sub1=sc.nextInt();
	System.out.println("Enter the no which is got in second subject");
	sub2=sc.nextInt();
	System.out.println("Enter the no which is got in third subject");
	sub3=sc.nextInt();
	avarage=(sub1+sub2+sub3)/3;
	System.out.println("Roll Number: "+r+" got Avarage mark: "+avarage);
	}
	
	}
}}
