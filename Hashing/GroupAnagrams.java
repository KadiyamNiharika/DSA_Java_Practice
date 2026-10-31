Problem: Group Anagrams  
Platform: LeetCode  
Problem Number: 49  
Topic: Hashing  
Approach: Use a HashMap where the sorted version of each string acts as the key. Sort the characters of each string and use the sorted string as a key to group anagrams together. Store the original strings in the corresponding list and return all grouped anagrams.  
Time Complexity: O(n × k log k), where n is the number of strings and k is the maximum string length  
Space Complexity: O(n × k)  
Status: Solved


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            if(hm.containsKey(str))
            {
                List<String> al=hm.get(str);
                al.add(s);
                hm.put(str,al);
            }
            else
            {
                List<String> al=new ArrayList<>();
                al.add(s);
                hm.put(str,al);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(String s:hm.keySet())
        {
             res.add(hm.get(s));
        }
        return res;
    }
}