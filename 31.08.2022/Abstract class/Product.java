package abs.java;

public class Product extends AbstractProduct {
	int price=3457000;
	void print() {System.out.println("The price of the product: "+price);
	System.out.println("The id of the product: "+super.product_id);
	}
}
