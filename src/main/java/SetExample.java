import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String... args) {

        Set<String> sportBrandSet= new HashSet<>();

        sportBrandSet.add("Adidas");
        sportBrandSet.add("Nike");
        sportBrandSet.add("Reebok");
        sportBrandSet.add("Columbia");

        System.out.println(sportBrandSet);

        System.out.println("Size of sportBrandSet = " + sportBrandSet.size());

        sportBrandSet.removeAll(sportBrandSet);
        System.out.println("sportBrandSet after remove = " + sportBrandSet);

        sportBrandSet.add("Puma");
        sportBrandSet.add("Sony");
        sportBrandSet.add("Wrangler");
        System.out.println("sportBrandSet after add new elements = " + sportBrandSet);

        Set<String> sportBrandLinkedSet= new LinkedHashSet<>();
        sportBrandLinkedSet.addAll(sportBrandSet);
        System.out.println("sportBrandLinkedSet after add elements of sportBrandSet = " + sportBrandLinkedSet);

        Set<String> sportBrandTreeSet= new TreeSet<>();
        sportBrandTreeSet.addAll(sportBrandSet);
        System.out.println("sportBrandTreeSet after add elements of sportBrandSet = " + sportBrandTreeSet);

    }

}
