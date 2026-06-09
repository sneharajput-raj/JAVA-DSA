public class Factor {
    public static void main(String[] args) {
        int n = 15;
        int i = 1;
        System.out.println("Count: " + countFactor(n,i));
        System.out.println("Factors: ");
        printFactor(n,i);
    }
    public static int countFactor(int n, int i){
        if(i > n) return 0;        //base case
        if(n % i == 0) return 1 + countFactor(n, i+1);   //factor found
        return countFactor(n, i+1);    //not a factor
    }
    public static void printFactor(int n, int i){
        if(i > n) return;
        if(n % i == 0) System.out.print(i + " ");
        printFactor(n, i+1);
    }
}
