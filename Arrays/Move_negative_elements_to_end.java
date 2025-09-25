//Question:https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int[] temp = new int[n];
        int ind = 0;
        
        //Copying +tives
        for(int i=0;i<n; i++){
            if(arr[i]>=0){
                temp[ind++] = arr[i];
            }
        }
        
        // Copying -tives
         for(int i=0;i<n; i++){
            if(arr[i]<0){
                temp[ind++] = arr[i];
            }
        }
        
        //Copying whole array
         for(int i=0;i<n; i++){
            arr[i] = temp[i];
        }
    }
}
