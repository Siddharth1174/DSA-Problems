//Problem Link:https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
//Solution:
class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int num : arr){
            if(num>=0){
                pos.add(num);
            } else{
                neg.add(num);
            }
        }
        
        int i=0,j=0,k=0;
        //TO rearrange with alternate positive and negative;
        while(i<pos.size() && j<neg.size()){
            arr.set(k++, pos.get(i++));
            arr.set(k++, neg.get(j++));
        }
        
        
        // for remaining positives:
        while(i<pos.size()){
            arr.set(k++, pos.get(i++));
        }
        
        //For remaining negatives:
        while(j<neg.size()){
            arr.set(k++, neg.get(j++));
        }
    }
}
