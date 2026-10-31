Problem: Trapping Rain Water  
Platform: LeetCode  
Problem Number: 42  
Topic: Arrays  
Approach: Create two arrays to store the maximum height to the left (`lmax`) and maximum height to the right (`rmax`) of each position. Calculate the trapped water at each index using the minimum of these two maximum heights minus the current height. Add all the trapped water to get the total amount.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public int trap(int[] height) {
         int n=height.length;
         int[] lmax=new int[n];
         int[] rmax=new int[n];
         lmax[0]=height[0];
         for(int i=0;i<n-1;i++)
         {
            if(lmax[i]>height[i+1])
               lmax[i+1]=lmax[i];
            else
               lmax[i+1]=height[i+1];
         }
         rmax[n-1]=height[n-1];
         for(int i=n-1;i>0;i--)
         {
            if(rmax[i]>height[i-1])
                rmax[i-1]=rmax[i];
            else
               rmax[i-1]=height[i-1]; 
         }
         int res=0;
         for(int i=0;i<n;i++)
         {
            res=res+Math.min(lmax[i],rmax[i])-height[i];
         }
         return res;
    }
}