package class_1;


class Car{
	String registrationNumber;
	double price;
	@Override
	public String toString() {
		return "Car [registrationNumber=" + registrationNumber + ", price=" + price + "]";
	}
	public Car(String registrationNumber, double price) {
		super();
		this.registrationNumber = registrationNumber;
		this.price = price;
	}
	
	
}

@FunctionalInterface
interface DisplayCarDetails{
	String getCarDetails();
}

public class NonStaticMethod_Reference {
		public static void main(String[] args) {
//			DisplayCarDetails dc= new DisplayCarDetails() {
//				public String getCarDetails() {
//					Car c= new Car("JH-31 AB 1234",65000.00);
//					return "Registration Number " + c.registrationNumber+ " Price "+ c.price;
//					
//				}
//			};
			
//			DisplayCarDetails dc=() -> {
//				Car c= new Car("JH-31 AB 1234",65000.00);
//				return "Registration Number " + c.registrationNumber+ " Price "+ c.price;
//			};
			
			Car c= new Car("JH-31 AB 1234",65000.00);
			DisplayCarDetails dc= c:: toString;
			System.out.println(dc.getCarDetails());
		}
}
