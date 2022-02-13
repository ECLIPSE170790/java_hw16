import java.util.Arrays;

public class ArrayExample {

    public static void main(String... args) {

        Double[] wheelDiameterArray = new Double[] {29.0, 26.0, 27.5};
        String[] bicycleArray = new String[] {"Cube", "GT", "Stels"};

        for (int i = 0; i < 2; i++) {
            System.out.println(bicycleArray[i] + " "+ wheelDiameterArray[i]);
        }

        System.out.println();

        for (String element : bicycleArray) {
            System.out.println(element);
        }

        System.out.println();
        System.out.println("Length of bicycleArray = " + bicycleArray.length);
        System.out.println();

        Arrays.sort(wheelDiameterArray);
        System.out.println("Sort alphabetically wheelDiameterArray - " + Arrays.toString(wheelDiameterArray));
    }
}
