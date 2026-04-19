public class maxOfArr {
    public static void main(String[] args) {
        int[] arr = {12, 19, 21, 28, 10};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print("The maximum element of the array is: " + max);
    }
}
