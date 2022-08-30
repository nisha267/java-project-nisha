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
