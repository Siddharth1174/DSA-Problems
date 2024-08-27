//problem Link:
https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1?page=3&sortBy=submissions
//Solution:
class Solution {
    public static int largest(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
