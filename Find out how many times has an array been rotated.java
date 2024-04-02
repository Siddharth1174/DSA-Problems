//Find out how many times has an array been rotated
//Problem Link:
https://www.naukri.com/code360/problems/rotation_7449070?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//Solution:
public static int findKRotation(int []arr){
        // Write your code here.
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //When whole search space is sorted
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { 
                //if right part is sorted:

                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }
