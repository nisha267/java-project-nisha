/*Create a class called Shape which has a property side.
Create a subclass of Shape called Square which should use the property of 
Shape class to display area of square
Note: Take input*/
package variousshapes;
import java.util.Scanner;


public class Shapemain {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	Square sq=new Square();
	System.out.println("Enter the side");
	sq.s=sc.nextInt();
	sq.Area();
	
	
}

}
