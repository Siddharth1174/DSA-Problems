//Probelm Link:
https://leetcode.com/problems/repeated-string-match/description/
//Solution:
class Solution {
    public int repeatedStringMatch(String A, String B) {
        String strA = A;
        int repeat = B.length()/A.length();
        int count = 1;
        for(int i=0; i<repeat+2; i++){
            if(A.contains(B)) return count;
            else {
                A+=strA;
                count++;
            }
        }
        return -1;
    }
}
