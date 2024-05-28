//Problem Link:
https://leetcode.com/problems/permutation-sequence/
//Solution:
public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i<n; i++){
            fact = fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";//For storing answer
        k = k-1;//For 0 based indexing
        while(true){
            ans = ans + numbers.get(k/fact);//Add to answer
            numbers.remove(k/fact);// remove from answer
            if(numbers.size()==0) break;
            k=k%fact;//for next iteration
            fact = fact/numbers.size();//for next iteration
        }
        return ans;

    }
