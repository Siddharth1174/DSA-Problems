//Problem Link:
https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Code
int lowerBound(vector<int> arr, int n, int x) {
	// Write your code here
	int low=0;
	int high = n-1;
	int ans = n;
	while(low<=high){
		int mid = (low+high)/2;
		if(arr[mid]>=x) {
			ans = mid;
			//look for smaller index on the left
			high = mid-1;
		} else{
			low=mid+1;
		}
	}
	return ans;
}

