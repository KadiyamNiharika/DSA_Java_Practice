Problem: Remove Duplicates from Sorted Array  
Platform: LeetCode  
Problem Number: 26  
Topic: Arrays, Two Pointers  
Approach: Use a pointer `k` to track the position where the next unique element should be placed. Traverse the sorted array from index 1. Whenever the current element differs from the previous unique element (`nums[k-1]`), place it at `nums[k]` and increment `k`. Return `k` as the number of unique elements.  
Time Complexity: O(n)  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[k-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k; 
    }
}