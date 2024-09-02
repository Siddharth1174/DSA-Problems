//Problem Link:
https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
//Solution:
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> sortedValues = new ArrayList<>();
        inorderTraversal(root, sortedValues);
        //Two pointer approach for 2 SUM
        int left = 0;
        int right = sortedValues.size()-1;
        while(left<right){
            int sum = sortedValues.get(left)+ sortedValues.get(right);
            if(sum==k) return true;
            else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    private void inorderTraversal(TreeNode node, List<Integer> sortedValues){
        if(node==null) return;

        inorderTraversal(node.left, sortedValues);
        sortedValues.add(node.val);
        inorderTraversal(node.right, sortedValues);
    }
}
