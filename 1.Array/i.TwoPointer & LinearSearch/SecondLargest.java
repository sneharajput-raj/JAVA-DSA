import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(secondMax(arr));
      sc.close();
    }
     public static int secondMax(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];      //last element of sorted array will be the largest
        for(int i=n-1; i>=0; i--){
            if(arr[i] != max){
               return arr[i];
            }
        }
        return -1;        //10  10  10 --> smax nhi h then it returns -1
    }
}
