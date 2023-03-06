package problem4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> ageList= Arrays.asList(18,20,24,45,34,67,24,19,72,61);
		
		List<Integer> check= ageList.stream().filter(s -> s>=18).collect(Collectors.toList());
		
		if(check.size()==ageList.size()) {
			System.out.println("You all can cast your vote");
		}else {
			System.out.println("Some or none will cast vote");
		}
		
//		Distinct age of Voters
		System.out.println(ageList.stream().distinct().collect(Collectors.toList()));
		
//		6th to 8th of Voters
		
		List<Integer> indexWise= ageList.stream().sorted().collect(Collectors.toList());
		for(int i=6;i<=8;i++) {
			System.out.println(indexWise.get(i));
		}
//		Total Age 
		int total=0;
		for(int i=0;i<ageList.size();i++) {
			total=total+ageList.get(i);
		}
		System.out.println(total);
		
		
		/*
		 State true or false:
			5.1 The BinaryOperator interface is a subinterface of the Function interface
			 such that both are SAM interfaces.
			 Answer: false;
			5.2 The BiConsumer interface is a subinterface of the Consumer 
			interface such that both are SAM interfaces.
			Answer: false;
		 */
	}

}
