public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        int n = 121;
        int rev = 0;
        System.out.println(reverse(rev, n, n));
    }
    public static boolean reverse(int rev, int n, int dummy){
        if(n == 0) return rev == dummy;
        return reverse(rev*10 + n%10, n/10, dummy);
    }
}
