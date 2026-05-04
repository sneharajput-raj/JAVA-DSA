import java.util.HashMap;

public class MajorityEleHashMap {
    public static void main(String[] args) {
               //majority element n/2
        int[] arr = {2,2,3,3,2,2,3};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr){        //for-each loop --> for each element of array
            map.put(ele, map.getOrDefault(ele , 0) +1);
        }
        //traverse in Map
        for(int key : map.keySet()){    //for each key of map 
            if(map.get(key) > n/2){
                System.out.println(key);
            }
        }
    }
}
