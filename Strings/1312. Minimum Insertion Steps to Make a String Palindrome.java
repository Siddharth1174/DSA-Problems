//Problem Link:
https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/
//Solution:
class Solution {

    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];


        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    cur[ind2] = 1 + prev[ind2 - 1];
                else
                    cur[ind2] = Math.max(prev[ind2], cur[ind2 - 1]);
            }

            prev = cur.clone();
        }

        return prev[m];
    }

    static int longestPalindromeSubsequence(String s) {
        String reversed = new StringBuilder(s).reverse().toString();

        return lcs(s, reversed);
    }

    static int minInsertions(String str) {
        int n = str.length();
        int k = longestPalindromeSubsequence(str);

       
        return n - k;
    }

}
