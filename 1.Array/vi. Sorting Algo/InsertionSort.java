public class InsertionSort {
    public static void main(String[] args) {
        //Insertion sorting --> har baar ek element ko uthakr array ke sorted part me uski sahi position par inset krta hai 
        //T.C.  -->  O(N2)
        int[] arr= {3,7,9,2,0,4,3,5};
        int n = arr.length;
        for(int i=0; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            //to find the index where curr is to be inserted
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
