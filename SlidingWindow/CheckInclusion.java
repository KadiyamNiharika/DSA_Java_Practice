Problem: Permutation in String  
Topic: Sliding Window, Hashing, Frequency Array  
Approach: Use two frequency arrays to count character occurrences in `s1` and the current window of `s2`. Slide the window of size `s1.length()` by adding the incoming character and removing the outgoing character. If both frequency arrays match, return `true`; otherwise, return `false` after checking all windows.  
Time Complexity: O(n + m × 26), where n is the length of `s2` and m is the length of `s1`  
Space Complexity: O(1) — two fixed-size arrays of 26 characters  
Status: Solved

class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int n=s1.length();
         if(n>s2.length())
            return false;
         int[] freq1=new int[26];
         int[] freq2=new int[26];
         for(int i=0;i<n;i++)
         {
             char ch1=s1.charAt(i);
             freq1[ch1-'a']++;
             char ch2=s2.charAt(i);
             freq2[ch2-'a']++;
         }
         if(Arrays.equals(freq1,freq2))
             return true;
         for(int i=n;i<s2.length();i++)
         {
            char ch=s2.charAt(i);
            freq2[ch-'a']++;
            freq2[s2.charAt(i-n)-'a']--;
            if(Arrays.equals(freq1,freq2))
             return true;
         }
         return false;
    }
}