//Problem link:
https://www.naukri.com/code360/problems/painter-s-partition-problem_1089557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static int countPainters(ArrayList<Integer> boards, int time){
        int n = boards.size();
        int painters = 1;
        long boardsPainter = 0;
        for(int i = 0; i<n; i++){
            if(boardsPainter + boards.get(i) <= time){
                boardsPainter += boards.get(i);
            } else{
                painters++;
                boardsPainter = boards.get(i);
            }
        }
        return painters;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();
        //Binar Search
        while(low<=high){
            int mid = (low+high)/2;
            int painters = countPainters(boards, mid);
            if(painters>k){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return low;
    }
}
