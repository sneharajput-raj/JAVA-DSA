import java.util.Scanner;

public class Armstrong {
    public static int digitCount(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static int power(int a, int b){
        int ans = 1;
        for(int i=1; i<=b; i++){
            ans = ans * a;
        }
        return ans;
    }
    public static boolean checkArm(int n){
        int dc = digitCount(n);
        int sum = 0;
        int dummy = n;
        while(n > 0){
            int ld = n % 10;
            sum = sum + power(ld , dc);
            n = n/10;
        }
        return sum == dummy;
    }

    //print all armstrong numbers between lowerRange to upperRange
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lr = sc.nextInt();
        int ur = sc.nextInt();
        for(int i=lr; i<=ur; i++){
            if(checkArm(i) == true){
                System.out.println(i);
            }
        }
     sc.close();
    }
}
