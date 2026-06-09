public class PowerOrTwoThreeFour {
    public static void main(String[] args) {
        int n = 16;
        System.out.println("Is " + n + " power of Two : " +  powerOfTwo(n));
        System.out.println("Is " + n + " power of Three : " + powerOfThree(n));
        System.out.println("Is " + n + " power of Four : " + powerOfFour(n));
    }
    public static boolean powerOfTwo(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 2 !=  0) return false;
        return powerOfTwo(n/2);
    }
    public static boolean powerOfThree(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 3 != 0) return false;
        return powerOfThree(n/3);
    }
    public static boolean powerOfFour(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        if(n % 4 != 0) return false;
        return powerOfFour(n/4);
    }
}
