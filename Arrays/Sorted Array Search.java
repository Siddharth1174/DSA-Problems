//Problem Link: https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
//solution:
class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return true;
            }
            
        }
        return false;
    }
}
