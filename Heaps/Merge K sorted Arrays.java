//Problem Link:
https://www.naukri.com/code360/problems/merge-k-sorted-arrays_975379?leftPanelTabValue=PROBLEM
//Solution:
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
class Data {
    int val, apos, vpos;
    
    Data(int v, int ap, int vp) {
        val = v;
        apos = ap;
        vpos = vp;
    }
}

public class Solution 
{

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Data> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Initialize the min heap with the first element of each array
        for (int i = 0; i < k; i++) {
            if (kArrays.get(i).size() > 0) {
                Data d = new Data(kArrays.get(i).get(0), i, 0);
                pq.add(d);
            }
        }

        // Process the elements in the priority queue
        while (!pq.isEmpty()) {
            Data curr = pq.poll();
            ans.add(curr.val);
            int ap = curr.apos, vp = curr.vpos;
            if (vp + 1 < kArrays.get(ap).size()) {
                Data d = new Data(kArrays.get(ap).get(vp + 1), ap, vp + 1);
                pq.add(d);
            }
        }

        return ans;
	}
}
