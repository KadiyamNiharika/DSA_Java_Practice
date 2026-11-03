Problem: Insert Interval
Platform: LeetCode
Problem Number: 57
Topic: Greedy
Approach: Add the new interval to the list, sort all intervals by starting time, and merge overlapping intervals.
Time Complexity: O(n log n)
Space Complexity: O(n)
Status: Solved

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            al.add(intervals[i]);
        }
        al.add(newInterval);
        al.sort((a,b)->a[0]-b[0]);
        int[][] res=new int[al.size()][2];
        int k=0;
        res[0][0]=al.get(0)[0];
        res[0][1]=al.get(0)[1];
        for(int i=1;i<al.size();i++)
        {
            if(al.get(i)[0]<=res[k][1])
            {
                res[k][1]=Math.max(res[k][1],al.get(i)[1]);
            }
            else
            {
                k++;
                res[k][0]=al.get(i)[0];
                res[k][1]=al.get(i)[1];
            }
        }
        return Arrays.copyOf(res,k+1);
    }
}