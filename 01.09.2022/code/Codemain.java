import java.util.Scanner;

public class Codemain {public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
codeclass[] I = new codeclass[5];
String a;
int b,total_cost=0;


for(int i=0;i<5;i++) {
  
  System.out.print("Enter code  for item"+(i+1)+" : ");
  a=sc.next();
  System.out.print("Enter price for item"+(i+1)+" : ");
 b=sc.nextInt();
  I[i] = new codeclass(a,b);
}

System.out.println("Item Code Item Price");
System.out.println("--------- ----------");
for(int i=0;i<5;i++)
{
  System.out.print("\t"+I[i].code);
  System.out.println("\t\t"+I[i].price);
  total_cost = total_cost + I[i].price;
}
System.out.print("Total Price = "+total_cost);
}
}



