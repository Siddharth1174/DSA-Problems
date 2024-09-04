//Problem Link:
https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
//Solution:
class KthLargest {
    private final PriorityQueue<Integer> minHeap;
    private final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        //Add all elements from initial array into min-heap
        for(int num: nums){
            add(num);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);//add new val to minheap
        if(minHeap.size()>k){//if heap size exceeds k remove smallest element
            minHeap.poll();
        }
        return minHeap.peek();//root is the kth largest element
    }
}
