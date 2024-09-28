//Problem link:
https://www.geeksforgeeks.org/problems/peak-element/1?page=1&sortBy=submissions
//Solution:
class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==0) return 0;
       
       for(int i = 0; i<n; i++){
           if((i==0 || arr[i]>=arr[i-1]) && (i==n-1 || arr[i]>=arr[i+1])) return i;
       }
       return -1;
    }
}
