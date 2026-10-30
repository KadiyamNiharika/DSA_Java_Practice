Problem: Set Mismatch  
Platform: LeetCode  
Problem Number: 645  
Topic: Hashing  
Approach: Calculate the expected sum of numbers from 1 to n. Use a HashMap to count the frequency of each element and calculate the actual sum of unique elements. Identify the duplicate element by checking which number appears twice. Calculate the missing number by subtracting the sum of unique elements from the expected sum. Return the duplicate number followed by the missing number.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int ts=0;
        for(int i=1;i<=n;i++)
        {
            ts=ts+i;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int s=0;
        int duplicate=0;
        for(int x:hm.keySet())
        {
            s=s+x;
            if(hm.get(x)==2)
                duplicate=x;   
        }
        return new int[] {duplicate,ts-s};
    }
}