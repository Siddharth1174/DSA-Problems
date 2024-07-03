//Problem Link:
https://www.geeksforgeeks.org/problems/implement-queue-using-array/1
//Solution:
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int n = arr.length;
	int cnt = 0;
	

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(cnt==arr.length) return;
	    arr[rear%n]=x;
	    rear++;
	    cnt++;
	    
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(cnt==0) return -1;
		int val=arr[front%n];
		front++;
		cnt--;
		return val;
		
	} 
}
