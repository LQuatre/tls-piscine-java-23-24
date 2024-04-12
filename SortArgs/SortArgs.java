import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}