package problem6;

public class GroceryItems {
	
		private double price;
		private String name;
		private double usedFrequency;
		
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getUsedFrequency() {
			return usedFrequency;
		}
		public void setUsedFrequency(double usedFrequency) {
			this.usedFrequency = usedFrequency;
		}
		@Override
		public String toString() {
			return "GroceryItems [price=" + price + ", name=" + name + ", usedFrequency=" + usedFrequency + "]";
		}
		public GroceryItems(double price, String name, double usedFrequency) {
			super();
			this.price = price;
			this.name = name;
			this.usedFrequency = usedFrequency;
		}
		
		
}
