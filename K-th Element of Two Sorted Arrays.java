//Problem Link:
https://www.naukri.com/code360/problems/k-th-element-of-2-sorted-array_1164159?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution
public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
        if(n>m){
            return kthElement(arr2, arr1, m, n, k);
        }
        int low = Math.max(0,k-m), high = Math.min(k,n);

        while(low<=high){
            int cut1 = (low+high) >> 1;
            int cut2 = k-cut1;
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1.get(cut1 - 1);
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2.get(cut2 - 1);
            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1.get(cut1);
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2.get(cut2); 
            
            if(l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            else if (l1 > r2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1; 
            }
        }
        return -1;
    }
