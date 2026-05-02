import java.util.*;
public class HashMapTypes {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple" , 100);
        map.put("mango" , 200);
        map.put("kiwi" , 300);
        map.put("cherry" , 100);
        map.put("papaya" , 50);
        System.out.println(map);
        Map<String, Integer> map1 = new LinkedHashMap<>();  //ordered
        map1.put("pen", 10);
        map1.put("pencil", 20);
        map1.put("highlighter", 40);
        map1.put("copy", 100);
        System.out.println(map1);

        Map<String, Integer> map2 = new TreeMap<>();      //sorted
        map2.put("pen", 10);
        map2.put("pencil", 20);
        map2.put("highlighter", 40);
        map2.put("copy", 100);
        System.out.println(map2);
    }
}
