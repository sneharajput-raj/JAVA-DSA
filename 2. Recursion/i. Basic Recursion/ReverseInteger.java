public class ReverseInteger {
    public static void main(String[] args) {
        int n = 754801;
        int rev = 0;
        System.out.println(reverse(rev , n));
    }
    public static int reverse(int rev, int n){
        if(n == 0) return rev;
        return reverse(rev*10 + n%10 , n/10);    //function call with different parameter(updated values)
    }
}
