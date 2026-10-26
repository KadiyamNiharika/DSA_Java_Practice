Problem: Rotate String  
Platform: LeetCode  
Problem Number: 796  
Topic: Strings  
Approach: Concatenate the string `s` with itself to create `s + s`. If `s` and `goal` have the same length and `goal` is a substring of the concatenated string, return `true`; otherwise, return `false`.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        String x=s.concat(s);
        if(n==m && x.contains(goal))
           return true;
        else
           return false;
    }
}