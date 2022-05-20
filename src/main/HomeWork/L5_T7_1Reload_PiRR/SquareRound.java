package L5_T7_1Reload_PiRR;

import java.util.Scanner;

public class SquareRound {
    public static void main(String[] args) {
        double result;
        Scanner in2 = new Scanner(System.in);
        int n = 0;
        while (n == 0){
            n = query();
        }
        if (n == 1) {
            System.out.println("Укажите радиус:");
            double r = in2.nextDouble();
            result = SquareRound.func(r);
        } else {
            System.out.println("Укажите диаметр:");
            double d = in2.nextDouble();
            result = SquareRound.func(d, true);
        }
        System.out.println("Площадь круга равна " + result);
        in2.close();

    }

     static int query() {
        System.out.println("Если считаем площадь через радиус, ведите 1, если диаметр - 2:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            System.out.println("Неверно, повторите ввод");
            return 0;
        }
    }


    static double func(double r) {
        double result = Math.PI * r * r;
        return (double) result;
    }

    static double func(double d, boolean what) {
        double result = Math.PI * d * d / 4;
        return result;
    }
}