public class task3 {
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;

        positions = positions % n;
        int[] result = new int[n];
        for (int i = 0; i < positions; i++) {
            result[i] = array[n - positions + i];
        }
        for (int i = 0; i < n - positions; i++) {
            result[positions + i] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        System.out.println(java.util.Arrays.toString(rotateArray(array1, 2)));
        System.out.println(java.util.Arrays.toString(rotateArray(array2, 0)));
    }
}
