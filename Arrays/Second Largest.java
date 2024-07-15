//Problem Link: 
https://www.geeksforgeeks.org/problems/second-largest3735/1
//Solution:
public int print2largest(List<Integer> arr) {
        // Code Here
        int n=arr.size();
        
        if(n<2) return -1;//When not enough elements in the array for second largest
        int sl=Integer.MIN_VALUE;//second largest
        int l=Integer.MIN_VALUE;//largest
    
        for(int i =0; i<n;i++){
            int current=arr.get(i);
            if(current>l){
                sl = l;
                l=current;
                
                
            }else if(current!=l && current>sl){
                sl = current;
            }
        }  
        if(sl==Integer.MIN_VALUE) return -1;
        else return sl;
    }
