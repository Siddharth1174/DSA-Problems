//Problem Link:
https://leetcode.com/problems/valid-parentheses/description/
//Solution:
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){//to convert a string into a character array.
            if(i=='(' || i=='[' || i=='{'){
                st.push(i);
            } 
            else{
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((i==')' && ch=='(') || (i==']' && ch=='[') || (i=='}' && ch=='{')) continue;
                else return false;
            } 
        }
        return st.isEmpty();
    }
}
