//Problem Link:
https://www.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1
//solution:
 public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] colors = new int[n];
        return graphColoringUtil(graph, m, colors, 0, n);
        
    }
    // Utility function to check if the current color assignment is safe for vertex
    private boolean isSafe(boolean graph[][], int v, int[] colors, int c, int n) {
        for (int i = 0; i < n; i++) {
            if (graph[v][i] && colors[i] == c) {
                return false;
            }
        }
        return true;
    }

    // Utility function to solve m coloring problem
    private boolean graphColoringUtil(boolean graph[][], int m, int[] colors, int v, int n) {
        // Base case: If all vertices are assigned a color then return true
        if (v == n) {
            return true;
        }

        // Consider this vertex v and try different colors
        for (int c = 1; c <= m; c++) {
            // Check if assignment of color c to v is fine
            if (isSafe(graph, v, colors, c, n)) {
                colors[v] = c;

                // Recur to assign colors to the rest of the vertices
                if (graphColoringUtil(graph, m, colors, v + 1, n)) {
                    return true;
                }

                // If assigning color c doesn't lead to a solution then remove it
                colors[v] = 0;
            }
        }

        // If no color can be assigned to this vertex then return false
        return false;
    }
