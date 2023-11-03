package BugDetection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
* You have 2 strings S1 and s2 as the input. Check if the string S1 is palindrome of S2.
for example, if s1 = "hello" and s2 = "olleh" then result should be true and false for any other s2.

Please write the solution code that does not use additional memory.
* */
public class Palindrome {
    public boolean isPalindrome(String s1) {
        String s2="";
        // Your implementation code here...
        //Reverse S1
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println("Original String is "+ s1);
        System.out.println("Reversed String is "+ s2);
        System.out.println(s1.equals(s2));
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        Palindrome p= new Palindrome();
        p.isPalindrome("Devesh");
    }
}
