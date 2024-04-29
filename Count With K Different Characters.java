//Problem Link:
https://www.naukri.com/code360/problems/count-with-k-different-characters_1214627?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Solution:
public static int countSubStrings(String str, int k) {
        // Write your code here.
        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            int[] cnt = new int[26];
            int distCount = 0;

            for (int j = i; j < n; j++) {
                if (cnt[str.charAt(j) - 'a'] == 0) {
                    distCount++;
                }

                cnt[str.charAt(j) - 'a']++;

                if (distCount == k) {
                    res++;
                } else if (distCount > k) {
                    break; // Optimization: No need to continue if distinct count exceeds k
                }
            }
        }

        return res;
    }
