//Problem link:
https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Solution:
static int findFloor(int[] a, int n, int x){
      int low = 0;
      int high = n-1;
      int ans = -1;
      while(low<=high){
        int mid= (low+high)/2;
        if(a[mid]<=x){
          ans = a[mid];
          low = mid+1;
        }else{
          high = mid-1;
        }
      }
      return ans;
    }

    //For Ceil we'll use the same code we used in lower bound.
    static int findCeil(int[] a,int n, int x){
      int low = 0;
      int high =n-1;
      int ans = -1;
      while(low<=high){
        int mid = (low+high)/2;
        if(a[mid]>=x){
          ans = a[mid];
          high = mid-1;
        }else{
          low = mid+1;
        }
      }
      return ans;
    }
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int f = findFloor(a,n,x);
      int c = findCeil(a,n,x);
      return new int[] {f,c};
    }
