Problem: Rearrange Array Elements by Sign  
Platform: LeetCode  
Problem Number: 2149  
Topic: Arrays  
Approach: Create a result array and use two pointers: `positive` starts at index 0 and `negative` starts at index 1. Place positive numbers at even indices and negative numbers at odd indices, incrementing each pointer by 2 after insertion.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved


class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       int positive=0,negative=1;
       for(int i=0;i<n;i++)
       {
         if(nums[i]>=0)
         {
            res[positive]=nums[i];
            positive=positive+2;
         }
         else
         {
            res[negative]=nums[i];
            negative=negative+2;
         }
       }
       return res;
    }
}