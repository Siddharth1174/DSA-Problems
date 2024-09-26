//Problem Link: 
https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-a-directed-graph
//Solution:
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int indegree[] = new int[V];
        for(int i = 0 ; i<V; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0; i<V; i++){
            if(indegree[i]==0) q.add(i);
        }
        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            cnt++;
            
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0) q.add(it);
            }
            
        }
        if(cnt==V) return false;
        return true;
    }
}
