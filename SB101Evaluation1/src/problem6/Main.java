package problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		ArrayList<GroceryItems> l = new ArrayList<GroceryItems>();
        l.add(new GroceryItems(322.0, "Sugar", 2));
        l.add(new GroceryItems(342.0, "Grain", 8));
        l.add(new GroceryItems(821.0, "Wheat", 16));
        l.add(new GroceryItems(251.0, "Bread", 6));
        l.add(new GroceryItems(572.0, "pasta", 4));
 
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
        Collections.sort(l, new PriceComparator());
//        Comparator comp = l.comparator();
        for (GroceryItems items : l) {
            System.out.println(items.getPrice() + " "
                               + items.getName() + " "
                               + items.getUsedFrequency());
        }
	}
}
