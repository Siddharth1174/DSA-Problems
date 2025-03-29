//Problem Link:https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

//Solution:
class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n = arr.length;
        if(n==0) return 0;
        int longest =1;
        Set<Integer> set = new HashSet<>();
        
        //Putting all array elements in a set
        for(int i =0; i<n; i++){
            set.add(arr[i]);
        }
        
        //Code for consecutive nums
        for(int it: set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                x++;
                cnt++;
            }
            longest = Math.max(cnt, longest);
            }
            
        }
        return longest;
    }
    
}
