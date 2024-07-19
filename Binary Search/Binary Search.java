//Problem Link:
https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
//Solution:
class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int l = 0;
        int h = n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) h=mid-1;
            else l = mid+1;
        }
        return -1;
    }
}
