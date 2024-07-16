//Problem Link:
https://www.naukri.com/code360/problems/sort-a-stack_985275?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
//Solution:
import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.isEmpty()){
			return;
		}

		int temp = stack.pop();
		sortStack(stack);

		insertAtCorrectPosition(stack, temp);
	}

	//To put elements in the correct order:
	public static void insertAtCorrectPosition(Stack<Integer> stack, int temp){

		if(stack.isEmpty() || stack.peek()<temp){
			stack.push(temp);
			return;
		}

		int elem = stack.pop();
		insertAtCorrectPosition(stack, temp);

		stack.push(elem);
	}

}
