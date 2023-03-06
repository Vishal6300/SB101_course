package problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<GroceryItems> l = new ArrayList<GroceryItems>();
        l.add(new GroceryItems(432.0, "Maggie", 4));
        l.add(new GroceryItems(272.0, "Bread", 7));
        l.add(new GroceryItems(432.0, "Maggie", 4));
        l.add(new GroceryItems(221.0, "Pav", 16));
        l.add(new GroceryItems(572.0, "pasta", 10));
 
        System.out.println("before sorting");
        System.out.println("price"
                           + " "
                           + "Name"
                           + " "
                           + "usedFrequency");
        for (GroceryItems items : l) {
            System.out.println(items.getPrice() + " "
                               + items.getName() + " "
                               + items.getUsedFrequency());
        }
        System.out.println();
 
        System.out.println("After sorting(sorted by price)");
        System.out.println("price"
                           + " "
                           + "Name"
                           + " "
                           + "usedFrequency");
 
        // call the sort function
        Collections.sort(l, new PriceComp());
        for (GroceryItems items : l) {
            System.out.println(items.getPrice() + " "
                               + items.getName() + " "
                               + items.getUsedFrequency());
        }
        
//        Set<GroceryItems> set= new TreeSet<>();
//        
//        set.add(new GroceryItems(232.0, "Browine", 4));
//        set.add(new GroceryItems(272.0, "Mosanbi", 7));
//        set.add(new GroceryItems(432.0, "Maggie", 4));
//        set.add(new GroceryItems(221.0, "Biscuits", 16));
//        set.add(new GroceryItems(572.0, "pasta", 10));
//        
//        
//        set.forEach(s -> System.out.println(s));
//        Using Comaprator
        
//        Set<GroceryItems> setComp= new TreeSet<>(new PriceComp());
//        	setComp.add(new GroceryItems(432.0, "Header", 4));
//        	setComp.add(new GroceryItems(272.0, "Mango", 7));
//        	setComp.add(new GroceryItems(432.0, "Braed", 4));
//        	setComp.add(new GroceryItems(221.0, "PavBhaji", 16));
//        	setComp.add(new GroceryItems(572.0, "pasta", 10));
//        
	}
}
