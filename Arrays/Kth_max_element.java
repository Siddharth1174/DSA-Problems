//https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());//Collections.reverseOrder()-to reverse order so we get max instead of min when we do poll().
        for(int num : nums){
            maxHeap.add(num);
        }

        int result = 0;
        for(int i = 0; i<k; i++){
            result = maxHeap.poll();
        }
        return result;
    }
}
