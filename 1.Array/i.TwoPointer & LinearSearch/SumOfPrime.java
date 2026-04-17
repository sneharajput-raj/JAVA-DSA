public class SumOfPrime {
      public static boolean isPrime(int m){   //m = arr[i]
        int count = 0;
        for(int i=1; i<=m; i++){
            if(m % i == 0) count++;
        }
        if(count == 2) return true;
        return false;
      }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(isPrime(arr[i]) == true){       //bar bar isPrime function call hoga with different i
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);
    }
}
