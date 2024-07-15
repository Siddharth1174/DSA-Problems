//Problem Link:
https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//Solution:
public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        long nge[] = new long[n];
        Stack<Long> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            //Stack not empty and the ppek is lesser than the new number then,
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            //This only to be done for the first half
            if(i<n){
                if(!st.isEmpty()){
                    nge[i]=st.peek();
                } 
                else {
                    nge[i]=-1;
                }
            }
            st.push(arr[i]);
        }
        return nge;
    } 
