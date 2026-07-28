public class Main {
    public static void main(String[] args) {
        //Hashmap = A data Structure that stores key-value pairs
        // Key are unique, but Values can be duplicated
        // Does not maintain any order, but is memory efficient
        // Hashmap <Key, Value>

        Hashmap<String, Double> map = new Hashmap<>();


        map.put("Apple", 10);
        map.put("Banana", 40);
        map.put("Orange", 15);
        map.put("Coconut", 120);
        //map.remove("Coconut");

        System.out.println(map);
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.get("Orange"));
        System.out.println(map.containsValue(120));
        System.out.println(map.size());
        if(map.containsKey("Apple")){
            System.out.println(map.get("Apple"));
        } else {
            System.out.println("Key not found");
        }


        for (String key: map.keySet()){
            System.out.println(key + " :$"+ map.get(key));
        }
    }
}