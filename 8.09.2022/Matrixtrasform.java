package matrix;

public class Matrixtrasform {
	public static void main(String[]args)
	{int arr[][]= {{2,7,8},{3,5,6},{7,9,3}};
	System.out.println("The original matrix ");
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		System.out.print(arr[i][j]+" ");
	}
    System.out.println();
}
	System.out.println("The transpose matrix ");
	for(int i=0;i<3;i++)
	{for(int j=0;j<3;j++) {
		System.out.print(arr[j][i]+" ");
	}
    System.out.println();
}
	}
}