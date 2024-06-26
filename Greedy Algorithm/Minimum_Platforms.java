//Problem Link:
https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
//Solution:
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int result = 1, platform = 1;
        int i  = 1, j = 0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platform++;
                i++;
            } else if(arr[i]>dep[j]){
                platform--;
                j++;
            }
            if(platform>result){
                result = platform;
            }
        }
        return result;
    }
    
}
