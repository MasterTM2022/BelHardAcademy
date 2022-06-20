// сортирова слиянием с использованием сортировок выбора и вставки для подмассивов
// можно было рекурсивно сортировать и подмассивы (и их под-под-массивы), но хотелось
// в одной задачке убить трех зайцев...

package main.HomeWork.L5.L5_T2_SortMassive;

public class Merge_Insertion_Choice {

    public static void main(String[] args) {
        int[] array = {
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100),
                (int) (Math.random()*100)
        };

        String massBefore="";
        String massAfter="";
        String massAfter1="";
        String massAfter2="";

        for (int v : array) {
            massBefore = massBefore + v + "; ";
        }
        System.out.println("массив до:      " + massBefore);

//	      ****************************************** манипуляции сортировки слиянием
        int maxIndex = array.length;
        int lengthNewArray1;
        int lengthNewArray2 = maxIndex / 2;
        if (maxIndex%2==0) {
            lengthNewArray1 = maxIndex / 2;
        } else {
            lengthNewArray1 = maxIndex/ 2 + 1;
        }
        int[] array1 = new int[lengthNewArray1];
        int[] array2 = new int[lengthNewArray2];

        for (int i=0; i < maxIndex; i++) {
            if (i < lengthNewArray1) {
                array1[i] = array[i];
            } else {
                array2[i-lengthNewArray1] = array[i];
            }
        }
//                	      подсортировка по вставке

        int buf;
        for (int i=1; i < array1.length; i++) {
            buf = array1[i];
            if (array1[i] < array1[i-1]) {
                while (i > 0 && buf < array1[i-1]) {
                    array1[i] = array1[i-1];
                    i--;
                }
                array1[i] = buf;
            }
        }
// 			подсортирвока по выбору
        int maxIndex2 = array2.length-1;

        for (int j=0; j <= array2.length-1; j++) {
            int countMax = 0;
            int max = array2[countMax];
            for (int i=0; i <= maxIndex2; i++) {
                if (array2[i] > max) {
                    max = array2[i];
                    countMax = i;
                }
            }
            array2[countMax] = array2[maxIndex2];
            array2[maxIndex2] = max;
            maxIndex2--;
        }
//                посмотрим, что получилось в подмассивах

        for (int v : array1) {
            massAfter1 = massAfter1 + v + "; ";
        }
        System.out.println("1-ый подмассив: " + massAfter1);

        for (int v : array2) {
            massAfter2 = massAfter2 + v + "; ";
        }
        System.out.println("2-ый подмассив: " + massAfter2);

//          слияние подмассивов

        int z = 0;
        int i = 0;
        int j = 0;

        while (z < array.length) {
            if (i == array1.length) {
                array[z++] = array2[j++];
            } else if (j == array2.length) {
                array[z++] = array1[i++];
            } else if (array1[i] < array2[j]) {
                array[z++] = array1[i++];
            } else {
                array[z++] = array2[j++];
            }
        }

//	      ****************************************** конец манипуляций

        for (int v : array) {
            massAfter = massAfter + v + "; ";
        }
        System.out.println("массив после:   " + massAfter);
    }
}