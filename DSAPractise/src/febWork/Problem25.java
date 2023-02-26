package febWork;

import java.util.Scanner;

/*
 We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
 */
public class Problem25 {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the size of the array");
	        int size=sc.nextInt();
	        
	        int arr[]=new int[size];
	        for(int i=0;i<size;i++){
	        	System.out.println("Enter the element in the array of index "+i);
	            arr[i]=sc.nextInt();
	        }
	        int count=0;
	        for(int i=0;i<size;i++){
	            int sum=0;
	            for(int j=i;j<size;j++){
	                sum+=arr[j];
	                if(sum<0) count++;
	            }
	        }
	        System.out.println("Total subarray whose sum is negative are "+count);
	    }
}
