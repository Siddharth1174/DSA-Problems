//Problem Link:
https://www.geeksforgeeks.org/problems/topological-sort/1
//Solution:
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int indegree[] = new int[V];
        for(int i = 0; i<V; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i<V; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int topo[] = new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo[i++] = node;
            
            //Node is in your toposort so pls remove it fro your indegree
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
