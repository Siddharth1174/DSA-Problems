//Problem Link:
https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/
//Solution:
class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        String[]arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            try{
                int num = Integer.parseInt(arr[i]);
                if(num>prev) prev = num;
                else return false;
            }
            catch(Exception a){}
        }  
        return true;
    }
}
