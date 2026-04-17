import java.util.HashSet;
import java.util.Scanner;

public class DuplicateHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //user se array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(ele) == true){
                System.out.println("Duplicate number is : " + ele);
            }
            else set.add(ele);
        }
        sc.close();
    }
}
