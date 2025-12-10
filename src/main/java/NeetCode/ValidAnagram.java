package NeetCode;

import java.util.Arrays;

/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
* */
public class ValidAnagram {
    public static boolean validAnagram(String s1, String s2){
        int s1Len= s1.length();
        int s2Len= s2.length();

        char[] s1Char= s1.toCharArray();
        char[] s2Char= s2.toCharArray();
        Arrays.sort(s1Char);
        Arrays.sort(s2Char);
        boolean result = Arrays.equals(s1Char,s2Char);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(validAnagram("raca","care"));
    }
}
