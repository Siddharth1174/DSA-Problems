//Problem Link:
https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
//Solution:

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
        
    }
}
