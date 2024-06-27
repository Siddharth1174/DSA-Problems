//Problem Link:
https://www.naukri.com/code360/problems/min-heap_4691801?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
//Solution:
class MinHeap {
    private PriorityQueue<Integer> heap;

    public MinHeap() {
        heap = new PriorityQueue<>();
    }

    public void insert(int x) {
        heap.add(x);
    }

    public Integer getMinAndRemove() {
        if (!heap.isEmpty()) {
            return heap.poll();
        } else {
            return null;
        }
    }
}
public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        MinHeap minheap = new MinHeap();
        List<Integer> resultsList = new ArrayList<>();

        for(int[] query : q){
            if(query[0]==0){
                minheap.insert(query[1]);
            } else if(query[0]==1){
                Integer minVal = minheap.getMinAndRemove();
                if(minVal!=null){
                    resultsList.add(minVal);
                }
            }
        }
        // Convert resultsList to int[]
        int[] results = new int[resultsList.size()];
        for (int i = 0; i < resultsList.size(); i++) {
            results[i] = resultsList.get(i);
        }

        return results;

    }
}
