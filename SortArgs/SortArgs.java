import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        for (int number : numbers) {
            if (number != numbers[numbers.length - 1]) {
                System.out.print(number);
            } else {
                System.out.println(number + " ");
            }
        }
    }
}