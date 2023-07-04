import java.util.Arrays;

public class Main {
    public static int[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] / array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 8, 12};
        int[] array2 = {2, 4, 6};

        try {
            int[] result = divideArrays(array1, array2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}