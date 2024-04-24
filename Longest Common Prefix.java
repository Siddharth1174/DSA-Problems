//Problem Link:
https://leetcode.com/problems/longest-common-prefix/description/
//Solution:
public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i = 1; i<strs.length; i++){
            //This line checks if the string at index 'i' in the array 'strs' does not start with the string 'prefix'.
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
