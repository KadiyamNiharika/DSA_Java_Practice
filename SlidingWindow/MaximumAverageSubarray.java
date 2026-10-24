Problem: Maximum Average Subarray I  
Topic: Sliding Window  
Approach: Calculate the sum of the first `k` elements to initialize the window. Then slide the window one element at a time by adding the next element and subtracting the element that leaves the window. Calculate the average for each window and update the maximum average.  
Time Complexity: O(n)  
Space Complexity: O(1)  
Status: Solved

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg=Integer.MIN_VALUE;
        double AVG=0;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
            AVG=sum/k;
        }
        if(AVG>maxAvg)
           maxAvg=AVG;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            AVG=sum/k;
            if(AVG>maxAvg)
               maxAvg=AVG;
        }  
        return maxAvg;      
    }
}