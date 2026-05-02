import java.util.HashMap;

public class ArrayHashMap {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,2,3,5,1,2,4,1,2};
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i] , map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }
}
