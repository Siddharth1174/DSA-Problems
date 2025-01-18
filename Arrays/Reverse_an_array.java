//Problem Link:https://www.geeksforgeeks.org/problems/reverse-an-array/0
//Solution:
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        // Swap elements from both ends of the array
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
    
}
