public class printOnetoTen {
    public static void main(String[] args) {
        int n = 1;             //initialization --> start point
        print(n);            //calling function (kitne hi functions kyu na bana le --> jab tk main function se call nhi krenge tb tk bo koi kaam ke nhi h)
    }
    public static void print(int n){
        if(n == 11) return;     //condition --> end point
        System.out.println(n);
        print(n+1);             //iteration --> steps (calling function with different parameter)
    }
}
