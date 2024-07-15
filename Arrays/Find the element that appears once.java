//Problem Link:
https://www.geeksforgeeks.org/problems/element-appearing-once2552/1
//Solution:
class Sol {
    //n log n approach:
    // public static int search(int n, int arr[]) {
    //     // your code here
    //     Arrays.sort(arr);
    //     for(int i=0; i<n; i++){
    //         if((i==0||arr[i]!=arr[i-1]) && (i==n-1 || arr[i]!=arr[i+1])) return arr[i];
    //     }
    //     return -1;
    // }
    
    //O(n) approach;
    public static int search(int n, int arr[]) {
        int xor = 0;
        for(int i =0; i<n ; i++){
            xor = arr[i]^xor;
        }
        return xor;
    }
}
