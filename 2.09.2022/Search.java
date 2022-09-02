/*1. Write a java program to input 5 elements of an array and search for a number whether it is present in an array or not. If present print its position in the array.*/

package javaarray;

import java.util.Scanner;

public class Search {public static void main(String args[]) 
		{ Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s=sc.nextInt();
		int[]arr=new int[s];
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
System.out.println("Enter the value you want to search ");
int search=sc.nextInt();
for(int i=0;i<arr.length;i++)
{if(arr[i]==search)
{System.out.println("The position of the element in array is "+i);
}
	
}

}}
