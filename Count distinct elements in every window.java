//Problem Link:
https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
//Solution:
class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        //Initialize frequency map with first window
        for(int i = 0; i<k; i++){
            frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i],0)+1);
        }
        //add count of distinct elements for first window
        result.add(frequencyMap.size());
        
        //To slide the window
        for(int i = k; i<n; i++){
            int outgoingElement = A[i-k]; //to remove element that are out of window
            frequencyMap.put(outgoingElement, frequencyMap.get(outgoingElement)-1);
            //if count==0, remove it from map
            if(frequencyMap.get(outgoingElement)==0){
                frequencyMap.remove(outgoingElement);
            }
            //Add new element coming into the window
            int incomingElement= A[i];
            frequencyMap.put(incomingElement, frequencyMap.getOrDefault(incomingElement,0)+1);
            result.add(frequencyMap.size());
        }
        return result;
    }
}
