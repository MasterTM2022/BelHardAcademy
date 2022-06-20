package main.HomeWork.L5.L5_T4_MassMinusMass;

import java.util.Arrays;

public class MassMinusMass {
    public static void main(String[] args) {
        int array1Size = 50;
        int array2Size = 50;

        int[] array1 = new int[array1Size];
        int[] array2 = new int[array2Size];

        MassMinusMass.fillArray(array1);
        System.out.println("массив:" + Arrays.toString(array1));

        MassMinusMass.fillArray(array2);
        System.out.println("массив:" + Arrays.toString(array2));

        int count=0;
        int z;

        boolean flag;

        for (int i : array1) {
            flag = true;
            z = 0;
            while (flag && z < array2.length) {
                if (i == array2[z++]) {
                    flag = false;
                    }
                }
            if (flag) {
                count++;
                }
        }

        int[] array3 = new int[count];
        int i;
        z = 0;

        for (i = 0; i < array1.length; i++) {
            flag = true;
            int j = 0;
            while (flag && j < array2.length) {
                if (array1[i] == array2[j++]) {
                    flag = false;
                    }
                }
            if (flag) {
                array3[z++] = array1[i];
                }
        }

        System.out.println("массив:" + Arrays.toString(array3));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}