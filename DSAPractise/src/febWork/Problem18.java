package febWork;

import java.util.Scanner;

/*
 A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
 */
public class Problem18 {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a String or a number");
	        String A=sc.next();
	        String temp="";
	        for(int i=A.length()-1;i>=0;i--){
	            temp+=A.charAt(i);
	        }
	        if(A.equals(temp)) System.out.println("Yes");
	        else System.out.println("No");
	                /* Enter your code here. Print output to STDOUT. */
	        
	    }
}
