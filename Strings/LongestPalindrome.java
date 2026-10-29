Problem: Longest Palindromic Substring
Platform: LeetCode
Problem Number: 5
Topic: Strings
Approach: For each index, consider it as the center of both odd-length and even-length palindromes. Expand outward while the characters on both sides match. Calculate the palindrome length and update the starting and ending indices whenever a longer palindrome is found. Return the longest palindromic substring.
Time Complexity: O(n²)
Space Complexity: O(1)
Status: Solved

class Solution {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        for(int i=0;i<s.length();i++)
        {
            int len1=find(s,i,i);
            int len2=find(s,i,i+1);
            int max=Math.max(len1,len2);
            if(max>end-start+1)
            {
                start=i-(max-1)/2;
                end=i+max/2;
            }

        }
         return s.substring(start,end+1);
    }
        public static int find(String s,int left,int right)
        {
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            return right-left-1;
        }
}
