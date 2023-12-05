package d2;

import java.util.Arrays;

public class Sorting {
    // 인접한 두 원소를 비교하면서
    // 더 큰 원소를 오른쪽으로 차례대로 이동시킨다.
    public static void bubbleSort(int[] array) {
        // 자주 사용하는 변수
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                // j와 j + 1을 비교한다.
                if (array[j] > array[j + 1]) {
                    // 더 크면 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("round " + i + ": " + Arrays.toString(array));
        }
    }



    public static void main(String[] args) {
        int[] array = {36, 12, 18, 15, 41, 19};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
