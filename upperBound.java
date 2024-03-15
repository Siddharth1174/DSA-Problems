//Problem link: 
https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//Code:
int upperBound(vector<int> &arr, int x, int n){
	// Write your code here.	
	int low = 0;
	int high = n-1;
	int ans= n;
	while(low<=high){
		int mid = (low+high)/2;
		if(arr[mid]>x){
			ans = mid;
			high = mid-1;
		} else{
			low = mid+1;
		}

	}
}
