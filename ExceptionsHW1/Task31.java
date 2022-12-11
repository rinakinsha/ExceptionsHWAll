package ExceptionsHW1;

import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
не равны, необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать) */

public class Task31 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 5, 4, 3, 2, 1 };

        System.out.println(Arrays.toString(difference(arr1, arr2)));
    }

    private static int[] difference(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не должен быть равен null");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов должны быть одинаковы");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
