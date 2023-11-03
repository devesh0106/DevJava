package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // Program to determine whether two strings are the anagram
        //Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
        String str1 = "Grab";
        String str2 = "Brag";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] str1ToChar = str1.toCharArray();
        char[] str2ToChar = str2.toCharArray();

       if(str1.length()!=str2.length()){
           System.out.println("Not an Anagram");
       }
       else{
           Arrays.sort(str1ToChar);
           Arrays.sort(str2ToChar);
           if(Arrays.equals(str1ToChar,str2ToChar)){
               System.out.println("Anagram");
           }
           else{
               System.out.println("Not an Anagram");
           }
       }
    }
}
