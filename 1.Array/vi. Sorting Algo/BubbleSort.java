public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort --> adjacent element ko compare krta hai or jo bada hua use end swap ke deta hai
        int[] arr = {4,7,1,5,2,8,1,9,3};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
