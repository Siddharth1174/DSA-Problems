//Problem link:
https://www.geeksforgeeks.org/problems/implement-stack-using-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implement-stack-using-array
//Solution:
class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    top++;
	    arr[top] = a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    // Check for stack underflow
	    if (top < 0) {
            return -1; // Assuming -1 indicates stack underflow
        }
        // Your code here
        int x = arr[top];
        top--;
        return x;
	}
}
