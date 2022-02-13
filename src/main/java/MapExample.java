import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String... args) {

        Map<Integer, String> sportFoodBrandMap = new HashMap<>();
        sportFoodBrandMap.put(1, "Optimum Nutrition");
        sportFoodBrandMap.put(2, "Now Foods");
        sportFoodBrandMap.put(3, "EVL");
        sportFoodBrandMap.put(4, "CGN");
        sportFoodBrandMap.put(5, "Muscletech");
        System.out.println(sportFoodBrandMap.values());

        if (sportFoodBrandMap.containsKey(6)) {
            System.out.println("Key 6 is founded");
        }
        else {
            sportFoodBrandMap.put(6, "Dynamitze");
            System.out.println("Dynamitze added in sportFoodBrandMap");
            System.out.println(sportFoodBrandMap.entrySet());
        }

    }
}
