package febWork;

import java.util.Scanner;

/*
 Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
 */
public class Problem16 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String str="";
        for(int i=start;i<end;i++){
            str+=S.charAt(i);
        }
        System.out.println(str);
    }
}
