package febWork;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer, , denoting the number of integer strings.
Each line  of the  subsequent lines contains a real number denoting the value of .

Constraints

Each  has at most  digits.
Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000
Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
 */
public class Problem12 {
	 public static void main(String []args){
	        //Input
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter total numberst to input");
	        int n=sc.nextInt();
	        System.out.println("Enter the numbers one by one");
	        String []s=new String[n+2];
	        for(int i=0;i<n;i++){
	            s[i]=sc.next();
	        }
	      	sc.close();
	        
	         String str[] = new String[200];
	       for(int i=0;i<n;i++)
	        {
	            str[i] = s[i];
	        }
	        for(int i=0;i<n;i++)
	        {   
	            for(int j=i+1;j<n;j++)
	            {
	                BigDecimal a = new BigDecimal(s[i]);
	                BigDecimal b = new BigDecimal(s[j]);
	                if(a.max(b)!=a)
	                {
	                    String swap = s[i];
	                    s[i] = s[j];
	                    s[j]=swap;
	                }
	            }
	        }
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	            BigDecimal a = new BigDecimal(s[i]);
	            BigDecimal b = new BigDecimal(str[j]);
	             if(a.equals(b))
	             {
	                 s[i]=str[j];
	                 for(int c=j+1;c<n;c++)
	                 {
	                    BigDecimal d = new BigDecimal(str[c]);
	                     if(b.equals(d))
	                     {
	                         str[j]=str[c];
	                     }
	                 }
	              j=n;
	             }
	            }
	        }

	        //Output
	        System.out.println("The sorted numbers are");
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(s[i]);
	        }
	    }
}
