package class_1;

import java.util.Arrays;

class ArrayMinOperation{
	static int getSmallestElement(int arr[]) {
		int smallest= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallest > arr[i]) {
				smallest= arr[i];
			}
			
		}
		return smallest;
	}
	
}
@FunctionalInterface
interface ArrayMin{
	int getMinimumElement(int arr[]);
}
@FunctionalInterface
interface ArrayOperations{
	boolean isEquals(int arr[], int brr[]);
}

@FunctionalInterface
interface ConvertStringToInt{
	int convertToInt(String str);
}

public class StaticMethodReference {
	public static void main(String[] args) {
		ArrayOperations ae = Arrays::equals;
		System.out.println(ae.isEquals(new int[] {1,2,3}, new int[] {1,2,3}));
		System.out.println(ae.isEquals(new int[] {3,1,2}, new int[] {2,1,3}));
	
	ArrayMin am= ArrayMinOperation::getSmallestElement;
	System.out.println(am.getMinimumElement(new int[] {10,15,4,1,3,8}));
	
	ConvertStringToInt sc= Integer::parseInt;
	System.out.println(sc.convertToInt("10")+1);
	}
}
