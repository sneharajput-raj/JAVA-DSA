public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,0,6,4,8,1,2};
        int n = arr.length;
        int low = 0;    //start
        int high = n-1;    //end
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
