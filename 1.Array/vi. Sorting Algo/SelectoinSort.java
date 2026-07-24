public class SelectoinSort {
    public static void main(String[] args) {
        //selection sort --> repeatedly selects the minimum element form the unsorted part of the array and swaps it with the first unsorted element
        int[] arr = {5,8,2,4,1,9,3};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int midIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[midIndex]) {
                    midIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[midIndex];
            arr[midIndex] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
