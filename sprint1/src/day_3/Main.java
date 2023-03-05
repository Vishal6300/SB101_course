package day_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static Comparator<Product> priceComp= new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
			
			if(o1.getPrice()> o2.getPrice()) {
				return 1;
			}else if(o1.getPrice()< o2.getPrice()) {
				return -1;
			}else {
				return 0;
			}
		}
		
	};
	public static void main(String[] args) {
		List<Product> list= new ArrayList<>();
		
		list.add(new Product(101,"Boat",670, 5));
		list.add(new Product(102,"Glasses",200, 20));
		list.add(new Product(103,"Lipstick",400, 7));
		list.add(new Product(104,"Spray",890, 15));
		list.add(new Product(105,"Mivi",1270, 35));

		
		System.out.println(list);
		
//		List<Product> filteredList= new ArrayList<>();
		
		List<Product> filteredList= list.stream().filter(s -> s.getQuantity()>10).collect(Collectors.toList());
		
		System.out.println(filteredList);
		
//		System.out.println(filteredList.stream().sorted((i1,i2) -> i1 < i2? -1:1).toList());
		Arrays.sort(filteredList, Product.comp());
	}

}
