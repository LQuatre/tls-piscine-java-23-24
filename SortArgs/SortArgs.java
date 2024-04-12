import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        int[] numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); // merci stackoverflow
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.println(numbers[i]);
            }
        }
        if (numbers.length == 0) {
            System.out.println();
        }
    }
}