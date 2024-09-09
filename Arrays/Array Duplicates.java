//Problem Link:
https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&sortBy=submissions
//Solution:
class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        Set <Integer> seen  = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        
        for(int num: arr){
            if(seen.contains(num)){
                if(!duplicates.contains(num)){
                    duplicates.add(num);
                }
            }else{
                seen.add(num);
            }
        }
        Collections.sort(duplicates);
        
        if(duplicates.isEmpty()){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }
        return duplicates;
        
    }
}
