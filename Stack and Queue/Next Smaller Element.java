//Problem Link:
https://www.geeksforgeeks.org/problems/help-classmates--141631/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//Solution:

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    int nse[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for(int i = n-1; i>=0; i--){
	        while(!st.isEmpty() && st.peek()>=arr[i]){
	            st.pop();
	        }
	        if(i<n){
	            if(!st.isEmpty()){
	                nse[i]=st.peek();
	            }
	            else nse[i]=-1;
	        }
	        st.push(arr[i]);
	    }
	    return nse;
	} 
}
