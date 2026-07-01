public class PrimeElementSum {
    public static boolean isPrime(int x){
        int count = 0;
        for(int i=1; i<=x; i++){
            if(x % i == 0) count++;
        }
        return count==2;
    }
    public static void main(String[] args) {
        int[][] nums = {{9,8,7}, {6,5,4}, {3,2,1}};
        int rows = nums.length;
        int cols = nums[0].length;
        int sum = 0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(isPrime(nums[i][j]) == true){
                    sum = sum + nums[i][j];
                }
            }
        }
        System.out.println("Sum of prime elements in 2D array: " + sum);
    }
}
