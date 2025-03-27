//Problem Link:https://www.naukri.com/code360/problems/maximum-subarray-sum_630526?leftPanelTabValue=PROBLEM
//Solution:
import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxi = 0;
		long sum = 0;
		for (int i = 0; i<n; i++){
			sum+=arr[i];
			if(sum>maxi){
				maxi = sum;
			}
			if (sum<0){
				sum=0;
			}
		}
		return maxi;

	}

}
