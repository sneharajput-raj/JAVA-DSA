public class MiddleRotateArr {
    public static void main(String[] args) {
        //rotate middle elements --> k times
        int[] arr = {2,5,6,0,7,1,3,2,9};
        int n = arr.length;
        int k = 5;     //k times rotate
        int[] ans = new int[n];
        int j = 0;
        int x = (n-k)/2;
        for(int i=x; i<x+k; i++){   //middle elements
            ans[j] = arr[i];
            j++;
        }
        for(int i=0; i<x; i++){     //aghe ke elements
            ans[j] = arr[i];
            j++;
        }
        for(int i=x+k; i<n; i++){    //piche ke elements
            ans[j] = arr[i];
            j++;
        }
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
