public class ComputeArray {
    public static int[] computeArray(int[] array) {
        var result = new int[array.length];
        for (var i = 0; i < array.length; i++) {
            result[i] = array[i] * 2;
        }
        return result;
    }
}