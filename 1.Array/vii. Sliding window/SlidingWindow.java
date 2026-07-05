public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,5,3,2,1,7,6,4};
        int k = 3;
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        //precompute   --> first slide (first k elements ka sum)
        for(int i=0; i<k; i++){
            sum = sum + arr[i];
        }
        max = sum;
        //now start form 2nd window
        for(int i=1; i<=n-k; i++){
            //shrink  (left se)
            sum = sum - arr[i-1];
            //expand (right se)
            sum = sum + arr[i+k-1];
            //update max
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
