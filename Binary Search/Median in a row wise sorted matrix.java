//Problem Link:
https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=median-in-a-row-wise-sorted-matrix
//Solution:
int median(int matrix[][], int R, int C) {
        // code here        
        int low = 1;
        int high = 1000000000;
        // int n = R;
        // int m = C;
        while(low<=high){
            int mid = (low+high)>>1;
            int cnt = 0;
            for(int i = 0; i<R; i++){
                cnt+=countSmallerThanMid(matrix[i], mid, C);
            }
            if(cnt<=(R*C)/2)//median-(n*m)/2
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
    public static int countSmallerThanMid(int[] row, int mid, int n){
        int l=0,h=n-1;
        while(l<=h){
            int md = (l+h)>>1;
            if(row[md]<=mid){
                l=md+1;
            } else{
                h=md-1;
            }
        }
        return l;
    }
