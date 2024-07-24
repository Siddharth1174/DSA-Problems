//Problem Link:
https://leetcode.com/problems/online-stock-span/description/
//Solution:
class StockSpanner {
    int index;
    Stack<Pair<Integer, Integer>> st;

    public StockSpanner() {
        index = -1;
        st = new Stack<>();  
    }
    
    public int next(int price) {
        index += 1;
        // To pop the value which is smaller than current price
        while(!st.isEmpty() && st.peek().getKey()<=price){
            st.pop();
        }
        //Formula-->ans = current(index)-Previous_greater(index)
        int ans = index - (st.isEmpty() ? -1 : st.peek().getValue());
        st.push(new Pair<>(price, index));
        return ans;
    }

    //Pair Class Implementation:
    static class Pair<K, V>{
        private K key;
        private V value;

        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey(){
            return key;
        }

        public V getValue(){
            return value;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
