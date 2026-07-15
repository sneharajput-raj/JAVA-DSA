
public class ReverseOdd {
        public static int oddReverse(int n , int rev){
            if(n == 0) return rev;
            if((n%10) % 2 != 0){
                return oddReverse(n/10, rev*10+n%10);
            }
            else{
                return oddReverse(n/10, rev);
            }
        }
        public static void main(String[] args) {
            int n =12345;
            int rev = 0;
            System.out.println(oddReverse(n, rev));
        }
}