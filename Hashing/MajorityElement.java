Problem: Majority Element  
Platform: LeetCode  
Problem Number: 169  
Topic: Hashing  
Approach: Use a HashMap to count the frequency of each element in the array. Iterate through the map and return the element whose frequency is greater than `n/2`.  
Time Complexity: O(n) average  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public int majorityElement(int[] nums) {
          HashMap<Integer,Integer> hm=new HashMap<>();
          int n=nums.length;
          for(int i=0;i<nums.length;i++)
          {
             hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
          }
          int max=1;
          int res=0;
          for(int x:hm.keySet())
          {
            if(hm.get(x)>(n/2) && hm.get(x)>=max)
            {
                max=hm.get(x);
                res=x;
            }
          }
        return res;
    }
}