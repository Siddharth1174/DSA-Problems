//PROBLEM LINK:https://www.naukri.com/code360/problems/631055?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
//SOLUTION:
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int N = arr.length;
        //First Method  TC =O(N log N)
        //Arrays.sort(arr);
        //Second way: TC = O(N);
        int low =0,mid = 0, high=N-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            } else if(arr[mid]==1){
                mid++;
            } else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

    }
}
