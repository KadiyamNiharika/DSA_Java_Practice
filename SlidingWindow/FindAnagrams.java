Problem: Find All Anagrams in a String  
Topic: Sliding Window, Hashing, Frequency Array  
Approach: Create frequency arrays for the pattern `p` and the first window of `s` of length `p.length()`. Slide the window by removing the outgoing character and adding the incoming character. If both frequency arrays match, add the starting index of the window to the result list.  
Time Complexity: O(n × 26), where n is the length of `s`  
Space Complexity: O(1) — two fixed-size frequency arrays of 26 characters  
Status: Solved

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        ArrayList<Integer> al=new ArrayList<>();
          if(n>s.length())
            return al;
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<n;i++)
        {
            f1[p.charAt(i)-'a']++;
            f2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2))
            al.add(0);
        for(int i=n;i<s.length();i++)
        {
            f2[s.charAt(i-n)-'a']--;
            f2[s.charAt(i)-'a']++;
            if(Arrays.equals(f1,f2))
                al.add(i-n+1);
        }
        return al;
    }
}