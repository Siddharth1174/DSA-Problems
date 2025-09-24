//https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : arr){
            minHeap.add(num);
        }
        
        int result = 0;
        for(int i = 0; i<k; i++){
            result = minHeap.poll(); //removes and returns the smallest
        }
        
        return result;
    }
}
