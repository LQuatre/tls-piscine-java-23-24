public class ComputeArray {
    public static int[] computeArray(int[] array) {
        var result = new int[array.length];
        for (var i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                result[i] = array[i] * 5;
            } else if (array[i] % 3 == 1) {
                result[i] = array[i] + 7;
            } else {
                result[i] = array[i];
            }
        }
        return result;
    }
}