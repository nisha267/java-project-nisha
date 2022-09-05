package java.exception;

public class Tempmain {
static void check(double t)throws TooHot,TooCold{
	if(t>5)
		throw new TooHot("Too hot");
	else if(t<5)
		throw new TooCold("Too cold");
	else { System.out.println("Normal temparature");
	double f=(t*(9/5))*32;
	System.out.println("temparature in farenhite is"+f+"F");
	public static void main(String[]args) {
		try { Tempmain.check(23);
		
		}catch(TooHot e) {System.out.println(e.getMessage());
	}catch(TooCold e) {
		System.out.println(e.getMessage());
	}
	}
}

