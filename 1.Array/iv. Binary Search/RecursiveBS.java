public class RecursiveBS {
    public static boolean binarySearch(int[] arr, int target, int low, int high){
        if(low > high) return false;    //base case
        int mid = low + (high-low)/2;
        if(arr[mid] == target) return true;
        else if(arr[mid] > target){
            return binarySearch(arr, target, low, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,6,9,11,15,19,21,17};
        int target = 6;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        System.out.println(binarySearch(arr, target, low, high));
    }
}
