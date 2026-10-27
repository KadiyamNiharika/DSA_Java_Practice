Problem: Valid Palindrome  
Platform: LeetCode  
Problem Number: 125  
Topic: Strings, Two Pointers  
Approach: Convert the string to lowercase and remove all non-alphanumeric characters. Store the cleaned string, reverse it using `StringBuilder`, and compare the original cleaned string with its reverse. If both are equal, return `true`; otherwise, return `false`.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
           return true;
        String s1=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
             if(Character.isLetterOrDigit(s1.charAt(i)))
                sb.append(s1.charAt(i));
        }
        String a=sb.toString();
        String res=sb.reverse().toString();
        if(a.equals(res))
           return true;
        else
           return false;
    }
}