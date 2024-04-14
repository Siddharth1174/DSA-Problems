//Problem Link:
https://www.naukri.com/code360/problems/search-in-a-sorted-2d-matrix_6917532?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Solution:
 public static boolean searchElement(int [][]MATRIX, int target) {
        // Write your code here.
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int row = 0, col = m-1;
        while(row<n && col>=0){
            if(MATRIX[row][col]==target) return true;
            else if(MATRIX[row][col]<target) row++;
            else col--;
        }
        return false;
    
    }
