//Problem Link:
https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?page=3&sortBy=submissions
//Solution:
class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        if(arr1.length!=arr2.length) return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n = arr1.length;
        for(int i = 0 ; i<n; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
