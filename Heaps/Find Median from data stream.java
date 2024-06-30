//Problem Link:
https://leetcode.com/problems/find-median-from-data-stream/description/
//Solution:
class MedianFinder {
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a,b)-> b-a);
        minHeap = new PriorityQueue<>((a,b)-> a-b); 
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>=num)
            maxHeap.add(num);
        else
            minHeap.add(num);

        //Either both heaps will have equal number of elements 
        //or maxHeap will have one extra
        if(maxHeap.size()>minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if(maxHeap.size()<minHeap.size())
            maxHeap.add(minHeap.poll());    
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size()){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
        return maxHeap.peek();
    }
}
