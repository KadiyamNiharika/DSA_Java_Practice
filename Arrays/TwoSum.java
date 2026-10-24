Problem: Two Sum  
Topic: HashMap  
Approach: Calculate the complement (target - nums[i]) and check whether it exists in the HashMap. If found, return both indices; otherwise, store the current element and its index.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
            int x=target-nums[i];
            if(hm.containsKey(x))
            {
              return new int[] {hm.get(x),i};
            }
            hm.put(nums[i],i);
         }
       return new int[] {-1,-1};
    }
}