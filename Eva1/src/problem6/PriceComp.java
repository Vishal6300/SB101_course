package problem6;

import java.util.Comparator;

public class PriceComp implements Comparator<GroceryItems>{

	@Override
	public int compare(GroceryItems l1, GroceryItems l2) {
		if (l1.getPrice() == l2.getPrice()) {
            return 0;
        }
        else if (l1.getPrice() < l2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
	}

}
