//Problem link:
https://www.geeksforgeeks.org/problems/sum-of-digits1742/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
//Solution:
class Solution{
    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N>0){
            int ld = N%10;
            sum = sum + ld; 
            N=N/10;
        }
        return sum;
    }
}
       
