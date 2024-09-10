//Problem Link:
https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&sortBy=submissions
//Solution:
class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> Leaders = new ArrayList<>();
        if(n==0) return Leaders;
        //Start from last element
        int maxFromRight = arr[n-1];
        Leaders.add(maxFromRight);
        //Traverse Right to Left
        for(int i = n-2; i>=0; i--){
            if(arr[i]>=maxFromRight){
                maxFromRight = arr[i];
                Leaders.add(maxFromRight);
            } 
        }
        java.util.Collections.reverse(Leaders);
        return Leaders;
        
    }
}
