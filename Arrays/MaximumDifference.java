Problem: Maximum Difference Between Increasing Elements  
Platform: LeetCode  
Problem Number: 2016  
Topic: Arrays  
Approach: Use two pointers to compare elements where the second index is greater than the first index. Calculate the difference and update the maximum positive difference. If no increasing pair exists, return -1.  
Time Complexity: O(n²)  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int i=0,j=i+1;
        int max=-1;
        while(i<n && j<n)
        {
            if(nums[j]-nums[i]>max && nums[j]-nums[i]>0)
               max=nums[j]-nums[i];
            j++;
            if(j==n)
            {
                i++;
                j=i+1;
            }
        }
        return max;
    }
}