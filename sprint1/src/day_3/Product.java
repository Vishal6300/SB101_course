package day_3;

import java.util.Comparator;

public class Product implements Comparable<Product>{
	private int productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(int productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Product p) {
		if(p.price> p.getPrice()) {
			return -1;
		}else {
			return 1;
		}
	}

//	public int Comparator comp(Product p) {
//
//		if(p.price> p.getPrice()) {
//			return -1;
//		}else {
//			return 1;
//		}
//	}
	
	
	
}
