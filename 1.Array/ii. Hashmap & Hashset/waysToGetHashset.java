import java.util.*;
public class waysToGetHashset {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,1,8,9,0,2,3,7,2};

        //for loop       --> used in INDEXED DS like array -->index no pr based
        Set<Integer> set1 = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set1.add(arr[i]);
        }
        System.out.println(set1);



        //for-each       --> used in NON-INDEXED DS like linkedlist, stack, queue --> direct element ko access
        Set<Integer> set2 = new HashSet<>();
        for(int x : arr){
            set2.add(x);
        }
        System.out.println(set2);
    }
}
