// https://www.geeksforgeeks.org/problems/common-elements1132/1
class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for(int num: arr2){
            if(set1.contains(num)) set2.add(num);
        }
        
        for(int num: arr3){
            if(set2.contains(num)){
                result.add(num);
                set2.remove(num);//doing this bcuz Lists can store duplicates 
            } 
        }
        return result;
    }
}
