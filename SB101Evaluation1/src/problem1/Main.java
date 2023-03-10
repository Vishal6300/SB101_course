package problem1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
		Predicate<Product> product=q->q.getQuantity()<5;
		
		System.out.println(product.test(new Product(01,"Pen",30.00,25)));
		System.out.println(product.test(new Product(02,"Pencil",25.00,4)));
		
		Consumer<Product>consumer=p->System.out.println(p);
		
		consumer.accept(new Product(03,"sharpner",35.00,50));
		
		Supplier<Product>supplier=()->new Product(03,"sharpner",45.00,70);
		
		System.out.println(supplier.get());
		
		Function<Product, String> fn= p -> p.getProductId()+","+ p.getProductName()+","+p.getPrice()+","+p.getQuantity();
		
		System.out.println(fn.apply(new Product(1, "Pen", 20.00, 100)));
	}
}
