//Problem Link:
https://www.geeksforgeeks.org/problems/find-triplets-with-zero-sum/1?page=3&sortBy=submissions
//Solution:
class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        
        
        for(int i = 0; i<n; i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum==0) return true;
                else if(sum<0) l++;
                else r--;
            }
        }
        return false;

    }
}
