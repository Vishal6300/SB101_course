package febWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

 contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13
Sample Output

prime
 */
public class Problem13 {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        // int count=0;
        // int n1= Integer.parseInt(n);
        BigInteger b1=new BigInteger(n);
       
        if(b1.isProbablePrime(1)){
           System.out.println("prime"); 
        }else{
            System.out.println("not prime");
        }
        // if(b1.isProbablePrime(1)) System.out.println("prime");
        // else System.out.println("not prime");
    }
}
