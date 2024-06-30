//Problem Link:
https://www.geeksforgeeks.org/problems/maximum-sum-combination/0
//Solution:
static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        // code here
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        // Max-heap to store sums and indices
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        
        Set<String> s = new HashSet<>();
        
        // Add the largest sum (from the last elements of both arrays) to the heap
        pq.add(new int[]{A[N-1]+B[N-1],N-1,N-1});
        s.add((N-1)+"-"+(N-1));
        
        

        while(K-->0 ){
            int[] p = pq.poll();
            int sum = p[0];
            int i = p[1];
            int j = p[2];
            ans.add(sum);
            
            // If the pair (i-1, j) is not visited, add the sum to the heap
            if(i-1>=0 && !s.contains((i-1)+"-"+j)){
                pq.add(new int[]{A[i-1]+B[j], i-1, j});
                s.add((i-1)+"-"+j);
            }
            
            // If the pair (i, j-1) is not visited, add the sum to the heap
            if(j-1 >= 0 && !s.contains(i+"-"+(j-1))){
                pq.add(new int[]{A[i]+B[j-1],i , j-1});
                s.add(i+"-"+(j-1));
            }
            
        }
        return ans;
    }
