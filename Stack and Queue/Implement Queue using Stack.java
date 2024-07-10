//Problem Link:
https://leetcode.com/problems/implement-queue-using-stacks/description/
//Solution:
class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.pop());
                
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if(output.empty()){
            while(input.empty()==false){
                output.push(input.pop());
                
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        if(input.empty()==true && output.empty()==true) return true;
        else return false;
    }
}
