//Problem Link:
https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
//Solution:class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        Vector<Integer> ans = new Vector<>();
        
        int deno[] = {1,2,5,10,20,50,100,200,500,2000};
        int n = deno.length;
        
        for(int i = n-1; i>=0; i--){
            while(N>=deno[i]){
                N-=deno[i];
                ans.add(deno[i]);
            }
        }
        // for(int i = 0; i<ans.size(); i++){
        //     System.out.print(" "+ans.elementAt(i));
        // }
        return ans;
        
    }
    
}
