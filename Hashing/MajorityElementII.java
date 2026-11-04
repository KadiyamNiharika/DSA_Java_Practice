Problem: Majority Element II
Platform: LeetCode
Problem Number: 229
Topic: Hashing
Approach: Use a HashMap to count the frequency of each element and add elements whose frequency is greater than n/3 to the result list.
Time Complexity: O(n)
Space Complexity: O(n)
Status: Solved

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x:nums)
           hm.put(x,hm.getOrDefault(x,0)+1);
        for(int x:hm.keySet())
        {
            if(hm.get(x)>n/3)
               al.add(x);
        }
        return al;
    }
}