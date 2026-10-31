Problem: Fruit Into Baskets  
Platform: LeetCode  
Problem Number: 904  
Topic: Sliding Window  
Approach: Use a HashMap to store the frequency of each fruit type in the current window. Expand the window by moving the right pointer. If the number of distinct fruit types exceeds two, shrink the window from the left by decreasing frequencies and removing fruit types with zero frequency. Update the maximum window length at each step.  
Time Complexity: O(n)  
Space Complexity: O(1) — at most two fruit types are maintained in the window.  
Status: Solved

class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<fruits.length;right++)
        {
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            while(hm.size()>2)
            {
                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left])==0)
                   hm.remove(fruits[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}