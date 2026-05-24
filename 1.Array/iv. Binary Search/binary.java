import java.util.*;
public class binary {
    public static void main(String[] args) {
        //binary search --> sorted array
        int target = 5;
        int[] arr = {4,8,1,9,2,5,8};
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                System.out.println("Index of Target is " + mid);
                break;
            }
            else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
    }
}
