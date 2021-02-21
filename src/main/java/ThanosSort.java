public class ThanosSort {
    public static int[] thanossort(int[] array, int low, int high) {
        if (high - low == 0) {
            System.out.print("Введен пустой массив!");
            return array;
        }
        if (high - low  == 1) {
            return array;
        }
        float average = 0;
        for (int i = low; i < high; ++i) {
            average += array[i];
            if (i == high - 1) {
                average /= high - low;
            }
        }
        int[] boxArray = new int[high - low];
        int count = low;
        int left = 0;
        int right = high - low;
        int countlow = 0;
        int limit = low;
        while (count <= high - 1) {
            if (array[count] <= average) {
                boxArray[left] = array[count];
                left++;
                ++limit;
                countlow++;
            } else {
                boxArray[right - 1] = array[count];
                --right;
            }
            count++;
        }
        left = 0;
        for (int i = low; i < high; i++) {
            array[i] = boxArray[left];
            left++;
        }
        if (countlow < high - low) {
            thanossort(array, low, limit);
            thanossort(array, limit, high);
        }
        return array;
    }
}
