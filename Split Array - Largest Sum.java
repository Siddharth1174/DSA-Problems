//Problem Link:
https://leetcode.com/problems/split-array-largest-sum/description/
//Solution:
public static int countPartitions(int[] nums, int maxSum){
        int n = nums.length;
        int partition = 1;
        long subarraySum = 0;
        for(int i=0; i<n ; i++){
            if(subarraySum + nums[i] <= maxSum){
                subarraySum += nums[i];
            } else{
                partition++;
                subarraySum = nums[i];
            }
        }
        return partition;
    }
    public int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;
        //find maximum and summation
        for(int i = 0; i<nums.length; i++){
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }
        //Apply Binary Search:
        while(low<=high){   
            int mid=(low+high)/2;
            int partition = countPartitions(nums,mid);
            if(partition>k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
