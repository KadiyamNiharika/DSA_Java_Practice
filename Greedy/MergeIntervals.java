Problem: Merge Intervals  
Platform: LeetCode  
Problem Number: 56  
Topic: Greedy, Arrays, Sorting  
Approach: Sort the intervals by their starting values. Iterate through the intervals and merge overlapping intervals by updating the end value to the maximum end. If an interval does not overlap with the last merged interval, add it as a new interval.  
Time Complexity: O(n log n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int[][] res=new int[intervals.length][2];
       int k=0;
       res[k][0]=intervals[0][0];
       res[k][1]=intervals[0][1];
       for(int i=1;i<intervals.length;i++)
       {
           if(intervals[i][0]<=res[k][1])
           {
               res[k][1]=Math.max(res[k][1],intervals[i][1]);
           }
           else
           {
              k++;
              res[k][0]=intervals[i][0];
              res[k][1]=intervals[i][1];
           }
       }
       return Arrays.copyOf(res,k+1);
    }
}