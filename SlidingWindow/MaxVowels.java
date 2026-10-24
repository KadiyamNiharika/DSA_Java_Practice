Problem: Maximum Number of Vowels in a Substring of Given Length  
Topic: Sliding Window, HashSet, Strings  
Approach: Store the vowels (`a`, `e`, `i`, `o`, `u`) in a HashSet. Count the vowels in the first window of size `k`. Slide the window by removing the outgoing character's contribution and adding the incoming character's contribution. Update the maximum vowel count for each window.  
Time Complexity: O(n)  
Space Complexity: O(1) — the HashSet stores only five vowels.  
Status: Solved

class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> hs=new HashSet<>();
        hs.addAll(Arrays.asList('a','e','i','o','u'));
        int count=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(hs.contains(s.charAt(i)))
               count++;
        }
        max=count;
        for(int i=k;i<s.length();i++)
        {
            if(hs.contains(s.charAt(i-k)))
              count--;
            if(hs.contains(s.charAt(i)))
              count++;
            max=Math.max(count,max);
        }
        if(max==k)
           return k;
        return max;
    }
}