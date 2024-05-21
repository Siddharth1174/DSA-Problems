//Problem Link:
https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
//Solution:
//Already Given
// class Job {
//     int id, profit, deadline;
//     Job(int x, int y, int z){
//         this.id = x;
//         this.deadline = y;
//         this.profit = z; 
//     }
// }

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        //To bring array in decreasing order of profit , assuming a as first and b as seccond
        Arrays.sort(arr,(a,b) -> (b.profit - a.profit));
        
        int maxi = 0;
        for(int i = 0; i<n; i++){
            if(arr[i].deadline > maxi){
                maxi = arr[i].deadline;
            }
        }
        int result[] = new int[maxi+1];
        for(int i = 1; i<=maxi; i++){
            result[i]=-1;
        }
        
        int countjobs = 0, jobProfit = 0;
        for(int i = 0; i<n; i++){
            for(int j = arr[i].deadline; j>0; j--){
                //free slot found
                if(result[j]==-1){
                    result[j] = i;
                    countjobs++;
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = countjobs;
        ans[1] = jobProfit;
        return ans;
    }
}
