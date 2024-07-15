//Similar to 2 Sum, 3 Sum, 4 Sum
//Problem Link:
https://www.geeksforgeeks.org/problems/key-pair5616/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//Solution:
class Solution {
    //Brute force: O(N^2)
    // boolean hasArrayTwoCandidates(int arr[], int x) {
    //     // code here
    //     for(int i=0; i<arr.length; i++){
    //         for(int j = i+1; j<arr.length; j++){
    //             if(arr[i]+arr[j]==x){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    
    
    //Optimal Approach: O(nlogn)
    boolean hasArrayTwoCandidates(int arr[], int x) {
        Arrays.sort(arr);
        int l=0, r=arr.length-1;
        while(l<r){
            if(arr[r]+arr[l]==x) return true;
            else if(arr[r]+arr[l]>x) r--;
            else l++;
        }
        return false;
    }
    
}
