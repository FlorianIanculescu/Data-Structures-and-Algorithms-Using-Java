import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        System.out.println("\nintArray = " + Arrays.toString(intArray));
    }

    public static void bucketSort(int[] input) {

        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using a LinkedList for the buckets
            // buckets[i] = new LinkedList<>();

            // using a Vector for the buckets
            // buckets[i] = new Vector<>();

            // using an ArrayList for the buckets
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < input.length; i++) {

            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;

        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {

        return value / 10;
    }
}