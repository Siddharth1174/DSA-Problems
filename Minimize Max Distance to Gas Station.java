//Problem Link:
https://www.naukri.com/code360/problems/minimise-max-distance_7541449?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution
public static int numberOfgasStationsRequired(double dist, int[] arr){ 
        int n = arr.length;
        int cnt = 0;
        for(int i=1; i<n; i++){
            int numberInBetween = (int)((arr[i] - arr[i-1])/dist);
            if((arr[i]-arr[i-1])==(dist*numberInBetween)){
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n = arr.length;
        double low = 0;
        double high = 0;

        //Max Distance
        for(int i=0; i<n-1; i++){
            high = Math.max(high, (double)(arr[i+1] - arr[i]));
        }
        //Apply Binary Search
        double diff = 1e-6;
        while(high-low>diff){
            double mid = (low+high)/(2.0);
            int cnt = numberOfgasStationsRequired(mid,arr);
            if(cnt>K){
                low = mid;
            } else{
                high = mid;
            }
        }
        return high;
    }
