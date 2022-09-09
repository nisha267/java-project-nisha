package sortingarray;

public class Bubble_sort {
	static void bubbleSort(int[]arr)
	{ int n=arr.length;
	  int temp=0;
	  for(int i=0;i<n;i++) {
		  for(int j=1;j<(n-i);j++) {
		  if(arr[j-1]>arr[j]) {
			  temp=arr[j-1];
			  arr[j-1]=arr[j];
			  arr[j]=temp;
		  }
	  }
	}

}
public static void main(String[]args)
{int arr[]= {34,56,89,23,12,57};
System.out.println("Array before sorting ");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");}
	System.out.println();
	bubbleSort(arr);
	System.out.println("Array after sorting ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}