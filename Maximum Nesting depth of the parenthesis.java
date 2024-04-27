//Problem Link:
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
//Solution:
public int maxDepth(String s) {
        int depth = 0, open = 0;
        for(char c : s.toCharArray()){
            if(c=='(') open++;
            if(c==')') open--;
            depth = Math.max(depth, open);
        }
        return depth;
}
