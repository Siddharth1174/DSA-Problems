//Problem Link:
https://www.geeksforgeeks.org/problems/subset-sums2234/1
//Solution:
class Solution {
    void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset){
        if(ind == N){
            sumSubset.add(sum);
            return;
        }
        //pick the element
        func(ind+1, sum+arr.get(ind),arr, N, sumSubset);
        
        //Do not pick the element
        func(ind+1, sum, arr, N, sumSubset);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, n, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
        
    }
}
