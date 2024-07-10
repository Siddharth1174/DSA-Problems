//Problem Link:
https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1



//Solution:
// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
    int ans = 0;
    for(int num : arr){
        ans+=num;//sum of given array
    }
    int sumOfArr = (n*(n+1))/2; // formula to calculate sum of array of n length
    return sumOfArr-ans;
    }
}
