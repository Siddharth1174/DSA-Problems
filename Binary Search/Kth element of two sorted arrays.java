//Problem Link:
https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=k-th-element-of-two-sorted-array
//Solution:
public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(m>n){
            return kthElement(arr2,arr1,m,n,k);
        }
        int low = Math.max(0,k-m), high = Math.min(k,n);
        while(low<=high){
            int cnt1 = (low+high)>>1;
            int cnt2 = k-cnt1;
            int l1 = cnt1 == 0 ? Integer.MIN_VALUE:arr1[cnt1-1];
            int l2 = cnt2 == 0 ? Integer.MIN_VALUE:arr2[cnt2-1];
            int r1 = cnt1 == n ? Integer.MAX_VALUE:arr1[cnt1];
            int r2 = cnt2 == m ? Integer.MAX_VALUE:arr2[cnt2];
            
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high = cnt1-1;
            }
            else{
                low = cnt1+1;
            }
        }
        return -1;
    }
