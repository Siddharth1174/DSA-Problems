//Problem Link:
https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&sortBy=submissions
//Solution:
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
