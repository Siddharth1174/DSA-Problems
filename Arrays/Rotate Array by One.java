//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        if(n==0) return;
        
        int last = arr[n-1];
        
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];//element apne left side wale element ki value lega
        }
        
        arr[0] = last;
        
    }
}
