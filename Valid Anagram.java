//Problem Link:
https://leetcode.com/problems/valid-anagram/description/
//Solution:
public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
        char sChar = Character.toLowerCase(s.charAt(i));
        char tChar = Character.toLowerCase(t.charAt(i));
        freq[sChar - 'a']++;
        freq[tChar - 'a']--;
        }

        for (int count : freq) {
        if (count != 0) return false;
        }
        return true;
    }
