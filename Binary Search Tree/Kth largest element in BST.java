//Problem Link:
https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
//Solution:
class Solution
{
    private void reverseInorder(Node node, int[] counter, int K, int[] kLargest){
        if(node==null || counter[0]>=K) return;
        
        reverseInorder(node.right, counter, K, kLargest);
        
        counter[0]++;
        
        if(counter[0]==K){
            kLargest[0] = node.data;
            return;
        }
        reverseInorder(node.left, counter, K, kLargest);
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        int[] kLargest = new int[]{Integer.MIN_VALUE};
        int[] counter = new int[]{0};
        reverseInorder(root, counter, K, kLargest);
        return kLargest[0];
    }
}
