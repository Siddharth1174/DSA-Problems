//Problem Link:
https://leetcode.com/problems/search-a-2d-matrix/description/
//Solution:
public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;//no. of rows
        int m = matrix[0].length;//no. of columns 
        int low = 0, high = (n*m) - 1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
