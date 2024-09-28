//Problem Link:
https://www.geeksforgeeks.org/problems/common-elements1132/1?page=2&sortBy=submissions
//Solution:
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> result = new ArrayList<>();
        
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()){
            if( arr1.get(i).equals(arr2.get(j)) && arr2.get(j).equals(arr3.get(k)) ) {
                result.add(arr1.get(i));
                //To skip the duplicates
                int value = arr1.get(i);
                while (i < arr1.size() && arr1.get(i).equals(value)) i++;
                while (j < arr2.size() && arr2.get(j).equals(value)) j++;
                while (k < arr3.size() && arr3.get(k).equals(value)) k++;
            }
            else if(arr1.get(i)<arr2.get(j)){
                i++;
            }
            else if(arr2.get(j)<arr3.get(k)){
                j++;
            }
            else{
                k++;
            }
        }
        return result;
    }
}
