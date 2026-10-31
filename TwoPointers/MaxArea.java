Problem: Container With Most Water  
Platform: LeetCode  
Problem Number: 11  
Topic: Two Pointers  
Approach: Use two pointers, one at the beginning and the other at the end of the array. Calculate the area using the minimum of the two heights multiplied by the width. Update the maximum area and move the pointer with the smaller height inward to find a potentially larger area.  
Time Complexity: O(n)  
Space Complexity: O(1)  
Status: Solved


class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<j)
        {
           int h=Math.min(height[i],height[j]);
           int width=j-i;
           int area=h*width;
           max=Math.max(area,max);
           if(height[i]<height[j])
              i++;
           else
             j--;
        }
        return max;
    }
}