//Problem Link:
https://leetcode.com/problems/min-stack/
//Solution:

//Approach 1:
class Pair{
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        int min;
        if(st.isEmpty()){
            min = val;
        } else{
            min = Math.min(st.peek().y, val);
        }
        st.push(new Pair(val, min));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().y;
    }
}


//Approach 2:
class MinStack {
    Stack<Long> st = new Stack<Long>();
    Long mini;
    //initializing our data structure
    public MinStack() {
        mini = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        Long val1 = Long.valueOf(val); //converting val to Long
        if(st.isEmpty()){
            mini = val1;
            st.push(val1);
        }else{
            if(val1<mini){ //When the new value is lesser than mini
                st.push(2*val1-mini);
                mini = val1;
            }else{
                st.push(val1);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        Long val = st.pop();
        if(val<mini){
            mini=2*mini-val;
        }
    }
    
    public int top() {
        Long val = st.peek();
        if(val<mini){
            return mini.intValue();
        }
        return val.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
    }
}
