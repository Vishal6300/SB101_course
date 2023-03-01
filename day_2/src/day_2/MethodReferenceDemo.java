package day_2;

//import org.apache.commons.lang3.StringUtils;

class ArrayUtility{
	static int getMinimum(int arr[]) {
		int min= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
}
interface ArrayOperations{
	int findMinimumElementFromArray(int arr[]);
}
interface StringOperations{
	boolean containsNoChar(String original, String source);
}


@FunctionalInterface
 interface ConvertStringToNumber {
	int convertToInt(String value);
}
public class MethodReferenceDemo {
	public static void main(String[] args) {
//		ConvertStringToNumber c= value -> Integer.parseInt(value);
		ConvertStringToNumber c= Integer:: parseInt;
		System.out.println(c.convertToInt("10")+1);
		
		ArrayOperations ao= ArrayUtility:: getMinimum;
		System.out.println(ao.findMinimumElementFromArray(new int[] {10,20,5,78,0}));
	
//		StringOperations so= StringUtils:: containsNone;
//		System.out.println(so.containsNoChar("abc", "xyz"));
	}
}
