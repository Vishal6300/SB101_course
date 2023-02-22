package febWork;

import java.util.Scanner;

/*
 Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Returns

boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
Input Format

The first line contains a string .
The second line contains a string .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
 */
public class Problem19 {
	static boolean isAnagram(String a, String b) {   
        int countA = 0;
        int countB = 0;     
        
        if (a.length() != b.length()){
            return false;
        }
        
        for (int i = 0; i < a.length(); i++){
            for (int j = 0; j < b.length(); j++){
                if (a.toLowerCase().charAt(i) == a.toLowerCase().charAt(j)){
                    countA++;
                }
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)){
                    countB++;
                }
            } 
            if (countA != countB){
                return false;
            }          
        }
        
        return true;
    } 

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
