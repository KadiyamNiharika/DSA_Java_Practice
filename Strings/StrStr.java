Problem: Find the Index of the First Occurrence in a String  
Platform: LeetCode  
Problem Number: 28  
Topic: Strings  
Approach: Iterate through the `haystack` string and extract a substring of length equal to `needle.length()`. Compare each substring with `needle`. If a match is found, return its starting index; otherwise, return -1.  
Time Complexity: O(n × m)  
Space Complexity: O(m)  
Status: Solved

class Solution {
    public int strStr(String haystack, String needle) {
         if(needle.isEmpty())
           return 0;
         int n=haystack.length();
         int m=needle.length();
         for(int i=0;i<=n-m;i++)
         {
            if(haystack.substring(i,i+m).equals(needle))
                 return i;
         }
         return -1;
    }
}