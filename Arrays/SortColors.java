Problem: Sort Colors  
Platform: LeetCode  
Problem Number: 75  
Topic: Arrays, Counting  
Approach: Count the occurrences of 0s, 1s, and 2s in the array. Then overwrite the array by placing all 0s first, followed by 1s and then 2s, based on their respective counts.  
Time Complexity: O(n)  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public void sortColors(int[] nums) {
         int  c0=0,c1=0,c2=0;
         int n=nums.length;
         for(int i=0;i<n;i++)
         {
            if(nums[i]==0)
              c0++;
            else if(nums[i]==1)
              c1++;
            else
              c2++;
         } 
         int k=0;
         while(c0>0)
         {
            nums[k]=0;
            k++;
            c0--;
         }
         while(c1>0)
         {
            nums[k]=1;
            k++;
            c1--;
         }
         while(c2>0)
         {
            nums[k]=2;
            k++;
            c2--;
         }
    }
}
