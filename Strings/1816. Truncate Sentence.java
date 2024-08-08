//Problem Link:
https://leetcode.com/problems/truncate-sentence/description/

//Solution:

class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for(char c: s.toCharArray()){
            if(c!=' '){
                sb.append(c);
            } else if(i<k){
                sb.append(c);
                i++;
            } else break;
        }
        return sb.toString();
    }
}
