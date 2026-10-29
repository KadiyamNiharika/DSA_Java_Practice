Problem: Palindromic Substrings  
Platform: LeetCode  
Problem Number: 647  
Topic: Strings  
Approach: Expand around each index to count odd-length and even-length palindromic substrings. Increment the count whenever the characters on both sides match, and return the total count.  
Time Complexity: O(n²)  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public int countSubstrings(String s) {
               int count=0;
               int n=s.length();
               for(int i=0;i<n;i++)
               {
                  int len1=find(s,i,i);
                  int len2=find(s,i,i+1);
                  count=count+(len1+len2);
               }
               return count;
        }
        public static int find(String s,int st,int e)
        {
            int c=0;
            while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e))
            {
                st--;
                e++;
                c++;
            } 
            return c;
        }
}