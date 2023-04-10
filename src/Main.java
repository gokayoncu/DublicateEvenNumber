import java.util.Arrays;

public class Main {
    static boolean isFind(int arr[], int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5,8,7,4,8,6,2,1,4,5,3,2,1,5,8};
        int[]dublicate = new int[array.length];
        int starIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j] && array[i] % 2 == 0) {
                    if (!isFind(dublicate, array[i])) {
                        dublicate[starIndex++] = array[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}