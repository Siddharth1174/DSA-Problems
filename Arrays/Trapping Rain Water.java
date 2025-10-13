// Question Link: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int res =0, maxLeft =0, maxRight=0;
        
        while(left<=right){
            if(arr[left]<=arr[right]){
                if(arr[left]>maxLeft) maxLeft = arr[left];
                else res+=maxLeft-arr[left];
                left++;
            }else{
                if(arr[right]>maxRight) maxRight = arr[right];
                else res+=maxRight-arr[right];
                right--;
            }
        }
        return res;
    }
}
