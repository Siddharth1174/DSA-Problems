// Square Root of a number
//Problem Link:
https://www.naukri.com/code360/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		long low = 1;
		long high = N;
		while(low<=high){
		    
			long mid = (low+high)/2;
			
			if(mid <= N / mid){
				low=mid+1;
			} else{
				high = mid-1;
			}
		}
		return (int) high;
	}
