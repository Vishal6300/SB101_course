package febWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints

Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
 */
public class problem26 {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        List<Integer> list= new ArrayList<>();
	        for(int i=0;i<n;i++){
	            list.add(sc.nextInt());
	        }
	        int tc=sc.nextInt();
	        for(int i=0;i<tc;i++){
	            // sc.nextLine();
	            String call= sc.next();
	            if(call.equals("Insert")){
	                int index=sc.nextInt();
	                int ele=sc.nextInt();
	                list.add(index, ele);
	            }else if(call.equals("Delete")){
	                int index=sc.nextInt();
	                list.remove(index);
	            }
	        }
	        sc.close();
	        // list.forEach(e -> System.out.print(e+" "));
	        // StringBuilder str=new StringBuilder();
	        for(int i=0;i<list.size();i++){
	            System.out.print(list.get(i).toString()+" ");
	        }
	    }
}
