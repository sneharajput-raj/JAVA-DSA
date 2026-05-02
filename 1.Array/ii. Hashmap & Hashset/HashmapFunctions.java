import java.util.HashMap;

public class HashmapFunctions {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("mango", 200);   //two  parameter --> key and value --> key is always unique --> value is a count of key
        map.put("apple" , 100);
        map.put("kiwi", 300);
        map.put("papaya", 100);
        map.put("apple", 400);   //this new will update

        map.putIfAbsent("mango" , 500);   //not add to map --> bcoz mango already presents
        System.out.println(map);   //print the map
        System.out.println(map.size());  //return size of map
        System.out.println(map.get("kiwi"));   //return value of the key
        System.out.println(map.containsKey("orange"));
        System.out.println(map.containsValue(100));
        System.out.println(map.isEmpty());
        System.out.println(map.remove("papaya", 100));
        System.out.println(map.getOrDefault("mango" , 600));  //key already present hai toh --> current value lega (jo map me already hai )
        System.out.println(map.getOrDefault("cherry" , 800));   // ye key present nhi h map mein toh --> default value(i.e.  800) lega
        System.out.println(map.replace("kiwi" , 1000));
    }
}
