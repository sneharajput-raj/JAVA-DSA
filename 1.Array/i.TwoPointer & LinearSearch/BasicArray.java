public class BasicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
                  // 0 1 2 3 4
        int n = arr.length;
        //linear search
        int target = 7;
        //traverse
        boolean check = false;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                check = true; 
                break;
            }
        }
        System.out.print(check);
    }
}
