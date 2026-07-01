public class DigonalSum {
    public static void main(String[] args) {
        int nums[][] = {{1,2,3,}, {4,5,6}, {7,8,9}};
        int rows = nums.length;
        int cols = nums[0].length;
        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(i == j || i+j == rows-1) sum = sum + nums[i][j];
            }
        }
        System.out.println(sum);
    }
}
