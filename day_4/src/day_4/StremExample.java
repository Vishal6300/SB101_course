package day_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremExample {

	public static void main(String[] args) {
	List<String> nameList=new ArrayList<>();
	nameList.add("Bhavya");
	nameList.add("Amandeep");
	nameList.add("Sudip");
	nameList.add("Lavis");
	
	System.out.println(nameList.stream().allMatch(s -> s.length()>3) );
	System.out.println(nameList.stream().anyMatch(s -> s.length()<4) );
	System.out.println(nameList.stream().noneMatch(s -> s.length()>5) );
	System.out.println(nameList.stream().count());
	List<Integer> listInt= Arrays.asList(10,10,20,30,30,40,50);
	
	System.out.println();
	System.out.println(listInt.stream().collect(Collectors.averagingDouble(i -> i*1.0)));
	System.out.println(listInt.stream().distinct().collect(Collectors.toSet()));
	System.out.println();
	
	System.out.println(listInt.stream().reduce(0,(i1,i2)-> i1+i2));
	
	}

}
