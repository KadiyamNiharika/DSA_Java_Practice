Problem: Leaders in an Array  
Platform: GeeksforGeeks  
Topic: Arrays, Greedy  
Approach: Traverse the array from right to left while maintaining the maximum element seen so far. If the current element is greater than or equal to the maximum, add it to the result and update the maximum. Reverse the result to obtain the leaders in their original order.  
Time Complexity: O(n)  
Space Complexity: O(n)  
Status: Solved

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
       ArrayList<Integer> al=new ArrayList<>();
       int n=arr.length;
       int max=arr[n-1];
       al.add(max);
       for(int i=n-2;i>=0;i--)
       {
           if(arr[i]>=max)
           {
               al.add(arr[i]);
               max=arr[i];
           }
       }
       Collections.reverse(al);
       return al;
    }
}
