Problem: Is Subsequence  
Topic: Two Pointers, Strings  
Approach: Use two pointers to traverse both strings. If the characters match, increment the pointer for string `s`. Always increment the pointer for string `t`. If the pointer for `s` reaches its length, return `true`; otherwise, return `false`.  
Time Complexity: O(n) where n is the length of `t`  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                 i++;
            }
            j++;
        }
        return s.length()==i;
    }
}