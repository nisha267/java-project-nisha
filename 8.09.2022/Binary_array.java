package binarysearch;

public class Binary_array {
	public static void binarysearch(int[] arr, int first, int last, int element) {
	
	int mid=(first+last)/2;
	while(first<=last) {
		if(arr[mid]==element)
		{System.out.println("Element is found"+mid);
	}
		if(arr[mid]<element) {
			first=mid+1;
		}else
			last=mid-1;}
		
	if(first>last) {System.out.println("Element is not found");}}


public static void main(String[]args) {int arr[]= {23,34,78,67,89};
int element=34;
int last=arr.length-1;
binarysearch(arr,0,last,element);
}}