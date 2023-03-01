package day_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceForParticularObjectDemo {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(10,78,0,5,79,15,36,25);
		System.out.println(list);
		
		Collections.sort(list, Integer::compareTo);
		System.out.println(list);
	}
}
