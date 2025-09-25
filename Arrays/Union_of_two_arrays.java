//Question: https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> unionSet = new HashSet<>();

        for(int num: a){
            unionSet.add(num);
        }
        
        for(int num: b){
            unionSet.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>(unionSet);
        return result;
    }
}
