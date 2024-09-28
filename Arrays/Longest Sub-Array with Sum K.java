//Problem Link:
https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?page=2&sortBy=submissions
//Solution:
class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // Complete the function
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int prefixsum = 0;
        int maxLen = 0;
        for(int i = 0; i<N; i++){
            prefixsum+=A[i];
            
            if(prefixsum==K) maxLen = i+1;
            //if (prefixsum-K) exists in map
            if(prefixSumMap.containsKey(prefixsum-K)){
                maxLen = Math.max(maxLen, i - prefixSumMap.get(prefixsum - K));
            }
            //if (prefixsum-K) does'nt exists in map
            if(!prefixSumMap.containsKey(prefixsum)){
                prefixSumMap.put(prefixsum, i);
            }
        }
        return maxLen;
    }
}
