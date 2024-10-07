//Problem Link:
https://www.geeksforgeeks.org/problems/bipartite-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bipartite-graph
//Solution:

class Solution
{
    private boolean check(int start, int V, ArrayList<ArrayList<Integer>>adj, int color[]){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        color[start]=0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            
            for(int it: adj.get(node)){
                //if the adjacent node is yet not colored
                //you will give the opposite color of the node
                if(color[it]==-1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }
                //is the adjacent guy having the same color
                //someone did color it on some other path
                else if(color[it]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[]  = new int[V];
        for(int i = 0; i<V; i++) color[i] = -1;
        
        for(int i = 0; i<V; i++){
            if(color[i]==-1){
                if(check(i,V,adj,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
}
