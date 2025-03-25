//Problem Link:https://www.geeksforgeeks.org/problems/max-consecutive-one/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//Solution:
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        
        //Time Complexity = O(N)
        int cnt1=0,max1=0;
        int cnt2=0,max2=0;
        int N = arr.length;
        for(int i=0; i<N; i++){
            if(arr[i]==1){
                cnt1++;
                max1 = Math.max(cnt1,max1);
                cnt2=0;
            }else if(arr[i]==0){
                cnt2++;
                max2 = Math.max(cnt2, max2);
                cnt1=0;
            }
        }
        
        return Math.max(max1,max2);
        
        // this is giving n^2 time complexity:====
        // int N= arr.length;
        // int cnt = 0;
        // int maxi = 0;
        
        // for(int i = 0; i<N; i++){
        //     if(arr[i]==1){
        //         cnt++;
        //         maxi = Math.max(cnt, maxi);
        //     }else{
        //         cnt=0;
        //     }
        // }
        
        // int cnt1 = 0;
        // int maxi1 = 0;
        // for(int i = 0; i<N; i++){
        //     if(arr[i]==0){
        //         cnt1++;
        //         maxi1 = Math.max(cnt1, maxi1);
        //     }else{
        //         cnt1=0;
        //     }
        // }
        
        // if(maxi>maxi1){
        //     return maxi;
        // }
        // return maxi1;
        
        
        
    }
}
