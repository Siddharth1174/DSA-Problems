//Problem Link:
https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions
//Solution:
class Solution {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();
        if (s == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    result.add(i + 1);
                    result.add(i + 1);
                    return result;
                }
            }
            result.add(-1);
            return result;
        }
        int start = 0;
        int currentSum = 0;
        
        for(int end = 0; end<n; end++){
            currentSum+=arr[end];
            // While currentSum exceeds the desired sum, reduce the window from the start
            while(currentSum>s && start<=end){
                currentSum-=arr[start];
                start++;
            }
            //if desiredsum is obtained
            if(currentSum==s){
                result.add(start+1);
                result.add(end+1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
