package L5_T1_MaxMinAvg;
public class MaxMinAverage {
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
            };
            int min=array[0];
            int max=array[0];
            int sum = 0;
            int count = 0;
            String mass = "";
            for (int i : array) {
                mass = mass + i + "; ";
                if (min > i) {
                    min = i;
                } else if
                (max < i) {
                    max = i;
                }
                sum += i;
                ++count;
            }
            System.out.println("массив: " + mass);
            System.out.println("максимум = " + max);
            System.out.println("минимум = " + min);
            System.out.println("среднее = " + String.format("%.2f", (double) sum / count));
            System.out.println("сумма = " + sum);
        }

}