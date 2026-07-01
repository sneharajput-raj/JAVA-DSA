public class CountPrimeRow {
    //number of rows with prime sum 
    public static boolean isPrime(int sum){
        int count = 0;
        for(int i=1; i<=sum; i++){
            if(sum % i == 0) count++;
        }
        return count==2;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {4,5,6}, {7,3,9}, {10,11,12}};
        int rows = arr.length;
        int cols = arr[0].length;
        int count = 0;

        for(int i=0; i<rows; i++){
            int sum = 0;
            for(int j=0; j<cols; j++){
                sum = sum + arr[i][j];
            }
            if(isPrime(sum) == true) count++;
        }
        System.out.println("Number of rows with prime sum: " + count);
    }
}
