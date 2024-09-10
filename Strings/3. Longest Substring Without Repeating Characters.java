//Problem Link:
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//Solution:
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left+ 1);
        }
        return maxLength;
    }
}
