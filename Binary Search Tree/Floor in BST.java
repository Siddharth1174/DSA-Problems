//Problem Link:
https://www.geeksforgeeks.org/problems/floor-in-bst/1
//Solution:
class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int floor = -1;
        while(root!=null){
            if(root.data==x){
                floor = root.data;
                return floor;
            }
            if(x>root.data){
                floor = root.data;
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return floor;
    }
}
