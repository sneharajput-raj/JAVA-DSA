public class PrintSearch {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int rows = arr.length;
        int cols = arr[0].length;
        
        //print 2D array
        System.out.println("2D array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //sum of elements in array
        int sum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum = sum + arr[i][j];
            }
        } 
        System.out.println("Sum of elements: " + sum);


        //search target
        boolean check = false;
        int target = 10;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == target) check = true;
            }
        }
        System.out.println("Target found: " + check);
    }
}
