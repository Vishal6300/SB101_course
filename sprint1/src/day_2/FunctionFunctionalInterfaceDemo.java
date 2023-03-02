package day_2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionFunctionalInterfaceDemo {

	public static void main(String[] args) {
		Function<String, Integer> fn= s -> s.length();
		System.out.println(fn.apply("Masai"));
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		Map<Integer, String> week= new HashMap<>();
		week.put(1, "Sunday");
		week.put(2, "Monday");
		week.put(3, "Tuesday");
		week.put(4, "Wednesday");
		week.put(5, "Thursday");
		week.put(6, "Friday");
		week.put(7, "Saturday");
		
		Function<Integer,String> weekFn= dayNumber -> {
			String dayName= null;
			
			switch(dayNumber){
			case 1:
				dayName ="Sun";
				break;
			case 2:
				dayName ="Mon";
				break;
			case 3:
				dayName ="Tues";
				break;
			case 4:
				dayName ="Wed";
				break;
			case 5:
				dayName ="Thr";
				break;
			case 6:
				dayName ="Fri";
				break;
			case 7:
				dayName ="Sat";
				break;
			}
		
			return dayName;
		};
		
		System.out.println(week);
		System.out.println(week.computeIfAbsent(1, weekFn));
		System.out.println(week);
		System.out.println(week.computeIfAbsent(4, weekFn));
		System.out.println(week);
		System.out.println(week.computeIfAbsent(3, weekFn));
	}

}
