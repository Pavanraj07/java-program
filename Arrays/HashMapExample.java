package Arrays;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String , Integer> m = new HashMap<>();

        //Add elements to the map
        m.put("Pavan" , 10);
        m.put("Anvesh" , 20);
        m.put("Prem" , 30);
        m.put("Paresh" , 40);

        
        // Check for a Value
        if (m.containsValue(10))
            System.out.println("Yes");
        else
            System.out.println("No");
       
        // Get value corresponding to passed key
        // <"ide", 15>
        System.out.println(m.get("Paresh"));
       
        // The given key is absent
        System.out.println(m.get("Anvesh"));
    }
}
