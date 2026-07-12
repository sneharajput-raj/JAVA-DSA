public class IterativeBS {
    public static boolean binarySearch(int[] arr, int target, int n){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,13,17,23};
        int target = 25;
        int n = arr.length;
        System.out.println(binarySearch(arr, target, n));
    }
}
