package javainvoice;

public class mainc {
	public static void main(String[]args)
	{invoice i1=new invoice("a20123","t&t company",189,246);
	System.out.println("Invoice amount of the first item "+i1.getInam());
	
	invoice i2=new invoice("a20124","Sons company",154,446);
System.out.println("invoice amount of the second item "+i2.getInam());
}
}