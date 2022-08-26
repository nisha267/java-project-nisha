\*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.*\
import java.util.Scanner;

public class main {
	public static void main (String[]args)
	{ Triangle object=new Triangle();
	char exit;
	do
	{Scanner sc=new Scanner(System.in);
	System.out.println("Enter A for area & p for Perimeter");
	char choice=sc.next().charAt(0);
	if(choice=='p')
	{System.out.print("a:");
	int a=sc.nextInt();
	System.out.print("b:");
	int b=sc.nextInt();
	System.out.print("c:");
	int c=sc.nextInt();
	int pf=object.p(a, b, c);
	System.out.println(pf);
	System.out.print("Length");
	int l=sc.nextInt();
	}
	else if(choice=='A')
	{System.out.print("Length");
	int l=sc.nextInt();
	System.out.print("Height");
	int h=sc.nextInt();
	int af=object.ar(l,h);
	System.out.println(af);}
	else
	{System.out.println("Enter P or A only");}
	
	System.out.println("If you want to continue enter Y or N");
	exit=sc.next().charAt(0);}
	while(exit=='Y');
	
	
	
	}

}
