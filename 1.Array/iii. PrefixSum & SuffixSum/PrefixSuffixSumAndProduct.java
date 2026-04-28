public class PrefixSuffixSumAndProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        //prefix sum
        int[] pre = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            pre[i] = sum;
        }

        //Suffix sum
        int[] suff = new int[n];
        sum = 0;
        for(int i=n-1; i>=0; i--){
            sum = sum + arr[i];
            suff[i] = sum;
        }

        //product of array
        int[] prod = new int[n];
        for(int i=0; i<n; i++){
            prod[i] = pre[i] * suff[i];
        }

        //print
        for(int i=0; i<n; i++){
            System.out.print(pre[i] + " ");
        }
        System.out.println();
         for(int i=0; i<n; i++){
            System.out.print(suff[i] + " ");
        }
        System.out.println();
         for(int i=0; i<n; i++){
            System.out.print(prod[i] + " ");
        }
    }
}
