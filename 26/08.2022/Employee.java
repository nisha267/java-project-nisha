/*Create a class called Employee having the following attributes:
pan no
name
Annual taxable income*/



package javaemp1;

public class Employee {
 String pan_no;
String name;
int antaxin;
Employee(String p,String n,int a)
{
pan_no=p;
name=n;
antaxin=a;
if(a<100000)
{System.out.println("no tax payable");
}
else if(a<150000)
{System.out.println((a-100000)*0.1);
}
else if(a<250000)
{System.out.println(((a-150000)*0.2)+5000);}
else {System.out.println(((a-250000)*0.3)+25000);
}
}
}
	


