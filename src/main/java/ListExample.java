import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String... args) {

        List<String> sportFoodList = new ArrayList<>();
        sportFoodList.add("Protein");
        sportFoodList.add("BCAA");
        sportFoodList.add("EAA");
        System.out.println(sportFoodList+" Size of sportFoodList = " + sportFoodList.size());
        sportFoodList.remove(1);
        System.out.println("sportFoodList without second element - " + sportFoodList);

        if (sportFoodList.contains("Casein")) {
            System.out.println("Casein found in sportFoodList");
        }
        else {
            sportFoodList.add(0, "Casein");
            System.out.println("Casein added in sportFoodList");
            System.out.println(sportFoodList);
        }

        System.out.println();
        System.out.println("sportFoodList before sort - " + sportFoodList);
        System.out.println();

        Collections.sort(sportFoodList);
        System.out.println("Sort alphabetically sportFoodList - " + sportFoodList);
        System.out.println();

        Collections.reverse(sportFoodList);
        System.out.println("Sort alphabetically in reverse order sportFoodList - " + sportFoodList);
    }
}
