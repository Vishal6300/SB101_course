package psc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class Comp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1>o2? -1:1;
	}
	
	
}
class marksComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks()>o2.getMarks()) {
			return 1;
		}else if(o1.getMarks()<o2.getMarks()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}


public class Demo {

	public static void main(String[] args) {
		List<Integer> arrList= new ArrayList<>();
		
		arrList.add(34);
		arrList.add(57);
		arrList.add(34);
		arrList.add(88);
		arrList.add(25);
		arrList.add(null);
				
//		System.out.println(arrList);
		
		List<Integer> linkList= new LinkedList<>();
		
		linkList.add(34);
		linkList.add(57);
		linkList.add(34);
		linkList.add(88);
		linkList.add(25);
		linkList.add(null);
				
//		System.out.println(linkList);
		
		int arr[] = {12,13,45,56};
//		System.out.println(arr.toString());
		
List<Integer> arrayList= Arrays.asList(34,43,76,87,27,89,90);

Collections.sort(arrayList);
	
//		System.out.println(arrayList);
		
		
		Vector<Integer> vector= new Vector<>();
		vector.add(23);
		vector.add(65);
		vector.add(28);
		vector.add(95);
		vector.add(57);
		
//		System.out.println(vector);
		
		Stack<Integer> stack= new Stack<>();
		
		stack.push(12);
		stack.push(34);
		stack.push(65);
		stack.push(46);
		stack.push(29);
		
//		System.out.println(stack);
		stack.pop();
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack);
		
		Set<Integer> set= new HashSet<>();
		
		set.add(34);
		set.add(34);
		set.add(54);
		
//		System.out.println(set);
		
		Set<String> stringSet= new HashSet<>();
				
		stringSet.add("Java");
		stringSet.add("MERN");
		stringSet.add("Java");
		
//		System.out.println(stringSet);
		
		
		Set<Integer> linkSet= new LinkedHashSet<>();
		
		linkSet.add(34);
		linkSet.add(85);
		linkSet.add(47);
		linkSet.add(49);
		linkSet.add(25);
		
//		System.out.println("Example of LinkedHashSet "+ linkSet);
		
		List<Student> list= new ArrayList<>();
		
		list.add(new Student(12,"Deepak",450));
		list.add(new Student(13,"Deepu",350));
		list.add(new Student(14,"ritik",450));
		
		
		Set<Student> treeSet= new TreeSet<>(new marksComp());
		treeSet.addAll(list);
		
//		System.out.println(treeSet);
		
		Map<String, Integer> map= new HashMap<>();
		
		map.put("Rakesh", 350);
		map.put("Mohan", 678);
		map.put("Mohan", 900);
		map.put("Rohan", 350);
		map.put("Roshan", 678);
		map.put("Sanni",450);
		
//		System.out.println(map);
//		
//		Set<String > keySet= map.keySet();
//		
//		Collection<Integer> col= map.values();
//		
//		List<Integer> keyOfList= new ArrayList<>(col);
//		
//		System.out.println(keyOfList);
		
		Set<Map.Entry<String, Integer>> set1= map.entrySet();
		
		for(Map.Entry<String, Integer> s : set1) {
			System.out.println(s.getKey()+"---"+ s.getValue());
		}
		
		Map<String, Integer> treeMap= new TreeMap<>(map);
		
		System.out.println(treeMap);
	}

}
