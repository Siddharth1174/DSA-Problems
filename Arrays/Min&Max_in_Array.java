// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        if(arr==null || arr.length==0) return null;
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return new Pair<>(min,max);
    }
}
