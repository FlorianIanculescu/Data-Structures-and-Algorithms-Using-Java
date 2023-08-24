import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(intArray);

        System.out.println("\nintArray = " + Arrays.toString(intArray));
    }
}