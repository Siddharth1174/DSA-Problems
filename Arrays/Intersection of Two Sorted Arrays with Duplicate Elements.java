//Problem Link: https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-arrays-with-duplicate-elements/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

// User function Template for Java
class Solution {

    // Function to find the intersection of two arrays
    ArrayList<Integer> intersection(int[] a, int[] b) {
        int j=0,i=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(b[j]<a[i]){
                j++;
            }else{
                // Add to the result only if the list is empty 
                // or the last added element is different
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
