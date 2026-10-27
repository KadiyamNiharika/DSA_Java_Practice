Problem: Isomorphic Strings  
Platform: LeetCode  
Problem Number: 205  
Topic: Strings, Hashing, HashMap  
Approach: Use a HashMap to map each character in `s` to its corresponding character in `t`. If a character already exists in the map, check whether it maps to the current character in `t`. Otherwise, ensure the target character is not already mapped to another character before storing the new mapping. Return `true` if all characters satisfy the mapping rules.  
Time Complexity: O(n) average  
Space Complexity: O(1) — at most a fixed number of character mappings  
Status: Solved

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if(hm.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
            {
                if(hm.containsValue(t.charAt(i)))
                   return false;
                hm.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}