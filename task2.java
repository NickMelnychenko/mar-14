public class task2 {
    public static int findDominant(int[] array) {
        int n = array.length;
        int threshold = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > threshold) {
                return array[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 5, 1};

        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }
}
