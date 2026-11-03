Problem: Binary Subarrays With Sum
Platform: LeetCode
Problem Number: 930
Topic: Sliding Window
Approach: Use the difference between the number of subarrays with sum at most goal and at most goal - 1 to count subarrays with sum exactly equal to goal.
Time Complexity: O(n)
Space Complexity: O(1)
Status: Solved

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal)
    {
        return find(nums,goal)-find(nums,goal-1);
    }
    public int find(int[] nums, int goal) {
        if(goal<0)
           return 0;
        int left=0;
        int sum=0;
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            while(sum>goal)
            {
                 sum=sum-nums[left];
                 left++;
            }
            count=count+(right-left+1);
        }
        return count;
    }
}