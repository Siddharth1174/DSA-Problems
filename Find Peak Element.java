//Find Peak Element
//Problem Link:
https://leetcode.com/problems/find-peak-element/description/
//Solution:
public int findPeakElement(int[] nums) {
        int n = nums.length;
        //edge cases
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        
        int low = 1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            // if mid is the peak element
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            } 
            //if peak element is in right
            else if(nums[mid]>nums[mid-1]){
                low = mid+1;
            } 
            //if peak element is in left
            else{
                high = mid-1;
            }
        
        } 
        return -1;
    }
