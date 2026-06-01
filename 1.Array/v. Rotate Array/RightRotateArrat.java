public class RightRotateArrat {
    public static void main(String[] args) {
        //rotate elements from right --> k times
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3; 
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;   //index of ans
        for(int i=n-k; i<n; i++){       //7-3=4  --> 4th index se n tk right elements 
            ans[j] = arr[i];
            j++;
        }
        for(int i=0; i<n-k; i++){      //remaining left elements --> 0 se 3 index tk
            ans[j] = arr[i];
            j++;
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
