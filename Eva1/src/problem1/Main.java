package problem1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Function<Product, String> fn= p -> p.getProductId()+","+ p.getProductName()+","+p.getProductPrice()+","+p.getQuantity();
		
		System.out.println(fn.apply(new Product(1, "Pen", 20.00, 100)));
		
		Supplier<Product> supplier=() -> new Product(2,"Pencil",5.00,300);
		System.out.println(supplier.get()); 
		
		Consumer<Product> con=p -> System.out.println(p);
		con.accept(new Product(3,"Notebook",40.00,70));
		
		Predicate<Product> pred=quan -> quan.getQuantity()<5;
		
		System.out.println(pred.test(new Product(4,"Eraser",50.00,4)));
		System.out.println(pred.test(new Product(5,"Book",500.00,40)));
		System.out.println(pred.test(new Product(6,"Sharpner",10.00,3)));
	}

}
