package day_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;


class PersonNoSupplier{
	private String name;
	private LocalDate birthDate;
	private LocalDate currentDate;
	
	
	public PersonNoSupplier(String name, LocalDate birthDate) {
		
		this.name = name;
		this.birthDate = birthDate;
		currentDate = LocalDate.now();
	}
	
	long getAgeInDays() {
		return ChronoUnit.DAYS.between(birthDate, currentDate);
	}
	
}


public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> sup= ()->"Java is running";
		System.out.println(sup.get());
		
		System.out.println("-=-=--=-=--=-=-=-=-==--==-=-=-=");
		
		PersonNoSupplier person= new PersonNoSupplier("Harsh", LocalDate.parse("2003-03-01"));
		System.out.println("The age is "+ person.getAgeInDays()+" days");
	}

}
