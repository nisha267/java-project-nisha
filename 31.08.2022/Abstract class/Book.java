package abs.java;

public class Book extends Product{
	double ISBN=34562;String author="Premchand";String title="The galaxy of the sea";
	void ptbook() {
		System.out.println("ISBN: "+ISBN);
		System.out.println("Author: "+author);
		System.out.println("Title: "+title);
		System.out.println(super.product_id);
	}}
