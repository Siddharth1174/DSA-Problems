//Problem Link:
https://naukri.com/code360/problems/median-of-a-row-wise-sorted-matrix_1115473?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
public static int countSmallerThanMid(int[] matrix, int mid, int m){
    int l = 0, h = m -1;
    while(l<=h){
      int md = (l+h) >> 1;
      if(matrix[md]<=mid){
        l=md+1;
      } else{
        h=md-1;
      }
    }
    return l;
  }
  public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low = 1;
        int high = 1000000000;
        // n = row;
        // m = col;
        while(low<=high){
          int mid = (low+high) >> 1;
          int cnt = 0;
          for(int i = 0; i<m;i++){
            cnt+=countSmallerThanMid(matrix[i],mid,n);
          }
          if(cnt<=(n*m)/2)
          low = mid+1;
          else
          high = mid-1;
        }
        return low;
    }
