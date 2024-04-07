//Problem Link:
https://www.naukri.com/code360/problems/aggressive-cows_1082559?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
public static boolean canweplace(int[] stalls, int dist, int cows){
        int n = stalls.length;
        int cntcows = 1;
        int last = stalls[0];
        for(int i=1; i<n; i++){
            if(stalls[i]-last>=dist){
                cntcows++;
                last = stalls[i];
            }
            if(cntcows>=cows) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        int n = stalls.length;
        Arrays.sort(stalls);

        int low = 1, high = stalls[n-1] - stalls[0];

        while(low<=high){
            int mid = (low+high)/2;
            if(canweplace(stalls,mid, k)==true){
                low = mid+1;
            } else high = mid-1;
        }
        return high;


    }
