import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();   //Simple Hashset -->no overwrite(no duplicate value) -->maintain sequence(sorted)
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(2);
        set1.add(1);
        System.out.println(set1);
        System.out.println(set1.contains(5));
       // System.out.println(set1.remove(2));
        System.out.println(set1.size());

        int[] arr = {9,3,2,6,4,2,7,1,2,0,5,9,4};

        Set<Integer> set2 = new TreeSet<>();        //SORTED --> no duplicate element
        Set<Integer> set3 = new LinkedHashSet<>();  //ORDER(arival) --> no duplicate
        for(int ele : arr){
            set2.add(ele);
            set3.add(ele);
        }
        System.out.println(set2);
        System.out.println(set3);
    }
}
