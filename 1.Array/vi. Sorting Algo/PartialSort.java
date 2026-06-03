public class PartialSort {
    public static void main(String[] args) {
        //partial sort --> n/2 elements ko last se sort krna ascending order mein 
        int[] arr = {2,1,3,8,5,6,7};
        int n = arr.length;
        int k = n/2;
        int start = k + (n % 2);  //(n % 2) always --> 0 ya 1 return krega so, even-->K , odd-->k+1
          for(int i=start; i<n; i++){
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
