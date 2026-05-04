import java.util.Scanner;

public class PalindromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkPalindrome(arr));
      sc.close();
    }
    public static boolean checkPalindrome(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            if(arr[low] != arr[high]) return false;
            low++;
            high--;
        }
        return true;
    }
}
