public class InsertionSort {
    public static void main(String[] args) {
        //Random swapping --> Insertion , Bubble, Selection sorting
        //T.C.  -->  O(N2)
        int[] arr= {3,7,9,2,0,4,3,5};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
