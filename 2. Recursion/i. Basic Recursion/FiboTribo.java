public class FiboTribo {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci num.: " + fibonacci(n));
        System.out.println("Tribonacci num.: " + tribonacci(n)); 
    }
    public static int fibonacci(int n){
        if(n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int tribonacci(int n){
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }
}
